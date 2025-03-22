package com.java.domainstore.BE.dao;

import com.java.domainstore.BE.model.PaymentStatusEnum;
import com.java.domainstore.BE.model.TransactionInfoModel;
import com.java.domainstore.BE.model.TransactionModel;
import com.java.domainstore.BE.repository.JDBC;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TransactionDAO implements DAOInterface<TransactionModel> {

    public static TransactionDAO getInstance() {
        return new TransactionDAO();
    }

    @Override
    public int insert(TransactionModel transaction) {
        int rowsAffected = 0;
        try {
            // Bước 1: Mở kết nối đến database
            Connection con = JDBC.getConnection();

            // Bước 2: Chuẩn bị câu lệnh để chèn dữ liệu
            String sql = "INSERT INTO transactions(id, user_id, transaction_date)"
                    + " VALUES(?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            // Bước 3: Gán giá trị cho các tham số 
            pst.setString(1, transaction.getTransactionId());
            pst.setInt(2, transaction.getUserId());
            pst.setDate(3, Date.valueOf(transaction.getTransactionDate()));

            // Bước 4: Thực thi câu lệnh INSERT và lấy số dòng bị ảnh hưởng
            rowsAffected = pst.executeUpdate();
            for(TransactionInfoModel ti : transaction.getTransactionInfos()){
                TransactionInfoDAO.getInstance().insert(ti);
                rowsAffected++;
            }
            // Bước 5: Đóng kết nối
            System.out.println("Thêm dữ liệu thành công !! Có " + rowsAffected + " thay đổi");
            JDBC.closeConnection(con);
            pst.close();
        } catch (SQLException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return rowsAffected;
    }

    @Override
    public int update(TransactionModel transaction) {
        int rowsAffected = 0;
        try {
            // Bước 1: Mở kết nối đến database
            Connection con = JDBC.getConnection();

            // Bước 2: Chuẩn bị câu lệnh để cập nhật dữ liệu
            String sql = "UPDATE transactions "
                    + "SET user_id = ?,transaction_date = ? "
                    + "WHERE id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);

            // Bước 3: Gán giá trị cho các tham số 
            pst.setInt(1, transaction.getUserId());
            pst.setDate(2, java.sql.Date.valueOf(transaction.getTransactionDate()));
            pst.setString(3, transaction.getTransactionId());
            // Bước 4: Thực thi câu lệnh UPDATE và lấy số dòng bị ảnh hưởng
            rowsAffected = pst.executeUpdate();
            System.out.println("Cập nhật dữ liệu thành công !! Có " + rowsAffected + " thay đổi");
            // Bước 5: Đóng kết nối 
            JDBC.closeConnection(con);
            pst.close();
        } catch (SQLException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return rowsAffected;
    }

    @Override
    public int delete(TransactionModel transaction) {
        int rowsAffected = 0;
        try {
            // Bước 1: Mở kết nối đến database
            Connection con = JDBC.getConnection();

            // Bước 2: Chuẩn bị câu lệnh để xoá dữ liệu
            String sql = "DELETE FROM transactions"
                    + " WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            // Bước 3: Gán giá trị id
            pst.setString(1, transaction.getTransactionId());

            // Bước 4: Thực thi câu lệnh UPDATE và lấy số dòng bị ảnh hưởng
            rowsAffected = pst.executeUpdate();
            System.out.println("Xoá dữ liệu thành công !! Có " + rowsAffected + " thay đổi");
            // Bước 5: Đóng kết nối 
            JDBC.closeConnection(con);
            pst.close();
        } catch (SQLException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return rowsAffected;
    }

    @Override
    public TransactionModel selectById(TransactionModel transaction) {
        TransactionModel t = new TransactionModel();
        try {
            // Bước 1: Mở kết nối đến database
            Connection con = JDBC.getConnection();
            // Bước 2: Chuẩn bị câu lệnh SQL để truy vấn dữ liệu
            String sql = "SELECT ts.id transactions_id, ts.user_id, ts.transaction_date,"
                    + "tsi.domain_id, tsi.price, d.years, p.payment_status, p.payment_date"
                    + " FROM transactions ts "
                    + "join transactions_info tsi on ts.id = tsi.transactions_id "
                    + "join domains d on tsi.domain_id = d.id "
                    + "join paymenthistory p on ts.id = p.transaction_id "
                    + "WHERE transactions_id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, transaction.getTransactionId());

            // Bước 3: Thực thi truy vấn và nhận kết quả
            ResultSet rs = pst.executeQuery();

            // Bước 4: Duyệt qua kết quả và xử lý dữ liệu
            while (rs.next()) {
                // Lấy dữ liệu từ ResultSet
                if (t.getTransactionInfos().isEmpty()) {
                    t.setTransactionId(rs.getString("transactions_id"));
                    t.setUserId(rs.getInt("user_id"));
                    t.setTransactionDate(rs.getDate("transaction_date").toLocalDate());
                    t.setTotalCost(0);
                    t.setPaymentStatus(PaymentStatusEnum.valueOf(rs.getString("payment_status").toUpperCase()));
                }
                TransactionInfoModel tsi = new TransactionInfoModel(rs.getString("transactions_id"),
                        rs.getInt("domain_id"), rs.getInt("price"));
                t.setTotalCost(t.getTotalCost() + tsi.getPrice());
                t.getTransactionInfos().add(tsi);
            }
            // Bước 5: Đóng kết nối 
            JDBC.closeConnection(con);
            pst.close();
        } catch (SQLException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return t;
    }

    @Override
    public ArrayList<TransactionModel> selectAll() {
        ArrayList<TransactionModel> listTransaction = new ArrayList<>();
        TransactionModel t = new TransactionModel();
        try {
            // Bước 1: Mở kết nối đến database
            Connection con = JDBC.getConnection();

            // Bước 2: Chuẩn bị câu lệnh SQL để truy vấn dữ liệu
            String sql = "SELECT ts.id transactions_id, ts.user_id, ts.transaction_date,"
                    + "tsi.domain_id, tsi.price, d.years, p.payment_status, p.payment_date"
                    + " FROM transactions ts "
                    + "join transactions_info tsi on ts.id = tsi.transactions_id "
                    + "join domains d on tsi.domain_id = d.id "
                    + "join paymenthistory p on ts.id = p.transaction_id "
                    + "ORDER BY ts.id;";
            PreparedStatement pst = con.prepareStatement(sql);

            // Bước 3: Thực thi truy vấn và nhận kết quả
            ResultSet rs = pst.executeQuery();

            // Bước 4: Duyệt qua kết quả và xử lý dữ liệu
            while (rs.next()) {
                int check = 0;
                TransactionInfoModel tsi = new TransactionInfoModel(rs.getString("transactions_id"),
                        rs.getInt("user_id"), rs.getInt("price"));
                for (TransactionModel tran : listTransaction) {
                    if (tran.getTransactionId().equals(rs.getString("transactions_id"))) {
                        tran.setTotalCost(tran.getTotalCost() + tsi.getPrice());
                        tran.getTransactionInfos().add(tsi);
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    t.setTransactionId(rs.getString("transactions_id"));
                    t.setUserId(rs.getInt("user_id"));
                    t.setTransactionDate(rs.getDate("transaction_date").toLocalDate());
                    t.setPaymentStatus(PaymentStatusEnum.valueOf(rs.getString("payment_status").toUpperCase()));
                    t.setTotalCost(tsi.getPrice());
                    t.getTransactionInfos().add(tsi);
                    listTransaction.add(t);
                }
            }
            // Bước 5: Đóng kết nối 
            JDBC.closeConnection(con);
            pst.close();
        } catch (SQLException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return listTransaction;
    }

    @Override
    public ArrayList<TransactionModel> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

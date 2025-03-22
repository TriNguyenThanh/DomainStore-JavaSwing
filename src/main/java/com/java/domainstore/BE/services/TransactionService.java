
package com.java.domainstore.BE.services;

import com.java.domainstore.BE.dao.TransactionDAO;
import com.java.domainstore.BE.dao.TransactionInfoDAO;
import com.java.domainstore.BE.model.DomainModel;
import com.java.domainstore.BE.model.PaymentStatusEnum;
import com.java.domainstore.BE.model.TransactionInfoModel;
import com.java.domainstore.BE.model.TransactionModel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class TransactionService {
    private final ArrayList<TransactionModel> transactions= TransactionDAO.getInstance().selectAll();
    private final TransactionDAO transactionDAO = new TransactionDAO();
    private final TransactionInfoDAO transactionInfoDAO = new TransactionInfoDAO();
    
    // tạo id
    public String generateTransactionId(){
        if(transactions.isEmpty()) return "HD001"; 
        String lastId = transactions.get(transactions.size()-1).getTransactionId();
        int number = Integer.parseInt(lastId.substring(2));
        return String.format("HD%03d", number+1);
    }
    // Tạo giao dịch mới
    public TransactionModel createTransaction(Integer userId, LocalDate transactionDate, 
            ArrayList<DomainModel> domains){
        TransactionModel t = new TransactionModel();
        TransactionInfoModel ti = new TransactionInfoModel();
        Integer totalCost = null;
        String transactionId = generateTransactionId(); 
        ti.setTransactionId(transactionId);
        for(DomainModel d : domains){
            int pricePerYear = d.getTopLevelDomainbyId(d.getId()).getPrice();
            int price = d.getYears() * pricePerYear;
            totalCost += price;
            ti.setDomainId(d.getId());
            ti.setPrice(price);
            t.getTransactionInfos().add(ti);
//            transactionInfoDAO.insert(ti);
        }
        t = new TransactionModel(transactionId, userId, transactionDate, 
                PaymentStatusEnum.FAILED, totalCost);
//        transactionDAO.insert(t);
        return t;
    }
    // Lấy thông tin của một giao dịch
    public TransactionModel getTransactionById(String transactionId){
        return transactionDAO.selectById(new TransactionModel(transactionId, null, null, null));
    }
    // Lấy danh sách giao dịch của một người dùng
    public ArrayList<TransactionModel> getUserTransactions(Integer userId){
        ArrayList<TransactionModel> listTransaction = new ArrayList<>();
        for(TransactionModel t : transactions){
            if(Objects.equals(t.getUserId(), userId)) listTransaction.add(t);
        }
        return transactions;
    }
    
    // lưu giao dịch
    public void saveTransaction(TransactionModel t){
        transactionDAO.insert(t);
        for(TransactionInfoModel ts : t.getTransactionInfos()){
            transactionInfoDAO.insert(ts);
        }
    }
}

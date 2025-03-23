package com.java.domainstore.BE.dao;

import com.java.domainstore.BE.model.DomainModel;
import com.java.domainstore.BE.model.DomainModel.DomainStatusEnum;
import com.java.domainstore.BE.repository.JDBC;

import java.sql.*;
import java.util.ArrayList;

public class DomainDAO implements DAOInterface<DomainModel> {

    public static DomainDAO getInstance() {
        return new DomainDAO();
    }

    @Override
    public int insert(DomainModel domain) {
        String sql = "INSERT INTO domains (domain_name, tld_id, status, active_date, years, owner_id, created_at) VALUES (?, ?, ?, ?, ?, ?, NOW())";
        try (Connection con = JDBC.getConnection();
             PreparedStatement pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pst.setString(1, domain.getDomainName());
            pst.setInt(2, domain.getTldId());
            pst.setString(3, domain.getStatus().name().toLowerCase());
            pst.setDate(4, domain.getActiveDate());
            pst.setInt(5, domain.getYears());

            if (domain.getOwnerId() != null) {
                pst.setInt(6, domain.getOwnerId());
            } else {
                pst.setNull(6, Types.INTEGER);
            }

            int result = pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            if (rs.next()) {
                domain.setId(rs.getInt(1));
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(DomainModel domain) {
        String sql = "UPDATE domains SET domain_name=?, tld_id=?, status=?, active_date=?, years=?, owner_id=? WHERE id=?";
        try (Connection con = JDBC.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, domain.getDomainName());
            pst.setInt(2, domain.getTldId());
            pst.setString(3, domain.getStatus().name().toLowerCase());
            pst.setDate(4, domain.getActiveDate());
            pst.setInt(5, domain.getYears());

            if (domain.getOwnerId() != null) {
                pst.setInt(6, domain.getOwnerId());
            } else {
                pst.setNull(6, Types.INTEGER);
            }

            pst.setInt(7, domain.getId());
            return pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(DomainModel domain) {
        String sql = "DELETE FROM domains WHERE id=?";
        try (Connection con = JDBC.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, domain.getId());
            return pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public DomainModel selectById(DomainModel domain) {
        String sql = "SELECT * FROM domains WHERE id=?";
        try (Connection con = JDBC.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, domain.getId());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return new DomainModel(
                        rs.getInt("id"),
                        rs.getString("domain_name"),
                        rs.getInt("tld_id"),
                        DomainStatusEnum.valueOf(rs.getString("status").toUpperCase()),
                        rs.getDate("active_date"),
                        rs.getInt("years"),
                        rs.getObject("owner_id") != null ? rs.getInt("owner_id") : null,
                        rs.getDate("created_at")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<DomainModel> selectAll() {
        ArrayList<DomainModel> domains = new ArrayList<>();
        String sql = "SELECT * FROM domains";
        try (Connection con = JDBC.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                domains.add(new DomainModel(
                        rs.getInt("id"),
                        rs.getString("domain_name"),
                        rs.getInt("tld_id"),
                        DomainStatusEnum.valueOf(rs.getString("status").toUpperCase()),
                        rs.getDate("active_date"),
                        rs.getInt("years"),
                        rs.getObject("owner_id") != null ? rs.getInt("owner_id") : null,
                        rs.getDate("created_at")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return domains;
    }

    @Override
    public ArrayList<DomainModel> selectByCondition(String condition) {
        ArrayList<DomainModel> domains = new ArrayList<>();
        String sql = "SELECT * FROM domains WHERE " + condition;
        try (Connection con = JDBC.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                domains.add(new DomainModel(
                        rs.getInt("id"),
                        rs.getString("domain_name"),
                        rs.getInt("tld_id"),
                        DomainStatusEnum.valueOf(rs.getString("status").toUpperCase()),
                        rs.getDate("active_date"),
                        rs.getInt("years"),
                        rs.getObject("owner_id") != null ? rs.getInt("owner_id") : null,
                        rs.getDate("created_at")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return domains;
    }
}

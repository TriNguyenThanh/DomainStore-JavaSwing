package com.java.domainstore.BE.services;

import com.java.domainstore.BE.dao.CustomerDAO;
import com.java.domainstore.BE.model.CustomerModel;
import com.java.domainstore.utils.PasswordUtils;

public class LoginServices {
    public int authentication(String username, String password) {
        
        // b1: tìm trong database xem có user nào có username này hay không. Username là số điện thoại
        // nếu có thì qua b2, không thì return ""
        
        // b2: lấy mã salt trong database rồi băm password ra hash code rồi so sánh với hash code của user
        // nếu đúng thì return ID
        
        // Tìm khách hàng theo username (số điện thoại)
        CustomerDAO customerDAO = new CustomerDAO();
        CustomerModel customer = customerDAO.selectByPhone(username);

        if (customer == null) {
            return -1;
        }

        // Lấy salt từ database
        String Password = customer.getPasswordHash();
        if (Password == null) { 
            return -1;
        }

        // Hash mật khẩu 
        String hashedPassword = PasswordUtils.hashedPassword(password);

        // Kiểm tra với hash_code trong database
        if (hashedPassword.equals(customer.getPasswordHash())) {
            return customer.getId();
        }
        return -1;
    }
}
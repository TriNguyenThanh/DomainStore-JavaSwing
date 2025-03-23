package com.java.domainstore.BE.services;

import com.java.domainstore.BE.dao.CustomerDAO;
import com.java.domainstore.BE.model.CustomerModel;
import com.java.domainstore.utils.PasswordUtils;
import java.sql.Date;
public class RegisterServices {
    
    public boolean addToDB(String name, String phone, String email, String psID, String pass) {
        // them khach hang moi vao database
        // them thanh cong thi tra ve true
        // them that bai thi tra ve false
        
        CustomerDAO customerDAO = CustomerDAO.getInstance();
         // Kiểm tra xem số điện thoại đã tồn tại chưa
        if(customerDAO.selectByPhone(phone) != null){
             return false;
        }
              
        //hash password
        String hashedPassword = PasswordUtils.hashedPassword(pass);
        
        // Tạo đối tượng khách hàng
        CustomerModel newCustomer = new CustomerModel(name ,email, phone,  psID, hashedPassword, CustomerModel.Role.user);
         
        // Thêm vào database
        int result = customerDAO.insert(newCustomer);
        
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }
    
}

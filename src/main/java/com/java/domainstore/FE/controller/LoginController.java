package com.java.domainstore.FE.controller;

import com.java.domainstore.BE.model.UserSession;
import com.java.domainstore.FE.model.LoginModel;

public class LoginController {
    public int verify(LoginModel data) {
        if (data.getUsername().isBlank()) return 1;
        if (data.getPassword().isBlank()) return 2;
        
        LoginServices loginsv = new LoginServices();
        String userID = loginsv.authentication(data.getUsername(), data.getPassword());
        if (!userID.isBlank()) {
            UserSession.getInstance().setUser(userID);
            return 0;
        }
        return 3;
    }
}
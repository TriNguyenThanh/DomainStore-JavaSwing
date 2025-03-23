package com.java.domainstore.FE.controller;

import com.java.domainstore.FE.model.UserSession;
import java.util.ArrayList;
import java.util.List;

public class LoginController {

    public List<Integer> verify(String username, char[] password) {
        List<Integer> errList = new ArrayList<>();
        String pass = new String(password);
        if (username.isBlank()) {
            errList.add(1);
        }
        if (pass.isBlank()) {
            errList.add(2);
        }
        if (!errList.isEmpty()) {
            return errList;
        }
//        LoginServices loginsv = new LoginServices();
//        String userID = loginsv.authentication(data.getUsername(), data.getPassword());
//        if (!userID.isBlank()) {
//            UserSession.getInstance().setUser(userID);
//            return 0;
//        }
        if (username.equals("a") && pass.equals("a")) {
            UserSession.login("KH001", "admin");
            return errList;
        } else {
            errList.add(3);
            return errList;
        }

    }
}

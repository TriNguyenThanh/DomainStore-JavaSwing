package com.java.domainstore.ThanhTri;

import com.java.domainstore.FE.model.UserSession;
import com.java.domainstore.FE.view.MainForm;
import com.java.domainstore.FE.view.LoginForm;

public class TestApp {

    public static void main(String[] args) {
//        LoginForm.start();
        UserSession.login("KH001", "admin");
        MainForm.start();
    }
}

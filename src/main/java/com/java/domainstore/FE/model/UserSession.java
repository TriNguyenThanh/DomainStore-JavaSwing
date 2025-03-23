package com.java.domainstore.FE.model;

public class UserSession {

    private static UserSession instance;
    private String userID;
    private String role;

    private UserSession(String userID, String role) {
        this.userID = userID;
        this.role = role;
    }

    public static UserSession getInstance() {
        if (instance == null) {
            throw new IllegalStateException("No found session");
        }
        return instance;
    }

    public static void login(String userID, String role) {
        if (instance == null) {
            instance = new UserSession(userID, role);
        } else {
            throw new IllegalStateException("Exist session");
        }
    }

    public static void logout() {
        instance = null;
    }

    public String getUserID() {
        return userID;
    }

    public String getRole() {
        return role;
    }
}

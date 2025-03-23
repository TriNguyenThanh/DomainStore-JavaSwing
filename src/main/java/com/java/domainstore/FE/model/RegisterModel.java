package com.java.domainstore.FE.model;

public class RegisterModel {

    private String name;
    private String phone;
    private String email;
    private String psID;
    private String pass;
    private String cfPass;

    public RegisterModel() {

    }

    public RegisterModel(String name, String email, String phone, String psID, char[] pass, char[] cfPass) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.psID = psID;
        this.pass = new String(pass);
        this.cfPass = new String(cfPass);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsID() {
        return psID;
    }

    public void setPsID(String psID) {
        this.psID = psID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPass(char[] pass) {
        this.pass = new String(pass);
    }

    public String getCfPass() {
        return cfPass;
    }

    public void setCfPass(String cfPass) {
        this.cfPass = cfPass;
    }

    public void setCfPass(char[] cfpass) {
        this.cfPass = new String(cfpass);
    }
}

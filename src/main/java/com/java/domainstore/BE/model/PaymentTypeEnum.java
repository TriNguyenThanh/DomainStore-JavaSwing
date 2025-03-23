package com.java.domainstore.BE.model;

public enum PaymentTypeEnum {
    VNPAY(1),
    MOMO(2),
    CREDITCARD(3),
    ZALOPAY(4);
    
    private int code;
    PaymentTypeEnum(int code){
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
}

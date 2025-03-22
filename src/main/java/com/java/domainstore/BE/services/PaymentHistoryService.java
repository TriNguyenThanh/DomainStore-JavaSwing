
package com.java.domainstore.BE.services;

import com.java.domainstore.BE.dao.PaymentHistoryDAO;
import com.java.domainstore.BE.model.PaymentHistoryModel;
import com.java.domainstore.BE.model.PaymentStatusEnum;
import com.java.domainstore.BE.model.PaymentTypeEnum;
import java.time.LocalDate;
import java.util.ArrayList;

public class PaymentHistoryService {
    private ArrayList<PaymentHistoryModel> listPaymentHistory = PaymentHistoryDAO.getInstance().selectAll();
    private final PaymentHistoryDAO paymentHistoryDAO = new PaymentHistoryDAO();
    
    public PaymentHistoryModel createPaymentHistory(String transactionId, String paymentCode, PaymentTypeEnum paymentType, PaymentStatusEnum paymentStatus){
        PaymentHistoryModel p = new PaymentHistoryModel(transactionId, paymentCode, paymentType.getCode(), paymentStatus, LocalDate.now());
        paymentHistoryDAO.insert(p);
        return p;
    }
}

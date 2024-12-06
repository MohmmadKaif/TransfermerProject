package com.mohmmad.kaif.learning.Transfermer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;


import com.mohmmad.kaif.learning.Transfermer.DataAccessingObjects.PaymentAccessDao;
import com.mohmmad.kaif.learning.Transfermer.DataTransferObjects.PaymentOrderWrapper;
import com.mohmmad.kaif.learning.Transfermer.DataTransferObjects.PayoutRequestStructure;
import com.mohmmad.kaif.learning.Transfermer.Entities.PaymentOrder;
import com.mohmmad.kaif.learning.Transfermer.ResponseStructures.PayoutResponse;
import com.mohmmad.kaif.learning.Transfermer.ResponseStructures.StatusInquiryResponse;

@Service
public class PaymentOrderServices {
    @Autowired
    PaymentAccessDao paymentOrderDbAccess;



public PayoutResponse postPayment(PayoutRequestStructure payment){
       PaymentOrder paymentOrder=this.convertToPaymentOrder(payment);
       paymentOrderDbAccess.saveNewPaymentOrder(paymentOrder);
       return this.generatePayoutResponse();
    }




public StatusInquiryResponse getPaymentStatus(String paymentReferenceNumber){
    PaymentOrder paymentOrder=paymentOrderDbAccess.getPaymentById(paymentReferenceNumber);
    return this.generateStatusInquiryResponse(paymentOrder);
    
}

private PayoutResponse generatePayoutResponse(){
    PayoutResponse response =new PayoutResponse();    
    response.setResponseCode("IBOC004");
    response.setResponseMessage("The payment has been successfully posted.");
    response.setTimeStamp(LocalDateTime.now().toString());
    return response;
}

private StatusInquiryResponse generateStatusInquiryResponse(PaymentOrder paymentOrder){
    StatusInquiryResponse response =new StatusInquiryResponse();    
    response.setPaymentReferenceNumber(paymentOrder.getPaymentReferenceNumber());
       response.setPaymentStatus(paymentOrder.getPaymentStatus());
       response.setTimeStamp(LocalDateTime.now().toString());
       return response;
}


@SuppressWarnings({"unused"})
private PaymentOrder convertToPaymentOrder( PaymentOrderWrapper payment ){
    PaymentOrder paymentOrder= new PaymentOrder(); 
    paymentOrder.setPaymentReferenceNumber(payment.getPaymentReferenceNumber());
    paymentOrder.setTranInitiationTimestamp(payment.getTranInitiationTimestamp());
    paymentOrder.setCurrency(payment.getCurrency());
    paymentOrder.setAmount(payment.getAmount());
    paymentOrder.setRemitterName(payment.getRemitterName());
    paymentOrder.setRemitterAddress(payment.getRemitterAddress());
    paymentOrder.setRemitterPhoneNumber(payment.getRemitterPhoneNumber());

    paymentOrder.setRecipientAccountNumber(payment.getRecipientAccountNumber());
    paymentOrder.setRecipientName(payment.getRecipientName());
    paymentOrder.setRecipientAddress(payment.getRecipientAddress());

    paymentOrder.setRemitterMessage(payment.getRemitterMessage());
    return paymentOrder;
}


private PaymentOrder convertToPaymentOrder( PayoutRequestStructure payment ){
    PaymentOrder paymentOrder= new PaymentOrder(); 
    paymentOrder.setPaymentReferenceNumber(payment.getPaymentReferenceNumber());
    paymentOrder.setTranInitiationTimestamp(payment.getTranInitiationTimestamp());
    paymentOrder.setCurrency(payment.getCurrency());
    paymentOrder.setAmount(payment.getAmount());
    paymentOrder.setRemitterName(payment.getRemitterName());
    paymentOrder.setRemitterAddress(payment.getRemitterAddress());
    paymentOrder.setRemitterPhoneNumber(payment.getRemitterPhoneNumber());

    paymentOrder.setRecipientAccountNumber(payment.getRecipientAccountNumber());
    paymentOrder.setRecipientName(payment.getRecipientName());
    paymentOrder.setRecipientAddress(payment.getRecipientAddress());

    paymentOrder.setRemitterMessage(payment.getRemitterMessage());

    paymentOrder.setPaymentStatus("IBOC0100");

    return paymentOrder;
}





}

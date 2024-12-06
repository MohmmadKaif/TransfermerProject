package com.mohmmad.kaif.learning.Transfermer.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohmmad.kaif.learning.Transfermer.DataTransferObjects.PayoutRequestStructure;
import com.mohmmad.kaif.learning.Transfermer.DataTransferObjects.StatusInquiryRequestStructure;
import com.mohmmad.kaif.learning.Transfermer.ResponseStructures.PayoutResponse;
import com.mohmmad.kaif.learning.Transfermer.ResponseStructures.StatusInquiryResponse;
import com.mohmmad.kaif.learning.Transfermer.Services.PaymentOrderServices;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/PaymentOperations")
public class PaymentOperationControllers {
    @Autowired
   PaymentOrderServices paymentOrderServices; 


    @RequestMapping(value="/transaction", method=RequestMethod.POST)
    public ResponseEntity<PayoutResponse> postNewTransaction(@RequestBody PayoutRequestStructure payment){
        PayoutResponse payoutResponse =new PayoutResponse(); 
        payoutResponse =paymentOrderServices.postPayment(payment);
        
        return ResponseEntity
                .status(HttpStatus.OK) // 200 OK
                .body(payoutResponse); // Response Body
        
    }



    @RequestMapping(value="/transaction", method=RequestMethod.GET)
    public ResponseEntity<StatusInquiryResponse> postNewTransaction(@RequestBody StatusInquiryRequestStructure payment){
        StatusInquiryResponse response =new StatusInquiryResponse(); 
        response=paymentOrderServices.getPaymentStatus(payment.getPaymentReferenceNumber());
        
        return ResponseEntity
                .status(HttpStatus.OK) // 200 OK
                .body(response); // Response Body
        
    }

    



}

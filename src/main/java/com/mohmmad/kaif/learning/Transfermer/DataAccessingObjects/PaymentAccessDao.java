package com.mohmmad.kaif.learning.Transfermer.DataAccessingObjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mohmmad.kaif.learning.Transfermer.Entities.PaymentOrder;
import com.mohmmad.kaif.learning.Transfermer.Exceptions.PaymentAlreadyExistsException;
import com.mohmmad.kaif.learning.Transfermer.Exceptions.PaymentNotFoundException;
import com.mohmmad.kaif.learning.Transfermer.JpaRepositories.PaymentOrderRepository;

@Repository
public class PaymentAccessDao {

    @Autowired
    private PaymentOrderRepository paymentRepo;
    
    public void saveNewPaymentOrder(PaymentOrder paymentOrder){
        if(!paymentRepo.findById(paymentOrder.getPaymentReferenceNumber()).isPresent()){
            paymentRepo.save(paymentOrder);
        }else{
            throw new PaymentAlreadyExistsException("IBOC006", "PAYMENT ALREAY EXISTS");
        }
     return;
}

public PaymentOrder getPaymentById(String paymentReferenceNumber){
    System.out.println(paymentRepo.findById(paymentReferenceNumber).isPresent());
    if(paymentRepo.findById(paymentReferenceNumber).isPresent()){
       return paymentRepo.findById(paymentReferenceNumber).get();
    }else{
        throw new PaymentNotFoundException("IBOC005", "PAYMENT NOT FOUND");
    }
}


}

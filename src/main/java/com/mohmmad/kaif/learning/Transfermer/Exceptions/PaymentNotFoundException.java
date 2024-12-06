package com.mohmmad.kaif.learning.Transfermer.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentNotFoundException extends RuntimeException{
    private String errorCode;
    public PaymentNotFoundException(String errorCode,String errorMessage){
        super(errorMessage);
        this.errorCode=errorCode;
    }  
}

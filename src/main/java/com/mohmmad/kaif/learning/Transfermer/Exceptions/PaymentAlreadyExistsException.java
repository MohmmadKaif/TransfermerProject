package com.mohmmad.kaif.learning.Transfermer.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentAlreadyExistsException extends RuntimeException {
    
    private String errorCode;
    public PaymentAlreadyExistsException(String errorCode,String errorMessage){
        super(errorMessage);
        this.errorCode=errorCode;
    }  
    
    
}

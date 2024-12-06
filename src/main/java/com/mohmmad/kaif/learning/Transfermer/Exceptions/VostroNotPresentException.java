package com.mohmmad.kaif.learning.Transfermer.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VostroNotPresentException extends RuntimeException{
    private String errorCode;
    public VostroNotPresentException(String errorCode,String errorMessage){
        super(errorMessage);
        this.errorCode=errorCode;
    }  
}

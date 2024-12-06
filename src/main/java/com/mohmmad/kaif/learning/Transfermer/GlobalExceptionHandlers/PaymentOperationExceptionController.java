package com.mohmmad.kaif.learning.Transfermer.GlobalExceptionHandlers;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mohmmad.kaif.learning.Transfermer.Exceptions.PaymentAlreadyExistsException;
import com.mohmmad.kaif.learning.Transfermer.Exceptions.PaymentNotFoundException;
import com.mohmmad.kaif.learning.Transfermer.Exceptions.VostroNotPresentException;
import com.mohmmad.kaif.learning.Transfermer.ResponseStructures.PayoutResponse;
import com.mohmmad.kaif.learning.Transfermer.ResponseStructures.ErrorResponses.GenericResponse;
import com.mohmmad.kaif.learning.Transfermer.ResponseStructures.ErrorResponses.StatusInquiryErrorResponse;
import com.mohmmad.kaif.learning.Transfermer.ResponseStructures.ErrorResponses.VostroBalanceErrorResponse;

@ControllerAdvice
public class PaymentOperationExceptionController  {

    @ExceptionHandler(PaymentAlreadyExistsException.class)
   public ResponseEntity<PayoutResponse> handleException(PaymentAlreadyExistsException exc){
      PayoutResponse payoutResponse=new PayoutResponse();
      payoutResponse.setResponseCode(exc.getErrorCode());
      payoutResponse.setResponseMessage(exc.getMessage());
      payoutResponse.setTimeStamp(LocalDateTime.now().toString());
      return new ResponseEntity<>(payoutResponse,HttpStatus.BAD_REQUEST);
   }


   @ExceptionHandler(PaymentNotFoundException.class)
   public ResponseEntity<StatusInquiryErrorResponse> handleException(PaymentNotFoundException exc){
      StatusInquiryErrorResponse error=new StatusInquiryErrorResponse();
      error.setResponseCode("IBOC005");
      error.setResponseMessage("PAYMENT DOESNOT EXISTS");
      error.setTimeStamp(LocalDateTime.now().toString());
      return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
   }
   @ExceptionHandler(Exception.class)
   public ResponseEntity<GenericResponse> handleGenericException(){
      GenericResponse error=new GenericResponse();
      error.setErrorCode("IBOC010");
      error.setErrorMessage("Some Generic Exception occured");
      error.setTimeStamp(LocalDateTime.now().toString());
      return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(VostroNotPresentException.class)
public ResponseEntity<VostroBalanceErrorResponse> handleException(VostroNotPresentException exception){
VostroBalanceErrorResponse response=new VostroBalanceErrorResponse();
response.setResponseCode(exception.getErrorCode());
response.setResponseMessage(exception.getMessage());
response.setTimeStamp(LocalDateTime.now().toString());
return new ResponseEntity<>(response,HttpStatusCode.valueOf(800));    
}


}

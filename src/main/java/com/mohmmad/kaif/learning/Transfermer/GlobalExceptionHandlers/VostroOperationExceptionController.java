    package com.mohmmad.kaif.learning.Transfermer.GlobalExceptionHandlers;

    import java.time.LocalDateTime;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mohmmad.kaif.learning.Transfermer.Exceptions.VostroNotPresentException;
import com.mohmmad.kaif.learning.Transfermer.ResponseStructures.ErrorResponses.VostroBalanceErrorResponse;

@ControllerAdvice
public class VostroOperationExceptionController {
  
}

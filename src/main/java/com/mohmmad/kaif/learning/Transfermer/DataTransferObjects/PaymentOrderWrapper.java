package com.mohmmad.kaif.learning.Transfermer.DataTransferObjects;

import java.math.BigDecimal;
import lombok.Data;



@Data
public class PaymentOrderWrapper {
    private String paymentReferenceNumber;
    private String tranInitiationTimestamp;
    private String currency;
    private BigDecimal amount;
    private String remitterName;
    private String remitterAddress;
    private String remitterPhoneNumber;
    
    private String recipientAccountNumber;
    private String recipientName;
    private String recipientAddress;

    private String remitterMessage;
    private String paymentStatus;


}

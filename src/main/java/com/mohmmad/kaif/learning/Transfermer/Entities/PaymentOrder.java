package com.mohmmad.kaif.learning.Transfermer.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="payment_info")
@Data
public class PaymentOrder {
    @Id
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

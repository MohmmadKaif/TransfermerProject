package com.mohmmad.kaif.learning.Transfermer.ResponseStructures;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusInquiryResponse {
    private String paymentReferenceNumber; 
    private String paymentStatus;
    private String timeStamp;
}

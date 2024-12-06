package com.mohmmad.kaif.learning.Transfermer.ResponseStructures.ErrorResponses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusInquiryErrorResponse {
private String responseCode;
private String responseMessage;
private String timeStamp;
}

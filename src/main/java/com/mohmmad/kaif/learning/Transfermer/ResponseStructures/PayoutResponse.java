package com.mohmmad.kaif.learning.Transfermer.ResponseStructures;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayoutResponse{
    private String responseCode;
    private String responseMessage;
    private String timeStamp;
}

package com.mohmmad.kaif.learning.Transfermer.ResponseStructures.ErrorResponses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VostroBalanceErrorResponse{
private String responseCode;
private String responseMessage;
private String timeStamp;
}

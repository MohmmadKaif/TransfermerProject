package com.mohmmad.kaif.learning.Transfermer.ResponseStructures.ErrorResponses;

import lombok.Data;

@Data
public class GenericResponse {
private String errorCode;
private String errorMessage;
private String timeStamp;
}

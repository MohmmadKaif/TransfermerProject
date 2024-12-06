package com.mohmmad.kaif.learning.Transfermer.DataTransferObjects;

import java.math.BigDecimal;


import jakarta.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access=AccessLevel.PUBLIC,force=true)
public class AccountHoldersWrapper{
@Id   
private String accountNumber;
BigDecimal balance;
private String firstName;
private String middleName;
private String lastName;
}

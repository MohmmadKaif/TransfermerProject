package com.mohmmad.kaif.learning.Transfermer.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="account_holders")
@Data
@NoArgsConstructor(access=AccessLevel.PRIVATE,force=true)
public class AccountHolders{
@Id   
private String accountNumber;
BigDecimal balance;
private String firstName;
private String middleName;
private String lastName;
}

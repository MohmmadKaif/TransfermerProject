package com.mohmmad.kaif.learning.Transfermer.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VostroDetails {
    @Id
    private String partnerBankId;
    private BigDecimal vostroBalance;
    private String lastDeductedTimestamp;
    private String lastRefundTimestamp;  
}

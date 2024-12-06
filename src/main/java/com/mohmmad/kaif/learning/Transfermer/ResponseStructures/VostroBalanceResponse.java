package com.mohmmad.kaif.learning.Transfermer.ResponseStructures;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VostroBalanceResponse {
private String partnerBankId;
private BigDecimal vostro;
private String lastDeductedTimestamp;
private String lastRefundTimestamp;  
}

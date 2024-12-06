package com.mohmmad.kaif.learning.Transfermer.DataTransferObjects;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VostroDetailsWrapper {
    private String partnerBankId;
    private BigDecimal vostroBalance;
    private String lastDeductedTimestamp;
    private String lastRefundTimestamp;  

}

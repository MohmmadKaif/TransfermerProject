package com.mohmmad.kaif.learning.Transfermer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohmmad.kaif.learning.Transfermer.DataAccessingObjects.VostroAccessDao;
import com.mohmmad.kaif.learning.Transfermer.DataTransferObjects.VostroDetailsWrapper;
import com.mohmmad.kaif.learning.Transfermer.Entities.VostroDetails;

@Service
public class VostroServices {
@Autowired
VostroAccessDao dao;
    public void updateVostroBalance(VostroDetailsWrapper request){
VostroDetails  details=this.covertToVostroDetails(request);
dao.updateVostroBalance(details);
return;
}


public VostroDetails covertToVostroDetails(VostroDetailsWrapper request){
VostroDetails details=new VostroDetails();

details.setPartnerBankId(request.getPartnerBankId());
details.setVostroBalance(request.getVostroBalance());
if(request.getLastDeductedTimestamp()!=null){
details.setLastDeductedTimestamp(request.getLastDeductedTimestamp());
}

return details;
}
}




package com.mohmmad.kaif.learning.Transfermer.DataAccessingObjects;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mohmmad.kaif.learning.Transfermer.Entities.VostroDetails;
import com.mohmmad.kaif.learning.Transfermer.Exceptions.VostroNotPresentException;
import com.mohmmad.kaif.learning.Transfermer.JpaRepositories.VostroRepository;

@Repository
public class VostroAccessDao {
    @Autowired
    private VostroRepository vostroRepo;
public void updateVostroBalance(VostroDetails vostroDetails){
  
    System.out.println(vostroRepo.findById(vostroDetails.getPartnerBankId()).isPresent());


    if(vostroRepo.findById(vostroDetails.getPartnerBankId()).isPresent()){
      System.out.println("I am here...");
      VostroDetails dbCopy=  vostroRepo.findById(vostroDetails.getPartnerBankId()).get();
      dbCopy.setVostroBalance(vostroDetails.getVostroBalance());
      dbCopy.setLastRefundTimestamp(LocalDateTime.now().toString());
    }else{
throw new VostroNotPresentException("IBOC0065", "The partner id mentioned is not registered in our vostro records");
    }
}





}

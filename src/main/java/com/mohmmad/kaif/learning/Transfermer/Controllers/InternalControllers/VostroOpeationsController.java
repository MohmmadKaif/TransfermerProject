package com.mohmmad.kaif.learning.Transfermer.Controllers.InternalControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohmmad.kaif.learning.Transfermer.DataTransferObjects.VostroDetailsWrapper;
import com.mohmmad.kaif.learning.Transfermer.Services.VostroServices;

import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/internal")
public class VostroOpeationsController {
@Autowired
VostroServices vostroServies;

@RequestMapping(path="/vostro", method=RequestMethod.PUT)
public ResponseEntity<String> updateVostroBalance(@RequestBody VostroDetailsWrapper vostroDetails){
     
 vostroServies.updateVostroBalance(vostroDetails);
 return new ResponseEntity<>("Vostro Added Successfully",HttpStatus.OK);
}


}

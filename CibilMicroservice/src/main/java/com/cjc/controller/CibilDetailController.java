package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.CibilDetails;
import com.cjc.serviceI.CibilServiceI;

@RestController
public class CibilDetailController {
	
	@Autowired CibilServiceI csi;
	
	@GetMapping("/sendCibilDetails")
	public ResponseEntity<CibilDetails> sendCibilDetails() {
		CibilDetails cibilDetails =  csi.generateCibilDetails();
		return new ResponseEntity<CibilDetails>(cibilDetails, HttpStatus.OK);
	}


}

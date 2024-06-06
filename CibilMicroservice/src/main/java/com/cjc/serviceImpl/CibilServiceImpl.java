package com.cjc.serviceImpl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.cjc.model.CibilDetails;
import com.cjc.serviceI.CibilServiceI;

@Service
public class CibilServiceImpl implements CibilServiceI {

	Random ramdom = new Random();
	String cibilId = "CIBIL";

	@Override
	public CibilDetails generateCibilDetails() {
		CibilDetails cibilDetails = new CibilDetails();

		int nextInt = ramdom.nextInt(500, 999);
		String newId = cibilId + nextInt;
		cibilDetails.setCibil_Id(newId);

		int score = ramdom.nextInt(300, 900);
		cibilDetails.setCibil_score(score);

		if (score >= 750 && score <= 900) {
			cibilDetails.setRemark("Excellent");
		} else if (score >= 650 && score <= 749) {
			cibilDetails.setRemark("Good");
		} else if (score >= 500 && score <= 649) {
			cibilDetails.setRemark("Average");
		} else {
			cibilDetails.setRemark("Poor");
		}
		if (score >= 550) {
			cibilDetails.setApplicable(true);
		} else {
			cibilDetails.setApplicable(false);
		}
		return cibilDetails;
	}
}

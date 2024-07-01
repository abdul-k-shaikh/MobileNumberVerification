package com.springboot.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.web.entity.VerificationResult;
import com.springboot.web.model.VeriphoneResponse;
import com.springboot.web.repository.VerificationResultRepository;

@Service
public class MobileVerificationService {

	private static final Logger logger =  LoggerFactory.getLogger(MobileVerificationService.class);

	@Autowired
	private VerificationResultRepository resultRepository;

	private static final String API_KEY = "A1192A0D48984FDB8C7C7B87C46E8141";
	private static final String VERIPHONE_API_URL = "https://api.veriphone.io/v2/verify?key=" + API_KEY;

	private final RestTemplate restTemplate = new RestTemplate();

	public boolean verifyMobileNumber(String mobileNumber) {
		logger.info("Inside MobileVerificationService...");
		try {
			VeriphoneResponse resonseObj = restTemplate.getForObject(VERIPHONE_API_URL + "&phone=" + mobileNumber,
					VeriphoneResponse.class);

			VerificationResult result = new VerificationResult();
			result.setMobileNumber(mobileNumber);
			result.setValid(resonseObj.isPhoneValid());
			resultRepository.save(result);

			return resonseObj != null && resonseObj.isPhoneValid();
		} catch (Exception e) {
			logger.error("Exception while calling Veriphone API: {}", e.getMessage());
			System.err.println("Exception while calling Veriphone API: " + e.getMessage());
			
			return false;
		}
	}
}
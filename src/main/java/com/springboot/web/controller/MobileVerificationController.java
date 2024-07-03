package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.web.service.MobileVerificationService;

@Controller
public class MobileVerificationController {

	@Autowired
	private MobileVerificationService mobileVerificationService;


		@GetMapping("/verify")
		public String showVerifyPage() {
			return "verify"; // Return the JSP page name (verify.jsp)
		}

		@PostMapping("/verify")
		public void verifyMobileNumber(@RequestParam String mobileNumber, Model model) {
			boolean isValid = mobileVerificationService.verifyMobileNumber(mobileNumber);
			model.addAttribute("isValid", isValid);
		}
	}


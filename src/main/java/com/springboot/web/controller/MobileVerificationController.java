package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.web.service.MobileVerificationService;

@Controller
public class MobileVerificationController {

	@Autowired
	private MobileVerificationService mobileVerificationService;

//	@RequestMapping("/")
//	@GetMapping("/")
//	public String home() {
//		System.out.println("this is home page");
//		return "home";
//	}

	@GetMapping("/")
	public ModelAndView showIndexPage() {
		return new ModelAndView("index");
	}

	@Controller
	public class VeriphoneController {

//		private final MobileVerificationService mobileVerificationService;

//		public VeriphoneController(MobileVerificationService mobileVerificationService) {
//			this.mobileVerificationService = mobileVerificationService;
//		}

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

}

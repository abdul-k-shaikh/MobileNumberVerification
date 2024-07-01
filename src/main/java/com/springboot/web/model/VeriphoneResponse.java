package com.springboot.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VeriphoneResponse {
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("phone")
	private String phone;
	
	@JsonProperty("phone_valid")
    private boolean phoneValid;
	
	@JsonProperty("phone_type")
	private String phoneType;
	
	@JsonProperty("phone_region")
	private String phoneRegion;
	
	@JsonProperty("country")
	private String country;
	
	@JsonProperty("country_code")
	private String phoneCode;
	@JsonProperty("country_prefix")
	private String countryPrefix;
	@JsonProperty("international_number")
	private String intNumber;
	@JsonProperty("local_number")
	private String localNumber;
    @JsonProperty("e164")
    private String eNumber;
    @JsonProperty("carrier")
    private String carrier;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isPhoneValid() {
		return phoneValid;
	}
	public void setPhoneValid(boolean phoneValid) {
		this.phoneValid = phoneValid;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getPhoneRegion() {
		return phoneRegion;
	}
	public void setPhoneRegion(String phoneRegion) {
		this.phoneRegion = phoneRegion;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneCode() {
		return phoneCode;
	}
	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}
	public String getCountryPrefix() {
		return countryPrefix;
	}
	public void setCountryPrefix(String countryPrefix) {
		this.countryPrefix = countryPrefix;
	}
	public String getIntNumber() {
		return intNumber;
	}
	public void setIntNumber(String intNumber) {
		this.intNumber = intNumber;
	}
	public String getLocalNumber() {
		return localNumber;
	}
	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}
	public String geteNumber() {
		return eNumber;
	}
	public void seteNumber(String eNumber) {
		this.eNumber = eNumber;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
    

}
package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.Registration;

@Component
public class RegistrationValidator implements Validator {
	
	public boolean supports(Class<?> clazz) {
		return Registration.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Registration registration = (Registration) target;
		
		/*ValidationUtils.rejectIfEmpty(errors, "first_name", "error.first_name.empty", "please enter first name");
		ValidationUtils.rejectIfEmpty(errors, "last_name", "error.last_name.empty", "please enter last name");
		ValidationUtils.rejectIfEmpty(errors, "mobile_no", "error.mobile_no.empty", "please enter mobile number");
		ValidationUtils.rejectIfEmpty(errors, "email_id", "error.email_id.empty", "please enter email id");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty", "please enter password");
		ValidationUtils.rejectIfEmpty(errors, "address", "error.address.empty", "please enter address");
		*/
		
		ValidationUtils.rejectIfEmpty(errors, "first_name", "error.first_name.empty");
		ValidationUtils.rejectIfEmpty(errors, "last_name", "error.last_name.empty");
		ValidationUtils.rejectIfEmpty(errors, "mobile_no", "error.mobile_no.empty");
		ValidationUtils.rejectIfEmpty(errors, "email_id", "error.email_id.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		ValidationUtils.rejectIfEmpty(errors, "address", "error.address.empty");
	
}
}
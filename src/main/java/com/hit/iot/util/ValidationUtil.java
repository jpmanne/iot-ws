package com.hit.iot.util;

import com.hit.iot.common.Constants;
import com.hit.iot.model.UserDetails;

public class ValidationUtil {
	
	private static ValidationUtil instance = null;

	// ========================================================================

	private ValidationUtil() { }

	// ========================================================================

	public static synchronized ValidationUtil getInstance() {
		if (instance == null) {
			instance = new ValidationUtil();
		}
		return instance;
	}

	// ========================================================================
	
	public String validateField(String fieldName, String fieldValue, boolean notNull, int maxLength) {
		
		if(notNull) {
			if(fieldValue != null && fieldValue.trim().length() > 0) {
				if(fieldValue.length() > maxLength) {
					return fieldName + " data exceeds max length ("+maxLength+")";
				}
			} else {
				return fieldName + " cannot be null";
			}
		} else {
			if(fieldValue != null && fieldValue.trim().length() > 0) {
				if(fieldValue.trim().length() > maxLength) {
					return fieldName + " data exceeds max length ("+maxLength+")";
				}
			}
		}
		return Constants.SUCCESS;
	}
	
	// ========================================================================

	public String validateUserDetails(UserDetails details) {
		if(details != null) {
			String validateFieldResult1 = validateField("email", details.getEmail(), true, 150);
			if(!Constants.SUCCESS.equalsIgnoreCase(validateFieldResult1)) {
				return validateFieldResult1;
			}
			
			/*String validateFieldResult2 = validateField("password", details.getPassword(), true, 150);
			if(!Constants.SUCCESS.equalsIgnoreCase(validateFieldResult2)) {
				return validateFieldResult2;
			}*/
			
			String validateFieldResult3 = validateField("name", details.getName(), true, 150);
			if(!Constants.SUCCESS.equalsIgnoreCase(validateFieldResult3)) {
				return validateFieldResult3;
			}
			
			String validateFieldResult4 = validateField("lastName", details.getLastName(), true, 150);
			if(!Constants.SUCCESS.equalsIgnoreCase(validateFieldResult4)) {
				return validateFieldResult4;
			}
			
			/*String validateFieldResult5 = validateField("gender", details.getGender(), true, 1);
			if(!Constants.SUCCESS.equalsIgnoreCase(validateFieldResult5)) {
				return validateFieldResult5;
			}
			
			String validateFieldResult6 = validateField("dateOfBirth", details.getDateOfBirth(), true, 10);
			if(!Constants.SUCCESS.equalsIgnoreCase(validateFieldResult6)) {
				return validateFieldResult6;
			}*/
			
			String validateFieldResult7 = validateField("city", details.getCity(), true, 100);
			if(!Constants.SUCCESS.equalsIgnoreCase(validateFieldResult7)) {
				return validateFieldResult7;
			}
			
			String validateFieldResult8 = validateField("state", details.getState(), true, 100);
			if(!Constants.SUCCESS.equalsIgnoreCase(validateFieldResult8)) {
				return validateFieldResult8;
			}
			
			
			String validateFieldResult9 = validateField("country", details.getCountry(), true, 100);
			if(!Constants.SUCCESS.equalsIgnoreCase(validateFieldResult9)) {
				return validateFieldResult9;
			}
		} else {
			return "UserDetails cannot be null";
		}
		return Constants.SUCCESS;
	}
}

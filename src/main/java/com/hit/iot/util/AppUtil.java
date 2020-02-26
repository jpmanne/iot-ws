package com.hit.iot.util;

import java.util.List;
import com.hit.iot.model.UserDetails;

public class AppUtil {

	//=========================================================================
	
	public static String getUserFullName(List<UserDetails> users, long userDetailsId) {
		for(UserDetails ud  : users) {
			if(userDetailsId == ud.getUserDetailsId()) {
				String fullName = ud.getName();
				/*if(ud.getMiddleName() != null && ud.getMiddleName().trim().length() > 0) {
					fullName = fullName.concat(" ").concat(ud.getMiddleName());
				}*/
				fullName = fullName.concat(" ").concat(ud.getLastName());
				return fullName;
			}
		}
		return "";
	}
	
	//=========================================================================
	
	public static String getStartMethodMessage(String logTag) {
		return logTag + "START of the method";
	}
	
	//=========================================================================
	
	public static String getEndMethodMessage(String logTag) {
		return logTag + "END of the method";
	}
	
	//=========================================================================
	
}

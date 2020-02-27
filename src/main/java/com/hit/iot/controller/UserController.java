package com.hit.iot.controller;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hit.iot.util.AppUtil;
import com.hit.iot.common.Constants;
import com.hit.iot.common.URLConstants;
import com.hit.iot.model.Response;
import com.hit.iot.model.UserDetails;
import com.hit.iot.service.UserService;
import com.hit.iot.util.ValidationUtil;

@RestController
@RequestMapping(value= URLConstants.User.API_BASE)
public class UserController extends BaseController {
	@Autowired
	UserService service;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	//=========================================================================
	
	@GetMapping(URLConstants.User.IS_EMAIL_EXISTS)
	public ResponseEntity<Response> isEmailExists(@RequestParam("email") String email) /*throws JBoradException*/ {
		String logTag = "isEmailExists() :";
		logger.info(AppUtil.getStartMethodMessage(logTag));
		Response response = null;
		List<UserDetails> existingUsers = null;
		
		try {
			existingUsers = service.getUsersByEmail(email.toLowerCase());
			
			if(existingUsers != null && existingUsers.size() > 0) {
				response = new Response("Email already exists.", null);
			} else {
				response = new Response("Email available.", null);
			}
		} catch (Exception e) {
			String exceptionMessage = logTag + "Exception while isEmailExists";
			//handleException(logger, logTag, exceptionMessage, e, null); 
		}
		logger.info(AppUtil.getEndMethodMessage(logTag));
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	//=========================================================================
	
	@PostMapping(value= URLConstants.User.ADD_USER)
	public ResponseEntity<Response> create(@Valid @RequestBody UserDetails userDetails) {
		logger.debug("Saving user.");
		Response response = null;
		List<UserDetails> existingUsers = null;
		
		try {
			String validationResult = ValidationUtil.getInstance().validateUserDetails(userDetails);
			if(!Constants.SUCCESS.equalsIgnoreCase(validationResult)) {
				return getInvalidDataResponseEntity(validationResult);
			}
			existingUsers = service.getUsersByEmail(userDetails.getEmail().toLowerCase());
			logger.info(">>>>>>>>>>>>> existingUsers : "+existingUsers);
			if(existingUsers != null && existingUsers.size() > 0) {
				response = new Response("Email already exists.", null);
			} else {
				userDetails.setUserDetailsId(System.currentTimeMillis());
				userDetails.setStatus(Constants.ACTIVE);
				userDetails = service.createUser(userDetails);
				response = new Response("User Added Successfully", userDetails);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
/*
	//=========================================================================
	
	@GetMapping(value= URLConstants.User.GET_ALL_USERS)
	public Collection<Employee> getAll() {
		logger.debug("Getting all employees.");
		return serv.getAllEmployees();
	}

	//=========================================================================
	
	@GetMapping(value= URLConstants.User.GET_USER)
	public Optional<Employee> getById(@PathVariable(value= "employee-id") int id) {
		logger.debug("Getting employee with employee-id= {}.", id);
		return serv.findEmployeeById(id);
	}

	//=========================================================================
	
	@PutMapping(value= URLConstants.User.UPDATE_USER)
	public String update(@PathVariable(value= "employee-id") int id, @RequestBody Employee e) {
		logger.debug("Updating employee with employee-id= {}.", id);
		e.setId(id);
		serv.updateEmployee(e);
		return "Employee record for employee-id= " + id + " updated.";
	}

	//=========================================================================
	
	@DeleteMapping(value= URLConstants.User.DELETE_USER)
	public String delete(@PathVariable(value= "employee-id") int id) {
		logger.debug("Deleting employee with employee-id= {}.", id);
		serv.deleteEmployeeById(id);
		return "Employee record for employee-id= " + id + " deleted.";
	}

	//=========================================================================
	*/
	 
}
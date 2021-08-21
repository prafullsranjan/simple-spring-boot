/**
 * 
 */
package com.prafullranjan.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AppController
 * 
 * @author Prafull
 */
@RestController
public class AppController {

	@RequestMapping("/getUserDetails")
	public String getUserDetails() {
		return "Prafull";
	}

}

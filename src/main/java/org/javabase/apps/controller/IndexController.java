/**
 * 
 */
package org.javabase.apps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author OITI
 *
 */
@RestController
@RequestMapping("swagger/")
public class IndexController{
	
	@GetMapping()
	public String index(){
		
		return "index";
	}
	
	

}

/**
 * 
 */
package org.javabase.apps.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author OITI
 *
 */
@RestController
@RequestMapping("swagger/user")
@Api(value="SpringBootswagger", description="Operations pertaining to user in Spring boot restful service with swagger")
public class UserController {
	
    @ApiOperation(value = "View a list of available users",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public List<String> list(Model model){
    	List<String> user = new ArrayList<>();
    	for (int i = 0; i < 5; i++) {
    		user.add("user: "+i);
		}
        return user;
    }

}

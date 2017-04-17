package org.exampledriven.customer.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CRUDController {

	@RequestMapping("/insert")
    public String insert() {
		return "Insert Service Invoked............9001";
    }
	
	@RequestMapping("/update")
    public String update() {
		return "Update Service Invoked............9001";
    }

	@RequestMapping("/delete")
    public String delete() {
		return "Delete Service Invoked............9001";
    }
	
}
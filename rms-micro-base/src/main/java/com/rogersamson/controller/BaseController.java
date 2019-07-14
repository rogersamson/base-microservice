package com.rogersamson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@GetMapping("/fetch-all-records")	
	public List fetchAll() {
		List<String> listRecords = new ArrayList<String>();
		return listRecords;
	}

}

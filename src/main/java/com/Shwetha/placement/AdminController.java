package com.Shwetha.placement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.xml.ws.Response;

@RestController
public class AdminController 
{
	@Autowired
	private AdminService service;
	
	@GetMapping("/Adminservice")
	public List<Admin> list()
	{
		return service.listAll();
	}
	
	@PostMapping("/AdminService")
	public void add(@RequestBody Admin ad)
	{
		service.save(ad);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Admin ad)
	{
		service.save(ad);
		return new ResponseEntity<Admin>(HttpStatus.OK)
	}

}

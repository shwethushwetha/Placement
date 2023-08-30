package com.Shwetha.placement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService 
{
	@Autowired
	private AdminRepository repo; 
	
	public List<Admin> listAll()
	{
		return repo.findAll();	
	}
	
	public void save(Admin ad)
	{
		repo.save(ad);
	}
	
	public Admin get(Integer sid)
	{
		return repo.findById(sid).get();
	}
	
}

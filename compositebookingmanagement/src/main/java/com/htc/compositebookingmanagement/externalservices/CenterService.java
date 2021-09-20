package com.htc.compositebookingmanagement.externalservices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.compositebookingmanagement.entity.Center;


@Service	
@FeignClient(url = "http://localhost:63122",name="vaccinecentermanagement")
public interface CenterService {

	@GetMapping("/api/centers/{pincode}")
	public List<Center> findByPincode(@RequestParam String pincode); 
	
}

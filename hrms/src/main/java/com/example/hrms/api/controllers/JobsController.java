package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobService;
import com.example.hrms.entities.concretes.Job;



@RestController
@RequestMapping("api/job_positions")
public class JobsController {

	private JobService jobService;
	
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping("/getall") //veri alma isteği, kodlama.io/api/products/getall dersek bu çalışcak
	public List<Job> getAll(){
		return this.jobService.getAll();
		
	}
}

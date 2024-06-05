package org.formation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobsController {

	@Autowired
	JobExplorer jobExplorer;
	
	@RequestMapping("/")
	public String getAllJobs(Model model) {
		List<JobDto> list = new ArrayList<>();


		
		return "jobs";
	}
}

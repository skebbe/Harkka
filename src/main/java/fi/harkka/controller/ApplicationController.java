package fi.harkka.controller;

import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.harkka.model.Application;
import fi.harkka.service.ApplicationService;

@Controller
public class ApplicationController {
	
	private ApplicationService applicationService;
	
	@Autowired(required=true)
	//@Qualifier(value="applicationService")
	public void setApplicationService(ApplicationService as){
		this.applicationService = as;
	}
	
	@RequestMapping(value = "/applications", method = RequestMethod.GET)
	public String listApplications(Model model) {
		model.addAttribute("application", new Application());
		model.addAttribute("listApplications", this.applicationService.listApplications());
		return "application";
	}
	
	@RequestMapping(value= "/person/add", method = RequestMethod.POST)
	public String addApplication(@ModelAttribute("application") Application a){
		
		if(a.getId() ==0){
			
			this.applicationService.addApplication(a);
			
		}else{
			
			this.applicationService.updateApplication(a);
			
		}
		
		return "redirect:/applications";
	}
	
	@RequestMapping("/remove/{id}")
	public String removeApplication(@PathVariable("id") int id){
		this.applicationService.removeApplication(id);
		return "redirect:/application";
	}
	
	
	@RequestMapping("/edit/{id}")
	public String editApplication(@PathVariable("id")int id, Model model){
		model.addAttribute("application", this.applicationService.getApplicationById(id));
		model.addAttribute("listApplications", this.applicationService.listApplications());
		return "application";
	}

}

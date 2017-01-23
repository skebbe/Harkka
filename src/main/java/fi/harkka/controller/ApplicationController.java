package fi.harkka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.harkka.model.Application;
import fi.harkka.service.ApplicationService;

@Controller
public class ApplicationController {

	private ApplicationService applicationService;

	@Autowired(required = true)
	@Qualifier(value = "applicationService")
	public void setApplicationService(ApplicationService as) {
		this.applicationService = as;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listApplications(Model model) {
		model.addAttribute("application", new Application());
		model.addAttribute("listApplications",
				this.applicationService.listApplications());
		return "index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addApplication(@ModelAttribute("application") Application a,
			Model model) {
		this.applicationService.addApplication(a);

		// if(error) {
		// validointikäsittely
		// }else{

//		model.addAttribute("application",
//				this.applicationService.getApplicationById(a.getId()));
		// }

		return "redirect:/";
	}

}

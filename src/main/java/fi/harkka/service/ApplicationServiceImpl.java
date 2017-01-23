package fi.harkka.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import fi.harkka.dao.ApplicationDAO;
import fi.harkka.model.Application;



public class ApplicationServiceImpl implements ApplicationService {

	private ApplicationDAO applicationDAO;
	
	public void setApplicationDAO(ApplicationDAO applicationDAO){
		this.applicationDAO = applicationDAO;
	}
	
	@Transactional
	public void addApplication(Application a) {
		this.applicationDAO.addApplication(a);
	}
	
	
	
	
	
	@Transactional
	public List<Application> listApplications() {
		return this.applicationDAO.listApplications();
	}
	
	
	@Transactional
	public Application getApplicationById(int id) {
		return this.applicationDAO.getApplicationById(id);
	}

	
	
}

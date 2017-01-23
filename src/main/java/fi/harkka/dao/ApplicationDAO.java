package fi.harkka.dao;

import java.util.List;

import fi.harkka.model.Application;

public interface ApplicationDAO {

	public void addApplication(Application a);
	public List<Application> listApplications();
	public Application getApplicationById(int id);
	
	
	
}

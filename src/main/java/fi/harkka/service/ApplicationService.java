package fi.harkka.service;

import java.util.List;

import fi.harkka.model.Application;

public interface ApplicationService {

	public void addApplication(Application a);
	public List<Application> listApplications();
	public Application getApplicationById(int id);

}

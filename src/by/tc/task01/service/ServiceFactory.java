package by.tc.task01.service;

import by.tc.task01.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();
	
	private ServiceFactory() {}
	
	/**
	 * Return current service implementation
	 * 
	 * @return implemented ApplianceService object
	 **/
	public ApplianceService getApplianceService() {

		return applianceService;
	}
	
	/**
	 * Return instance of this factory
	 * 
	 * @return instance of this ServiceFactory
	 */
	public static ServiceFactory getInstance() {
		return instance;
	}

}

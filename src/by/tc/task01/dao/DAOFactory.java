package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
	
	private DAOFactory() {}

	/**
	 * Return current DAO implementation
	 * 
	 * @return implemented AppliaceDAO object
	 **/
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}
	
	/**
	 * Return instance of this factory
	 * 
	 * @return instance of this DAOFactory
	 */
	public static DAOFactory getInstance() {
		return instance;
	}
}

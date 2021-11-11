package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	/**
	 * Find first appliance with the specified criteria
	 * 
	 * @param criteria search criteria
	 * @return the first found appliance if all input criteria elements match with the appliance elements criteria. Null if appliance not founded.
	 **/
	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}
	
	/**
	 * Find all appliances with the specified criteria
	 * 
	 * @param criteria search criteria
	 * @return	all appliances with criteria consisting of the same elements as the input criteria. Empty array if appliance not founded.
	 **/
	@Override
	public Appliance[] findAll(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance[] appliances = applianceDAO.findAll(criteria);
		
		return appliances;
	}

}

//you may add your own new classes

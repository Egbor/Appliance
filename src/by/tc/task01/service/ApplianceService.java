package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	/**
	 * Find first appliance with the specified criteria
	 * 
	 * @param criteria - search criteria
	 * @return the first found appliance if all input criteria elements match with the appliance elements criteria. Null if appliance not founded.
	 **/
	Appliance find(Criteria criteria);
	
	/**
	 * Find all appliances with the specified criteria
	 * 
	 * @param criteria - search criteria
	 * @return	all appliances with criteria consisting of the same elements as the input criteria. Empty array if appliance not founded.
	 **/
	Appliance[] findAll(Criteria criteria);
}

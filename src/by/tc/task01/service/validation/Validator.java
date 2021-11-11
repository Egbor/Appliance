package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	/**
	 * Check criteria validation
	 * 
	 * @param criteria - criteria for check
	 * @return	true if criteria is not null or contain group search name, otherwise false
	 **/
	public static boolean criteriaValidator(Criteria criteria) {
		return (criteria != null) && (criteria.getGroupSearchName() != null);
	}

}

//you may add your own new classes
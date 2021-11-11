package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceCreater {
	/**
	 * Create new appliance with the specified criteria
	 * 
	 * @param criteria - criteria of new object
	 * @return new Appliance object with specified criteria
	 */
	Appliance Create(Criteria criteria);
}

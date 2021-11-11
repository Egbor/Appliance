package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public class Appliance {
	// you may add your own code here
	private Criteria criteria;
	
	public Appliance(Criteria criteria) {
		this.criteria = criteria;
	}
	
	/**
	 * Get value of criteria associated with the specified tag
	 * 
	 * @param searchCriteria - tag name
	 * @return value of criteria associated with the specified tag. Null if criteria tag is not founded
	 */
	public Object getCriteriaByTag(String searchCriteria) {
		return  criteria.get(searchCriteria);
	}
	
	@Override
	public String toString() {
		return criteria.toString();
	}
}

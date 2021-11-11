package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Refrigerator extends Appliance{
	// you may add your own code here
	public Refrigerator(Criteria criteria) {
		super(criteria);
	}
	
	public int getPowerConsumption() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()).toString());
	}
	
	public int getFreezerCapacity() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()).toString());
	}
	
	public int getOverrallCapacity() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()).toString());
	}
	
	public float getWeight() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Refrigerator.WEIGHT.toString()).toString());
	}
	
	public float getWidth() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Refrigerator.WIDTH.toString()).toString());
	}
	
	public float getHeight() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Refrigerator.HEIGHT.toString()).toString());
	}
}

package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Oven extends Appliance{
	// you may add your own code here
	public Oven(Criteria criteria) {
		super(criteria);
	}
	
	public int getPowerConsumption() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Oven.POWER_CONSUMPTION.toString()).toString());
	}
	
	public int getCapacity() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Oven.CAPACITY.toString()).toString());
	}
	
	public float getWeight() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Oven.WEIGHT.toString()).toString());
	}
	
	public float getWidth() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Oven.WIDTH.toString()).toString());
	}
	
	public float getHeight() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Oven.HEIGHT.toString()).toString());
	}
	
	public float getDepth() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Oven.DEPTH.toString()).toString());
	}
}

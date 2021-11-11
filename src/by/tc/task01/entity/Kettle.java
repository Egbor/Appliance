package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Kettle extends Appliance {
	// you may add your own code here
	public Kettle(Criteria criteria) {
		super(criteria);
	}
	
	public int getPowerConsumption() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Kettle.POWER_CONSUMPTION.toString()).toString());
	}
	
	public float getVolume() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Kettle.VOLUME.toString()).toString());
	}
	
	public float getPrice() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Kettle.PRICE.toString()).toString());
	}
	
	public String getColor() {
		return String.valueOf(getCriteriaByTag(SearchCriteria.Kettle.COLOR.toString()).toString());
	}
}

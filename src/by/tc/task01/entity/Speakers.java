package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Speakers extends Appliance{
	// you may add your own code here
	public Speakers(Criteria criteria) {
		super(criteria);
	}
	
	public int getPowerConsumption() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()).toString());
	}
	
	public int getNumberOfSpeekers() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()).toString());
	}
	
	public int getCordLenght() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Speakers.CORD_LENGTH.toString()).toString());
	}
	
	public String getFrequencyRange() {
		return String.valueOf(getCriteriaByTag(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()).toString());
	}
}

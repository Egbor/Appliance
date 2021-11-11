package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class VacuumCleaner extends Appliance{
	// you may add your own code here
	public VacuumCleaner(Criteria criteria) {
		super(criteria);
	}
	
	public int getPowerConsumption() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()).toString());
	}
	
	public int getMotorSpeedRegulation() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()).toString());
	}
	
	public float getCleaningWidth() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()).toString());
	}
	
	public String getFilterType() {
		return String.valueOf(getCriteriaByTag(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()).toString());
	}
	
	public String getBagType() {
		return String.valueOf(getCriteriaByTag(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()).toString());
	}
	
	public String getWandType() {
		return String.valueOf(getCriteriaByTag(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()).toString());
	}
}

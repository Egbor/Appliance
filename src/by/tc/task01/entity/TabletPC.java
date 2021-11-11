package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPC extends Appliance{
	// you may add your own code here
	public TabletPC(Criteria criteria) {
		super(criteria);
	}
	
	public int getBatteryCapacity() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()).toString());
	}
	
	public int getMemoryRom() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.TabletPC.MEMORY_ROM.toString()).toString());
	}
	
	public int getFlashMemoryCapacity() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()).toString());
	}
	
	public float getDisplayInchs() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()).toString());
	}
	
	public String getColor() {
		return String.valueOf(getCriteriaByTag(SearchCriteria.TabletPC.COLOR.toString()).toString());
	}
}

package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Laptop extends Appliance {
	// you may add your own code here
	public Laptop(Criteria criteria) {
		super(criteria);
	}
	
	public int getBatteryCapacity() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()).toString());
	}
	
	public int getMemoryRom() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Laptop.MEMORY_ROM.toString()).toString());
	}
	
	public int getSystemMemory() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()).toString());
	}
	
	public float getCpu() {
		return Float.valueOf(getCriteriaByTag(SearchCriteria.Laptop.CPU.toString()).toString());
	}
	
	public float getDisplayInchs() {
		return Integer.valueOf(getCriteriaByTag(SearchCriteria.Laptop.DISPLAY_INCHS.toString()).toString());
	}
	
	public String getOs() {
		return String.valueOf(getCriteriaByTag(SearchCriteria.Laptop.OS.toString()).toString());
	}
}

package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	/**
	 * Print all appliance information
	 * 
	 * @param appliance - appliance for output informtion
	 */
	public static void print(Appliance appliance) {
		// you may add your own code here
		if (appliance == null) {
			System.out.println("Empty");
		} else {
			System.out.println(appliance);
		}
	}
	
	// you may add your own code here

}

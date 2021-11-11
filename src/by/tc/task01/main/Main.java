package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Kettle;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Appliance[] appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteriaKettle = new Criteria(Kettle.class.getSimpleName());
		
		appliances = service.findAll(criteriaKettle);
		
		System.out.println("All kettles:");
		for (Appliance appliance : appliances) {
			PrintApplianceInfo.print(appliance);
		}
		
		if (appliances.length > 0) {
			System.out.println("\nThe cheapest kettle:");
			Kettle cheapestKettle = (Kettle)appliances[0];
			for (Appliance appliance : appliances) {
				if (cheapestKettle.getPrice() > ((Kettle)appliance).getPrice()) {
					cheapestKettle = (Kettle)appliance;
				}
			}
			PrintApplianceInfo.print(cheapestKettle);
		}
	}

}

package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

import java.util.HashMap;
import java.util.Map;

public final class ApplianceFactory {
	private static final ApplianceFactory instance = new ApplianceFactory();
	
	private Map<String, ApplianceCreater> creaters = new HashMap<String, ApplianceCreater>();
	
	private ApplianceFactory() {
		creaters.put(Oven.class.getSimpleName(), (criteria) -> { return new Oven(criteria); });
		creaters.put(Laptop.class.getSimpleName(), (criteria) -> { return new Laptop(criteria); });
		creaters.put(Refrigerator.class.getSimpleName(), (criteria) -> { return new Refrigerator(criteria); });
		creaters.put(VacuumCleaner.class.getSimpleName(), (criteria) -> { return new VacuumCleaner(criteria); });
		creaters.put(TabletPC.class.getSimpleName(), (criteria) -> { return new TabletPC(criteria); });
		creaters.put(Speakers.class.getSimpleName(), (criteria) -> { return new Speakers(criteria); });
		creaters.put(Kettle.class.getSimpleName(), (criteria) -> { return new Kettle(criteria); });
	}
	
	public Appliance getApplianceByCriteria(Criteria criteria) {
		if (creaters.containsKey(criteria.getGroupSearchName())) {
			return creaters.get(criteria.getGroupSearchName()).Create(criteria);
		}
		return null;
	}
	
	public static ApplianceFactory getInstance() {
		return instance;
	}
}

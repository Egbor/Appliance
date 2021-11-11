package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	/**
	 * Get search group name
	 *  
	 * @return name of search group
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Add new search criteria tag with the specified value
	 * 
	 * @param searchCriteria - tag name
	 * @param value - value associated with the search criteria tag
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	/**
	 * Return the value to which the specified search criteria is mapped, or null if the criteria is not containing search criteria tag 
	 * 
	 * @param searchCriteria - tag name
	 * @return the value to which the specified search criteria is mapped, or null if the appliance is not containing search criteria tag
	 */
	public Object get(String searchCriteria) {
		return criteria.get(searchCriteria);
	}
	
	// you may add your own code here	
	/**
	 * Compare all search criteria tags and values with other search criteria tags
	 * 
	 * @param other - criteria for comparison
	 * @return true if the criteria consists same search criteria tags and value as other criteria, otherwise false
	 */
	public boolean compare(Criteria other) {
		Set<String> keys = criteria.keySet();
		
		for (String key : keys) {
			if (other.criteria.containsKey(key)) {
				String value = criteria.get(key).toString().toLowerCase();
				String otherValue = other.criteria.get(key).toString().toLowerCase();
				
				if (value.compareTo(otherValue) != 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		Set<String> keys = criteria.keySet();
		
		StringBuilder builder = new StringBuilder(groupSearchName + " : ");
		for (String key : keys) {
			builder.append(key + "=" +criteria.get(key).toString() + " ");
		}
		
		return builder.toString();
		
	}
}

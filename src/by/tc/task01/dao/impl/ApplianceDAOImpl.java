package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceFactory;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.error.FatalErrorFactory;
import by.tc.task01.error.FatalErrorHandler;

import java.lang.Exception;
import java.util.List;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;
import org.w3c.dom.Document;

public class ApplianceDAOImpl implements ApplianceDAO{
	private static final String documentPath = "resources\\Appliances.xml";
	
	/**
	 * Find first appliance with the specified criteria
	 * 
	 * @param criteria - search criteria
	 * @return the first found appliance if all input criteria elements match with the appliance elements criteria. Null if appliance not founded.
	 **/
	@Override
	public Appliance find(Criteria criteria) {
		Appliance[] appliances = findAll(criteria);
		if (appliances.length == 0) {
			return null;
		}
		return appliances[0];
	}
	
	/**
	 * Find all appliances with the specified criteria
	 * 
	 * @param criteria - search criteria
	 * @return	all appliances with criteria consisting of the same elements as the input criteria. Empty array if appliance not founded.
	 **/
	@Override
	public Appliance[] findAll(Criteria criteria) {
		NodeList groups = parseDocument(documentPath);
		NodeList group = findElement(groups, criteria.getGroupSearchName());
		NodeList[] appliances = findElements(group);
		
		List<Appliance> applianceList = new ArrayList<Appliance>();
		
		for (int i = 0; i < appliances.length; i++) {
			Criteria applianceCriteria = new Criteria(criteria.getGroupSearchName());
			
			for (int j = 0; j < appliances[i].getLength(); j++) {
				applianceCriteria.add(appliances[i].item(j).getNodeName(), appliances[i].item(j).getTextContent());
			}
			
			if (applianceCriteria.compare(criteria)) {
				ApplianceFactory applianceFactory = ApplianceFactory.getInstance();
				applianceList.add(applianceFactory.getApplianceByCriteria(applianceCriteria));
			}
		}
		
		return applianceList.toArray(new Appliance[0]);
	}
	
	// you may add your own code here
	private NodeList findElement(NodeList groups, String elementName) {
		for (int i = 0; i < groups.getLength(); i++) {
			if (groups.item(i).getNodeName().equals(elementName)) {
				return groups.item(i).getChildNodes();
			}
		}
		return null;
	}
	
	private NodeList[] findElements(NodeList groups) {
		List<NodeList> elementsList = new ArrayList<NodeList>();
		
		for (int i = 0; i < groups.getLength(); i++) {
			if (!groups.item(i).getNodeName().equals("#text")) {
				elementsList.add(groups.item(i).getChildNodes());
			}
		}
		
		NodeList[] elements = new NodeList[elementsList.size()];
		Object[] elementsArray = elementsList.toArray();
		
		for (int i = 0; i < elements.length; i++) {
			elements[i] = (NodeList)elementsArray[i];
		}
		
		return elements;
	}
	
	private NodeList parseDocument(String path) {
		Document document = null;
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			
			document = documentBuilder.parse(path);
		} catch(Exception e) {
			FatalErrorFactory fatalErrorFactory = FatalErrorFactory.getInstance();
			FatalErrorHandler fatalError = fatalErrorFactory.getFatalErrorHandler();
			
			fatalError.handle(e.getMessage(), -1);
		}
		return document.getDocumentElement().getChildNodes();
	}
}


//you may add your own new classes
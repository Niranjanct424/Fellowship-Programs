package com.bridgelabz.serviceimplementation;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.LinkedList;
import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockLinkedList<T> {

	private static final String PATH_STOCK = "/home/user/eclipse-workspace/Oops/src/com/bridgeLabz/stock/repository/Stock.json";
	private static final String PATH_COMPANY = "/home/user/eclipse-workspace/Oops/src/com/bridgeLabz/stock/repository/Company.json";

	LinkedList<Object> stockList = new LinkedList<Object>();
	JSONArray arrayObject = new JSONArray();

	/**
	 * define function to add company details
	 */
	@SuppressWarnings("unchecked")
	public void add() {
		JSONObject jsonObject = new JSONObject();

		System.out.println("Enter a new company name : ");
		String name = Utility.next();
		jsonObject.put("Company_Name", name);

		System.out.println("Enter number of shares : ");
		long noOfShares = Utility.nextlong();
		jsonObject.put("NumberOfShares", noOfShares);

		if (Utility.readArray(PATH_COMPANY) != null) {
			arrayObject = Utility.readArray(PATH_COMPANY);
			arrayObject.add(jsonObject);
		} else {
			arrayObject.add(jsonObject);
		}
		Utility.writeToFile(arrayObject, PATH_COMPANY);

	}

	public void companyList() {
		JSONObject rootObject = Utility.readDetails(PATH_STOCK);
		Set<?> key = rootObject.keySet();
		Iterator<?> iterator = key.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();

			stockList.add(rootObject.get(string));
		}
		write();
	}

	public void display() {
		arrayObject = Utility.readArray(PATH_COMPANY);

		Iterator<?> iterator = arrayObject.iterator();
		while (iterator.hasNext()) {
			JSONObject innerObject = (JSONObject) iterator.next();

			System.out.println("*****************Details******************");
			System.out.println("Company_Name : " + innerObject.get("Company_Name"));
			System.out.println("NumberOfShares : " + innerObject.get("NumberOfShares"));
			System.out.println();
		}
	}

	/**
	 * define function to write in file
	 */
	@SuppressWarnings("unchecked")
	public void write() {
		int size = stockList.size();

		JSONObject object = new JSONObject();
		for (int i = size - 1; i >= 0; i--) {
			JSONArray array = (JSONArray) stockList.pop(i);

			Iterator<?> iterator = array.iterator();
			while (iterator.hasNext()) {
				JSONObject innerObject = (JSONObject) iterator.next();
				if (Utility.readArray(PATH_COMPANY) != null) {
					arrayObject = Utility.readArray(PATH_COMPANY);
					object.put("Company_Name", innerObject.get("Name"));
					object.put("NumberOfShares", innerObject.get("NumberOfShares"));
					arrayObject.add(object);
				} else {
					object.put("Company_Name", innerObject.get("Name"));
					object.put("NumberOfShares", innerObject.get("NumberOfShares"));
					arrayObject.add(object);
				}
				Utility.writeToFile(arrayObject, PATH_COMPANY);
			}
		}
	}

	/**
	 * define function to remove company details
	 */
	public void remove() {
		System.out.println("Enter a company name : ");
		String companyName = Utility.next();
		arrayObject = Utility.readArray(PATH_COMPANY);
		int size = arrayObject.size();
		for (int i = size - 1; i >= 0; i--) {
			JSONObject innerObject = (JSONObject) arrayObject.get(i);
			if (innerObject.containsValue(companyName)) {
				arrayObject.remove(i);
				Utility.writeToFile(arrayObject, PATH_COMPANY);
			}
		}
	}

}

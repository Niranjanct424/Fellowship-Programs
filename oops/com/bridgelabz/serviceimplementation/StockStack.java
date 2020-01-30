package com.bridgelabz.serviceimplementation;

import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.utility.*;

public class StockStack<T> {
	private static final String PATH_BUYER = "/home/bridgelabz/eclipse-workspace/bridgelabz/oops/com/bridgelabz/repositary/Buyer.json";
	private static final String PATH_SELLER = "/home/bridgelabz/eclipse-workspace/bridgelabz/oops/com/bridgelabz/repositary/Seller.json";

	Stack<Object> stack = new Stack<Object>();
	JSONObject rootObject = new JSONObject();

	/**
	 * define function to store buyer details
	 */
	public void buy() {
		rootObject = Utility.readDetails(PATH_BUYER);
		Set<?> key = rootObject.keySet();

		Iterator<?> iterator = key.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			stack.push(rootObject.get(string));
		}
		display();
	}

	/**
	 * define function to display
	 */
	public void display() {
		int size = stack.size();
		while (size > 0) {
			JSONArray array = (JSONArray) stack.pop();
			Iterator<?> iterator = array.iterator();
			while (iterator.hasNext()) {
				JSONObject innerObject = (JSONObject) iterator.next();
				System.out.println("*****************Details******************");
				System.out.println("Company_Symbol : " + innerObject.get("Company_Symbol"));
				System.out.println("Buyer_Name : " + innerObject.get("Buyer_Name"));
				System.out.println();
			}
			size--;
		}
		System.out.println("********************End********************");
	}

	/**
	 * define function to store seller details
	 */
	public void sell() {
		rootObject = Utility.readDetails(PATH_SELLER);
		Set<?> key = rootObject.keySet();

		Iterator<?> iterator = key.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			stack.push(rootObject.get(string));
		}
		display();
	}
}

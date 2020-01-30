package com.bridgelabz.serviceimplementation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.model.BuyerModel;
import com.bridgelabz.model.SellerModel;
import com.bridgelabz.model.StockAccountModel;
import com.bridgelabz.utility.Utility;

public class ServicesImplementation {
	
	private static final String PATH_STOCK = "/home/bridgelabz/eclipse-workspace/bridgelabz/oops/com/bridgelabz/repositary/Stock.json";
	private static final String PATH_BUYER = "/home/bridgelabz/eclipse-workspace/bridgelabz/oops/com/bridgelabz/repositary/Buyer.json";
	private static final String PATH_SELLER = "/home/bridgelabz/eclipse-workspace/bridgelabz/oops/com/bridgelabz/repositary/Seller.json";
	
	JSONObject rootObject = new JSONObject();
	JSONArray arrayItems = new JSONArray();
	JSONObject object = new JSONObject();
	StockAccountModel model = new StockAccountModel();
	BuyerModel buyer = new BuyerModel();
	SellerModel seller = new SellerModel();
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	/**
	 * define function to add details
	 * com.bridgelabz.utility.Utility

	 * @return JSONObject
	 */
	
	@SuppressWarnings("unchecked")
	public void addDetails() {
		JSONObject jsonObject = new JSONObject();
		JSONArray array = new JSONArray();

		rootObject = Utility.readDetails(PATH_STOCK);

		System.out.println("Enter a company name : ");
		model.setName(Utility.next());
		jsonObject.put("Name", model.getCompanyName());

		System.out.println("Enter a price per share : ");
		model.setPricePerShares(Utility.nextDouble());
		jsonObject.put("PricePerShares", model.getPricePerShares());

		System.out.println("Enter a number of shares : ");
		model.setNoOfShares(Utility.nextlong());
		jsonObject.put("NumberOfShares", model.getNoOfShares());

		System.out.println("Enter a company symbol : ");
		model.setSymbol(Utility.next());

		array.add(jsonObject);
		rootObject.put(model.getSymbol(), array);

		Utility.writeToFile(rootObject, PATH_STOCK);
	}

	/**
	 * define function to read data from file
	 */
	public void readFile() {
		System.out.println("Enter the company symbol : ");
		String companySymbol = Utility.next();

		JSONObject objectFile = Utility.readDetails(PATH_STOCK);
		arrayItems = (JSONArray) objectFile.get(companySymbol);

		JSONObject indexObject = (JSONObject) arrayItems.get(0);
		System.out.println("***************Company Details*****************");
		System.out.println("Name : " + indexObject.get("Name"));
		System.out.println("PricePerShares : " + indexObject.get("PricePerShares"));
		System.out.println("NumberOfShares : " + indexObject.get("NumberOfShares"));
	}

	/**
	 * define function to calculate price of individual share
	 * 
	 * @return double
	 */
	public double price() {

		System.out.println("Enter the company symbol : ");
		String companySymbol = Utility.next();

		JSONObject objectFile = Utility.readDetails(PATH_STOCK);
		arrayItems = (JSONArray) objectFile.get(companySymbol);
		JSONObject indexObject = (JSONObject) arrayItems.get(0);

		double price = 0;
		price = (double) indexObject.get("PricePerShares");

		return price;
	}

	/**
	 * define function to calculate total price of all shares
	 * 
	 * @return double
	 */

	public double totalPrice() {

		System.out.println("Enter the company symbol : ");
		String companySymbol = Utility.next();

		JSONObject objectFile = Utility.readDetails(PATH_STOCK);

		arrayItems = (JSONArray) objectFile.get(companySymbol);
		JSONObject indexObject = (JSONObject) arrayItems.get(0);
		double totalPrice = 0;
		double price = 0;
		long totalShares = 0;
		price = (double) indexObject.get("PricePerShares");
		totalShares = (long) indexObject.get("NumberOfShares");
		totalPrice = price * totalShares;

		return totalPrice;
	}

	/**
	 * define function to buy a stock
	 * 
	 * @param amount
	 * @param companySymbol
	 */
	@SuppressWarnings({ "unchecked" })
	public void buy(int amount, String companySymbol) {

		JSONObject jsonObject = new JSONObject();
		JSONArray array = new JSONArray();
		rootObject = Utility.readDetails(PATH_STOCK);

		System.out.println("Enter a Buyer name : ");
		buyer.setName(Utility.next());

		JSONObject objectFile = Utility.readDetails(PATH_STOCK);
		arrayItems = (JSONArray) objectFile.get(companySymbol);
		JSONObject indexObject = (JSONObject) arrayItems.get(0);

		String companyName = (String) indexObject.get("Name");
		long shares_Present = (long) indexObject.get("NumberOfShares");
		double price = (double) indexObject.get("PricePerShares");

		long shares_Buy = numberOfShares(amount, price);
		if (shares_Present >= shares_Buy) {
				
			long left_Shares = shares_Present - shares_Buy;
			indexObject.replace("NumberOfShares", shares_Present, left_Shares);
			JSONArray inputArray = new JSONArray();
			inputArray.add(indexObject);
			rootObject.put(companySymbol, inputArray);
			Utility.writeToFile(rootObject, PATH_STOCK);
			double totalPrice = price * shares_Buy;

			String date_Time = dateTime.format(format);
			buyer.setCompanySymbol(companySymbol);
			jsonObject.put("Company_Symbol", buyer.getCompanySymbol());
			jsonObject.put("Buyer_Name", buyer.getName());
			jsonObject.put("Shares_Bought", shares_Buy);
			jsonObject.put("Company_Name", companyName);
			jsonObject.put("Trade_Initated ", date_Time);
			jsonObject.put("Total_Price", totalPrice);
			jsonObject.put("PricePerShare", price);

//			StockByQueue stock = new StockByQueue(companyName, buyer.getName(), date_Time);
//			stock.queueTransaction();

			if (Utility.readDetails(PATH_BUYER) != null) {
				object = Utility.readDetails(PATH_BUYER);
				array.add(jsonObject);
				object.put(buyer.getName(), array);
			} else {
				array.add(jsonObject);
				object.put(buyer.getName(), array);
			}
			Utility.writeToFile(object, PATH_BUYER);
		} else {
			System.out.println("Thank You but stocks are insufficient to buy.");
		}
	}

	private long numberOfShares(int amount, double price) {
		long shares = (long) (amount / price);
		return shares;
	}

	/**
	 * define function to sell the stock
	 * 
	 * @param amount
	 * @param companyName
	 */
	@SuppressWarnings({ "unchecked" })
	public void sell(int amount, String companyName) {
		JSONObject jsonObject = new JSONObject();
		JSONArray array = new JSONArray();

		rootObject = Utility.readDetails(PATH_BUYER);

		System.out.println("Enter your name : ");
		seller.setName(Utility.next());

		JSONObject objectFile = Utility.readDetails(PATH_BUYER);
		arrayItems = (JSONArray) objectFile.get(companyName);
		JSONObject indexObject = (JSONObject) arrayItems.get(0);
		String name = (String) indexObject.get("Company_Name");
		String symbol = (String) indexObject.get("Company_Symbol");
		double price = (double) indexObject.get("PricePerShare");
		long shares_Present = (long) indexObject.get("Shares_Bought");
		double totalPrice = (double) indexObject.get("Total_Price");

		long shares_Buy = numberOfShares(amount, price);
		double amountOfShare = getAmount(shares_Buy, price);

		if (shares_Present >= shares_Buy) {
			long left_Shares = shares_Present - shares_Buy;
			double amount_left = totalPrice - amountOfShare;
			indexObject.replace("Shares_Bought", shares_Present, left_Shares);
			indexObject.replace("Total_Price", totalPrice, amount_left);

			JSONArray inputArray = new JSONArray();
			inputArray.add(indexObject);
			rootObject.put(companyName, inputArray);
			Utility.writeToFile(rootObject, PATH_BUYER);

			jsonObject.put("Buyer_Name", seller.getName());
			jsonObject.put("Company_Name", name);
			jsonObject.put("Company_Symbol", symbol);
			jsonObject.put("PricePerShare", price);
			jsonObject.put("Shares_Sell", shares_Buy);
			jsonObject.put("Trade_Initated ", dateTime.format(format));

			if (Utility.readDetails(PATH_SELLER) != null) {
				object = Utility.readDetails(PATH_SELLER);
				array.add(jsonObject);
				object.put(companyName, array);
			} else {
				array.add(jsonObject);
				object.put(companyName, array);
			}
			Utility.writeToFile(object, PATH_SELLER);
		}

		else {
			System.out.println("Thank You but stocks are insufficient to buy.");
		}
	}

	private double getAmount(long shares_Buy, double price) {
		double amount = shares_Buy * price;

		return amount;
	}

	/**
	 * define function to print report
	 */
	public void printReport() {
		System.out.println("Choose any one option : ");
		System.out.println("1. Buying Report");
		System.out.println("2. Selling Report");
		int choice = Utility.nextInteger();

		if (choice == 1) {
			System.out.println("Enter a Company Name : ");
			String companyName = Utility.next();

			JSONObject objectFile = Utility.readDetails(PATH_BUYER);
			arrayItems = (JSONArray) objectFile.get(companyName);

			JSONObject indexObject = (JSONObject) arrayItems.get(0);
			System.out.println("*******************Buying Report***********************");
			System.out.println();
			System.out.println("Company_Name : " + indexObject.get("Company_Name"));
			System.out.println("Company_Symbol : " + indexObject.get("Company_Symbol"));
			System.out.println("Trade_Initated : " + indexObject.get("Trade_Initated "));
			System.out.println("PricePerShare : " + indexObject.get("PricePerShare"));
			System.out.println("Shares_Bought : " + indexObject.get("Shares_Bought"));
			System.out.println("Total_Price : " + indexObject.get("Total_Price"));
		} else {
			System.out.println("Enter a Company Name : ");
			String companyName = Utility.next();

			JSONObject objectFile = Utility.readDetails(PATH_SELLER);
			arrayItems = (JSONArray) objectFile.get(companyName);

			JSONObject indexObject = (JSONObject) arrayItems.get(0);
			System.out.println("*******************Selling Report***********************");
			System.out.println();
			System.out.println("Company_Name : " + indexObject.get("Company_Name"));
			System.out.println("Company_Symbol : " + indexObject.get("Company_Symbol"));
			System.out.println("Trade_Initated : " + indexObject.get("Trade_Initated "));
			System.out.println("PricePerShare : " + indexObject.get("PricePerShare"));
			System.out.println("Buyer_Name : " + indexObject.get("Buyer_Name"));
			System.out.println("Shares_Sell : " + indexObject.get("Shares_Sell"));
		}
	}
}

package com.bridgelabz.oopsutility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Util 
{

	static Scanner scanner = new Scanner(System.in);
	public static int inputInteger()
	{
		try
		{
			return scanner.nextInt();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	public static String inputString()
	{
		try
		{
			return scanner.next();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static double inputDouble()
	{
		try
		{
			return scanner.nextDouble();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * takes file path as input parameter and read the data present in the file and
	 * convert to JSON array.
	 */
	public static JSONArray readJSONArray(String filePath) {
		JSONArray jsonArray;
		try (FileReader fieReader = new FileReader(filePath)) {
			JSONParser jsonParser = new JSONParser();
			jsonArray = (JSONArray) jsonParser.parse(fieReader);
			return jsonArray;
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException | ParseException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * writing array data to json file
	 */
	public static void writeDataToJSONFile(String path, JSONArray jsonArray) {

		try (FileWriter fileWritter = new FileWriter(path)) {
			fileWritter.write(jsonArray.toJSONString());
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}

	
}

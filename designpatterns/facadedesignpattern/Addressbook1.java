package facadedesignpattern;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.utility.Utility;

public class Addressbook1 {
	static String book1 ="";
	static String path = "/home/bridgelabz/eclipse-workspace/bridgelabz/designpatterns/facadedesignpattern/book.json";
	public static String readbook()
	{
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		StringBuilder sb = new StringBuilder();
		try {

			String line;
			while ((line = bufferedReader.readLine()) != null)
				sb.append(line);
		} catch (IOException e) {
			System.out.println("Empty file " + e.getMessage());
		} finally {
			try {

				bufferedReader.close();
				book1 = sb.toString();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}
		return sb.toString();	
	}
	public void displayBook()
	{
		String string = Utility.readFromFile(path);
		JSONParser parser = new JSONParser();
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
			
		} catch (Exception e) {
			//System.out.println("Thank You !!");
		}
		System.out.println("book1 : "+objectFile);
	}
}

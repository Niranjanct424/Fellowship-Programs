package TestCases;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class abc {
	
	public void add()
	{
	    JSONObject employeeDetails = new JSONObject();
	}

	public static void main(String[] args) 
	{
		 JSONObject employeeDetails = new JSONObject();
	        employeeDetails.put("firstName", "Lokesh");
	        employeeDetails.put("lastName", "Gupta");
	        employeeDetails.put("website", "howtodoinjava.com");
	         
	        JSONObject employeeObject = new JSONObject(); 
	        employeeObject.put("employee", employeeDetails);
	        
	        //Add employees to list
	        JSONArray employeeList = new JSONArray();
	        employeeList.add(employeeObject);
	        
	        //Write JSON file
	        try (FileWriter file = new FileWriter("employees.json")) {
	 
	            file.write(employeeList.toJSONString());
	            file.flush();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}

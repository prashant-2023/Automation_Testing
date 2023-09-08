package com.utils;


import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.constants.Constants;


public class JSONReader {

	public JSONReader() {
		
		throw new IllegalStateException("JSON Utility message");
	}
	
	
	public  static void jsonparser() throws Exception {
		
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(Constants.TEST_DATA_FILEPATH + "testdata.json");
		
		JSONObject obj = (JSONObject)	parser.parse(reader);
			 
		//	String fname = (String) obj.get("FirstName");
		//	String lname = (String) obj.get("LastName");
			//Object TestCase1 = (Object)obj.get("TestCase1");
			JSONObject TestCase1 = (JSONObject)obj.get("TestCase1");
			//System.out.println(fname);
			//System.out.println(lname);
			//System.out.println(TestCase1);
			
			JSONObject deals = (JSONObject) TestCase1.get("Deals");
			
			System.out.println(deals.get("Title"));
			//System.out.println(Contact.get("LastName"));
		
		
	}
	//Will return parent node data in JSONObject form
	public static JSONObject getparentnodedata(String parentnodeName) throws Exception{
		
		JSONParser parser = new JSONParser();
		FileReader reader;
		
			reader = new FileReader(Constants.TEST_DATA_FILEPATH + "testdata.json");
		
			JSONObject obj = (JSONObject)	parser.parse(reader);
			JSONObject parentnodedata = (JSONObject)obj.get(parentnodeName);
			
		
		return parentnodedata;
		
	}
	
	public static JSONObject getchildnodedata(String parentnodeName, String childnodename) throws Exception {
		
		/*JSONParser parser = new JSONParser();
		FileReader reader;
		
			reader = new FileReader(Constants.TEST_DATA_FILEPATH + "testdata.json");
		
			JSONObject obj = (JSONObject)	parser.parse(reader);*/
			
			JSONObject parentnodedata = getparentnodedata(parentnodeName);
			
			JSONObject childnodedata = (JSONObject) parentnodedata.get(childnodename);
		
			return childnodedata;			
		
		
	}
	

	public static void main(String[] args) {
		
		
		try {
			
			JSONObject childnodedata = getchildnodedata("TestCase1", "Deals");
			System.out.println(childnodedata.get("Description"));
			
			//jsonparser();
			//JSONObject data = getparentnodedate("TestCase1");
			//System.out.println(data);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*public static Map<String,Object> getparentnodedata(String appName, String nodeName) {
		
		JSONObject rootfile = new JSONObject();
		
		
		
		
	}*/

}

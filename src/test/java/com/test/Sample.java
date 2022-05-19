package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
	public static void main(String[] args) throws IOException, ParseException {
//		1 mention the path of Json folder 
		FileReader reader = new FileReader
				("C:\\Users\\Admin\\eclipse-workspace\\APIclass8am\\src\\test\\resources\\JSONFolder\\Employee.json");
//		2 create object for Json Parser classs
		JSONParser Parser = new JSONParser();
//		3 Pass the Json file to fetch the to pass the values 
		Object object = Parser.parse(reader);
//		4 convert to json object to class caste
		JSONObject j  = (JSONObject)object;

		Object object2 = j.get("data");
	    System.out.println(object2);
	     
	    JSONObject jn = (JSONObject)object2;
	    Object objData2 = jn.get("id");
	    System.out.println(objData2);
	    Object objEmail = jn.get("email");
	    System.out.println(objEmail);
	    Object objFirstname = jn.get("first_name");
	    System.out.println(objFirstname);
	    Object objLastname = jn.get("last_name");
	    System.out.println(objLastname);
	    Object objAvatar = jn.get("avatar");
	    System.out.println(objAvatar);
		
	    
	    JSONObject ja  = (JSONObject)object;
	    Object objSupport = ja.get("support");
	    System.out.println(objSupport);
	    
	    JSONObject jni = (JSONObject)objSupport;
	    Object objUrl = jni.get("url");
	    System.out.println(objUrl);
	    Object objtext = jni.get("text");
	    System.out.println(objtext);
	    
	    
		
		
		
		
		
		
		
		
	}

}

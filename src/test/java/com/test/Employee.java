package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Employee {
	public static void main(String[] args) throws IOException, ParseException {	
    FileReader reader = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\APIclass8am\\src\\test\\resources\\JSONFolder\\Test.json");
    JSONParser parser = new JSONParser();
    Object obj = parser.parse(reader);
    JSONObject j = (JSONObject)obj;
   Object object = j.get("name");
   System.out.println(object);
   Object object2 = j.get("email");
   System.out.println(object2);
   
	}
}

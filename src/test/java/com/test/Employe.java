package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Employe {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\APIclass8am\\src\\test\\resources\\JSONFolder\\Employee1.json");
		JSONParser parser = new JSONParser();
		Object object = parser.parse(f);	
		JSONObject j = (JSONObject)object;
		Object objpage = j.get("page");
		System.out.println(objpage);
		Object objperpage = j.get("per_page");
		System.out.println(objperpage);
		Object objtotal = j.get("total");
		System.out.println(objtotal);
		Object objtotalpages = j.get("total_pages");
		System.out.println(objtotalpages);
		Object objdata = j.get("data");
		System.out.println(objdata);
		JSONArray i = (JSONArray)objdata;
		for (int k = 0; k < i.size(); k++) {
			Object objdat = i.get(k);
			
			JSONObject ji = (JSONObject)objdat;
			
			System.out.println(ji.get("id"));
			System.out.println(ji.get("email"));
			System.out.println(ji.get("first_name"));
			System.out.println(ji.get("last_name"));
			System.out.println(ji.get("avatar"));
			
			
		}
		JSONArray ki = (JSONArray)objdata;
//		System.out.println(ki);
		JSONObject jk = (JSONObject)object;
		Object objSupport = jk.get("support");
		System.out.println(objSupport);
		JSONObject lk =(JSONObject)objSupport;
		Object objUrl = lk.get("url");
		System.out.println(objUrl);
		Object objText = lk.get("text");
		System.out.println(objText);
		
		
		
		
		
		
		
		
		
		
	}

}

package org.itstep;

import java.io.FileWriter;

import org.json.JSONException;
import org.json.JSONObject;

public class AppRunner {
	
	public static void main (String[] args) throws JSONException {
		
		JsonFileManager manager = new JsonFileManager();
		  
		JSONObject jsonContext = new JSONObject().put("users", 
	             new JSONObject()
	             .put("login", "Ignatenko2207")
	             .put("password", "12345")
	             .put("name", "Alex")
	             .put("moneyHave", 350.15)
	             .put("dog", new JSONObject()
	               .put("dogName", "Blacky")
	               .put("monthes", 14)));
		
//		 System.out.println(jsonContext.toString());
		 
		 manager.saveJsonToFile(jsonContext,  "/Users/admin/Desktop/context.json");
		
		 System.out.println(manager.readJsonFromFile("/Users/admin/Desktop/context.json").toString());
	}
		

	

}

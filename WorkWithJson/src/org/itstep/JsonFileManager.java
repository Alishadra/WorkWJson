package org.itstep;

import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonFileManager {

 protected void saveJsonToFile(JSONObject jsonContext, String filePath) {

  

  try {
   File file = new File(filePath);
   
    FileWriter writer = new FileWriter(file);

   writer.write(jsonContext.toString());

   writer.flush();
  } catch (IOException e) {
   e.printStackTrace();
  }catch (ImagingOpException e) {
    e.printStackTrace();
   }
  }

 

 protected JSONObject readJsonFromFile(String filePath) {

  FileReader reader = null;
  JSONObject context = null;

  try {
   reader = new FileReader(filePath);
   BufferedReader br = new BufferedReader(reader);
   String text;
   String jsonContent = "";
   while ((text = br.readLine()) != null) {
    jsonContent += text;
   }

   context = new JSONObject(jsonContent);
  } catch (IOException | JSONException e) {
   e.printStackTrace();
  } finally {
   try {
    reader.close();
   } catch (IOException e) {
    e.printStackTrace();
   }
  }

  return context;
 }
}
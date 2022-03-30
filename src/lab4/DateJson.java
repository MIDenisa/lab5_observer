package lab4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DateJson implements Serializable {
	final String FileName="info.json";
	
	public void scriere_date_figura(FiguraGeometrica figuri[])
	{
		GsonBuilder builder=new GsonBuilder();
		Gson gson=builder.setPrettyPrinting().create();
		
		try(FileWriter fw=new FileWriter("info.json")){
			gson.toJson(figuri,fw);
		}
		catch(IOException e) {e.printStackTrace();}
	}
	
	public FiguraGeometrica[] citire_date_figura()
	{
		GsonBuilder builder=new GsonBuilder();
		Gson gson=builder.create();
		
		FiguraGeometrica[] figuri=new FiguraGeometrica[2];
		
		try(FileReader fr=new FileReader("info.json")) {
			figuri=gson.fromJson(fr, FiguraGeometrica[].class);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		return figuri;
	}
}



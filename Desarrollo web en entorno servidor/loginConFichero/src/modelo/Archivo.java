package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;



public class Archivo {
	 private String path;

	 
	public Archivo(String path) {
		
		this.path = path;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}

	public ArrayList<String> leerArchivo() {
	    ArrayList<String> datos=new ArrayList<String>();
	    String linea;
	    try {
	      FileReader fr = new FileReader(path);
	      BufferedReader br = new BufferedReader(fr);
	      while((linea = br.readLine()) != null) {
	        datos.add(linea);
	    
	    }
	 
	      fr.close();
	    }
	    catch(Exception e) {
	      
	    }
	    return datos;
	  }
	
}

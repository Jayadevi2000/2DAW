package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import modelo.Archivo;



public class Archivo {
	 String path;

	 
	public Archivo(String path) {
		
		this.path = path;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public String[] getFiles() {

		String[] listado = null;

		File f = new File(path);

		if (f.isDirectory()) 

			listado = f.list();

		

		return listado;
	}
	public void escribirArchivo(String[] lineas) {
		
		FileWriter fichero = null;
   
    try
    {
        fichero = new FileWriter(path);
        for (String linea : lineas) {
			fichero.write(linea + "\r\n");
		}

		fichero.close();

       

    } catch (Exception e) {
        e.printStackTrace();
    } 
    
}
	public ArrayList<String> leerArchivo() {
	    ArrayList<String> datos=new ArrayList<String>();
	    try {
	      FileReader fr = new FileReader(path);
	      BufferedReader br = new BufferedReader(fr);
	 
	      String linea;
	      
	      while((linea = br.readLine()) != null) {
	        datos.add(linea);
	    
	    }
	 
	      fr.close();
	    }
	    catch(Exception e) {
	      
	    }
	    return datos;
	  }
	public  void add(String l) throws IOException {
		File archivo;
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			archivo = new File(path);
			fw = new FileWriter(archivo, true);
			pw = new PrintWriter(fw);
			pw.println(l);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null)
					pw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}

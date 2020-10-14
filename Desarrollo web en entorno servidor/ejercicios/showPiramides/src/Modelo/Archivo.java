package Modelo;

import java.io.File;
import java.util.ArrayList;

public class Archivo
 {
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
public ArrayList<String> dameFicherosImg() {
	String[] listado=null;
	ArrayList<String> listadoImg=new ArrayList<String>();
	String fich;
	File f=new File(path);
	if (f.isDirectory()) {
		listado=f.list();
	}
	for (int i=0;i<listado.length;i++) {
		if(listado[i].endsWith(".jpg")|| listado[i].endsWith(".png")) {
			listadoImg.add(listado[i]);
		}
	}
	return listadoImg;
}
}

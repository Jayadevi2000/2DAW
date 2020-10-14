package modelo;
import java.util.ArrayList;
import modelo.Archivo;
public class Actual {
private String lg;
private String clv;
private ArrayList<String> datos;
public Actual(String lg,String clv) {
	Archivo a=new Archivo("C:\\Users\\mercedes\\eclipse-workspace\\loginConFichero\\WebContent\\factor.txt");
	this.lg=lg;
	this.clv=clv;
	this.datos=a.leerArchivo();
}
public String[] obtenerLinea() {
	String linea;
	String[] misDatos=null;
	for (int i=0;i<this.datos.size();i++) {
		linea=datos.get(i);
		misDatos=linea.split(":");
if (lg.equals(misDatos[0]) && clv.equals(misDatos[1])){
	break;
}else {
	misDatos=null;
}

	}
	return misDatos;
}
}

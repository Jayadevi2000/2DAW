package Dao;
import java.util.*;
public class datos {
 public datos() {};
 public ArrayList<hotel> devolverDatos(){
	 ArrayList<hotel> listaHoteles=new ArrayList();
	 int [][] arrayExtras= {{15,10,10},{15,15,15},
			 {20,20,20},{25,25,30},{30,40,50}};
	//ind 0 garaje,1 jac,2 gym 
	 listaHoteles.add(new hotel("Ritz",100,110,arrayExtras[0]));
	 listaHoteles.add(new hotel("EuroStars",120,140,arrayExtras[1]));
	 listaHoteles.add(new hotel("AC",140,175,arrayExtras[2]));
	 listaHoteles.add(new hotel("Barceló",250,110,arrayExtras[3]));
	 listaHoteles.add(new hotel("NH",300,350,arrayExtras[4]));
	 return listaHoteles;
 }
}

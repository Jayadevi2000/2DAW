package Dao;

import java.util.Arrays;

public class hotel {
String nombre;
int regimenA;
int regimenAD;
int[] extras;//garaje,jac,gym
public hotel(String nombre, int regimenA, int regimenAD, int[] extras) {
	this.nombre = nombre;
	this.regimenA = regimenA;
	this.regimenAD = regimenAD;
	this.extras = extras;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getRegimenA() {
	return regimenA;
}
public void setRegimenA(int regimenA) {
	this.regimenA = regimenA;
}
public int getRegimenAD() {
	return regimenAD;
}
public void setRegimenAD(int regimenAD) {
	this.regimenAD = regimenAD;
}
public int[] getExtras() {
	return extras;
}
public void setExtras(int[] extras) {
	this.extras = extras;
}
@Override
public String toString() {
	return "hotel [nombre=" + nombre + ", regimenA=" + regimenA + ", regimenAD=" + regimenAD + ", extras="
			+ Arrays.toString(extras) + "]";
}

}

package modelo;

public class Usuario {
private String lg;
private String clv;
public Usuario(String lg, String clv) {
	
	this.lg = lg;
	this.clv = clv;
}
public String getLg() {
	return lg;
}
public void setLg(String lg) {
	this.lg = lg;
}
public String getClv() {
	return clv;
}
public void setClv(String clv) {
	this.clv = clv;
}
@Override
public String toString() {
	return "Usuario [login=" + lg + ", clave=" + clv + "]";
}


}

package modelo;

public class Usuario {
private String login;
private String clave;
private String tipo;
public Usuario() {
	
}
public Usuario(String login, String clave) {
	
	this.login = login;
	this.clave = clave;
	tipo="";
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getClave() {
	return clave;
}
public void setClave(String clave) {
	this.clave = clave;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
//@Override
/*public String toString() {
	return "Usuario [login=" + login + ", clave=" + clave + ", tipo=" + tipo + "]";
}*/

}

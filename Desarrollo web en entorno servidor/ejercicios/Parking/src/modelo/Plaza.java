package modelo;

public class Plaza {
private int id;
private int planta;
private int plaza;
private String estado;
private String descripcion;
public Plaza() {
	estado="L";
}
public Plaza(int id, int planta, int plaza, String estado, String descripcion) {
	
	this.id = id;
	this.planta = planta;
	this.plaza = plaza;
	this.estado = estado;
	this.descripcion = descripcion;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPlanta() {
	return planta;
}
public void setPlanta(int planta) {
	this.planta = planta;
}
public int getPlaza() {
	return plaza;
}
public void setPlaza(int plaza) {
	this.plaza = plaza;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
@Override
public String toString() {
	return "Plaza [id=" + id + ", planta=" + planta + ", plaza=" + plaza + ", estado=" + estado + ", descripcion="
			+ descripcion + "]";
}

}

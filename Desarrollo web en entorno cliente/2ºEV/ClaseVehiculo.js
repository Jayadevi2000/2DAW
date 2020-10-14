function Vehiculo(titular,tipo,color,marca,an_matriculacion){
	this.titular=titular;
	this.tipo=tipo;
	this.impuesto=verImpuesto(tipo);
	this.color=color;
	this.marca=marca;
	this.an_matriculacion=an_matriculacion;
}
Vehiculo.prototype.calcularSeguro = function() {
	var precio=0;
	if (this.tipo=="moto"){
		precio+=500;
		if (this.color=="blanco") {
			precio-==100;
		}else if(this.an_matriculacion<2010){
			precio+=200;
		}
	}
	if (this.tipo=="coche"){
		precio+=1000;
		if (this.color=="blanco") {
			precio-==100;
		}else if(this.an_matriculacion<2010){
			precio+=200;
		}
	}
	if (this.tipo=="camión"){
		precio+=2000;
		if (this.color=="blanco") {
			precio-==100;
		}else if(this.an_matriculacion<2010){
			precio+=200;
		}
	}
	return precio;
};

Vehiculo.prototype.baja = function() {
this.titular="XXX";
};
var Vehiculo = function(titular, tipo, color, marca,an_matriculacion) {
    this.titular = titular;
    this.tipo = tipo;
    this.impuesto = calculoImpuesto(this.tipo);
    this.color = color;
    this.an_matriculacion = an_matriculacion;
}
function calculoImpuesto(tipo){
	var precio=0;
if(this.tipo=="moto"){
precio+=500;
}
else if(this.tipo=="coche"){
precio+=1000;

}else if(this.tipo=="camión"){
precio+=2000;

}
return precio;
}

Vehiculo.prototype.Baja = function() {
this.titular="XXX";
};
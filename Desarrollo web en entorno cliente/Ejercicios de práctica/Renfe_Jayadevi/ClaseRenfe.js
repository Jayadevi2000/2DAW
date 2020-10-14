function Renfe(codigo ,hsalida,hllegada, tipo, destino, circulacion){
	this.codigo=codigo;
	this.hsalida=hsalida;
	this.hllegada=hllegada;
	this.tipo=tipo;
	this.destino=destino;
	this.circulacion=circulacion;
}
 Renfe.prototype.anadir = function(misTrenes) {
misTrenes.push(this);
 };

  Renfe.prototype.eliminar = function(misTrenes,obj) {
    var i = misTrenes.indexOf(obj);
    misTrenes.splice( i,1 );
};
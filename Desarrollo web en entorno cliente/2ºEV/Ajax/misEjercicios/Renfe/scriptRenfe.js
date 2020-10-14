
var tren1 = new Renfe(this.codigo, this.hsalida,this.hllegada, this.tipo, this.destino, this.circulacion);

window.onload=function(){
	var alta=document.getElementById("alta");
	alta.onclick=dardeAlta;
	var baja=document.getElementById("baja");
	baja.onclick=dardeBaja;
	var codigo_cambiado=document.getElementById("codigo");
	codigo_cambiado.onchange=autorelleno;
}
function autorelleno(){
if(tren1.darAlta=true){
	document.getElementById("codigo").value=tren1.codigo.value;
	document.getElementById("hsalida").value=tren1.hsalida.value;
	document.getElementById("hllegada").value=tren1.hllegada.value;
	document.getElementById("tipo").value=tren1.tipo.value;
	document.getElementById("destino").value=tren1.destino.value;
	document.getElementById("circulacion").value=tren1.circulacion.value;
}
}
function dardeAlta(){
	tren1.darAlta();
	limpiar();
}
function dardeBaja(){
	tren1.darBaja();
	limpiar();
}
function limpiar(){
	document.getElementById("codigo").value="";
	document.getElementById("hsalida").value="";
	document.getElementById("hllegada").value="";
	document.getElementById("tipo").value="";
	document.getElementById("destino").value="";
	document.getElementById("circulacion").value="";
}

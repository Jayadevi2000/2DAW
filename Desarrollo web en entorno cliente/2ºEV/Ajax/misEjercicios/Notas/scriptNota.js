var misNotas=new Array();
window.onload=function(){
var guardar=document.getElementById("guardar");
guardar.onclick=guarda_notas;
alert("hola")


var nombre=document.getElementById("nombre").value;

var nota=document.getElementById("nota").value;


alert("Hola1");
}
function guarda_notas(){alert("Hola2")
var evaluacion=document.getElementById("evaluacion").selectedIndex;alert("Hola2.1")
var bool_ev=true;alert("Hola2.2")
if( evaluacion == null || evaluacion == 0 ) {
 bool_ev=false;
}
var modulo_opcion=document.getElementById("id").selectedIndex;
var bool_mod=true;
if( modulo_opcion == null || modulo_opcion == 0 ) {
 bool_mod=false;
}alert("Hola3")
	if(nombre=="" || nota=="" || bool_mod==false || bool_ev==false){
		alert("todos los campos son obligatorios");
	}else{
	for (var i=0; i<misNotas.length;i++){
		if (nombre==misNotas[i].nombre && modulo_opcion==misNotas[i].id_modulo && evaluacion==misNotas[i].evaluacion && nota==misNotas[i].nota){
			alert("Esta nota de esta persona ya ha sido guardada");
		}else{
			misNotas.Anadir();
			limpiar();
		}
	}
}alert("Hola4")
}


function mostrar_notas_alumno(){

}
function limpiar(){
	document.getElementsByName("id").value="DWS";

document.getElementById("nombre").value="";

document.getElementById("nota").value="";
document.getElementByName("evaluacion").value="1ª";


}
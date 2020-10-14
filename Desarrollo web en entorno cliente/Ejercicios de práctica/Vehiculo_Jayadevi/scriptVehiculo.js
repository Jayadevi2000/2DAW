var misCoches=new Array();
var listaBajas=new Array();

window.onload=function(){
var altaB=document.getElementById('alta');
altaB.onclick=DarAlta;

var titular=document.getElementById('titular');
titular.onchange=AutoRellena;

var bajaB=document.getElementById('baja');
bajaB.onclick=DarBaja;

var siguiente=document.getElementById('siguiente');
siguiente.onclick=Seguir;

var seguro=document.getElementById('seguro');
seguro.onclick=CalcularSeguro;

var estad=document.getElementById('estad');
estad.onclick=CalcularEstad;

var listaB=document.getElementById('Lbajas');
listaB.onclick=ListarBajas;
alert("hola1")
}

function DarAlta(){
var titular=document.getElementById('titular').value;
var tipo=document.getElementsByName('tipo');
var color=document.getElementById('color').value;
var marca=document.getElementById('marca').value;
var matriculacion=document.getElementById('matriculacion').value;
 var tipo2;
var seleccionado = false;
for(var i=0; i<tipo.length; i++) {
  if(tipo[i].checked) {
    seleccionado = true;
     break;
  }}
 if(titular=="" || seleccionado==false || color=="" || marca=="" || matriculacion==""){
 	alert("Rellena todos los campos");
 }else{

for(var i=0; i<tipo.length; i++) {
  if(tipo[i].checked) {
     tipo2=tipo[i].value;
    break;
  }
}
var v1=new Vehiculo(titular,tipo2,color,marca,matriculacion);
misCoches.push(v1);
limpiar();
 } 

}
function AutoRellena(){ alert("hianj");
	for(var i=0;i<misCoches.length;i++){alert("bhubhb")
	if(titular.value==misCoches[i].titular){alert("CDS")
		var tipo=document.getElementsByName('tipo');

for(var i=0; i<tipo.length; i++) {
  tipo[i].checked=misCoches[i].tipo; 
  }
document.getElementById('color').value=misCoches[i].color;
document.getElementById('marca').value=misCoches[i].marca;
document.getElementById('matriculacion').value= misCoches[i].matriculacion;
	}
   }
}
function DarBaja(){
	
var titular=document.getElementById('titular').value;
var tipo=document.getElementsByName('tipo');
var color=document.getElementById('color').value;
var marca=document.getElementById('marca').value;
var matriculacion=document.getElementById('matriculacion').value;
 var tipo2;
var seleccionado = false;
for(var i=0; i<tipo.length; i++) {
  if(tipo[i].checked) {
    seleccionado = true;
     break;
  }}
 if(titular=="" || seleccionado==false || color=="" || marca=="" || matriculacion==""){
 	alert("Rellena todos los campos");
 }else{

for(var i=0; i<tipo.length; i++) {
  if(tipo[i].checked) {
     tipo2=tipo[i].value;
    break;
  }
}
var v1=new Vehiculo(titular,tipo2,color,marca,matriculacion);
listaBajas.push(v1);
v1.Baja();
limpiar();
 } 
}
function Seguir(){
	
}
function CalcularSeguro(){
	
}
function CalcularEstad(){
	
}
function ListarBajas(){
	/*for(var i=0;i<listaBajas.length;i++){
		document.writeln(listaBajas[i].tipo+" - "+listaBajas[i].marca+" - "+listaBajas[i].matriculacion);
	}*/

var div1 = document.createElement("div");
	var tit = document.createElement("h2");
    tit.innerHTML = "LISTADO DE BAJAS";
	
	var div1 = document.createElement("div");
	document.getElementById("division").innerHTML="";
	document.getElementById("division").appendChild(div1);
	div1.appendChild(tit);
	
    
	   for(var i=0; i<misCoches.length;i++){
        if(misCoches[i].titular == "XXX") {
         
             div1.innerHTML +="TIPO : " +  misCoches[i].tipo + "  MARCA : " + misCoches[i].marca + "  AÑO MATRICULACION :" + misCoches[i].matriculacion+"<br/>";
            
        }
   }
}
function limpiar(){
	document.getElementById('titular').value="";
var tipo=document.getElementsByName('tipo');

for(var i=0; i<tipo.length; i++) {
  tipo[i].checked=false; 
  }
document.getElementById('color').value="";
document.getElementById('marca').value="";
document.getElementById('matriculacion').value="";
}
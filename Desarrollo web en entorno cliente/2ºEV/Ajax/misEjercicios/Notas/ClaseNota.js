function Nota(id_modulo, nombre, evaluacion, nota){
	this.id_modulo=id_modulo;
	if (this.id_modulo!="DWS" || this.id_modulo!="DIW" || this.id_modulo!="DAW" || this.id_modulo!="DWC"){
		alert("modulo no válido");
	}
	this.nombre=nombre;
	this.evaluacion=evaluacion;
	if (this.evaluacion!="1ª" || this.id_modulo!="2ª" ){
		alert("evaluación no válida");	
	}
	this.nota=nota;
		if (this.nota<0 || this.nota>10 ){
		alert("nota no válida");
	}
}
Nota.prototype.Anadir = function(misNotas) {
misNotas.push(this);
};
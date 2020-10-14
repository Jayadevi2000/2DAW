var Persona = function(nombre, edad, dni , sexo , peso , altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
    this.sexo=comprobarSexo(sexo);
    this.peso = peso;
    this.altura = altura;
}
function comprobarSexo(sexo){
	if (sexo=="H" || sexo=="M"){

	}else{sexo="H";}
	return sexo;
}
Persona.prototype.calcularIMC=function(){
	var resulIMC=this.peso /(this.altura*this.altura);
	if(resulIMC<20){
		return -1;
	}
	if(resulIMC<25 || resulIMC==20 || resulIMC==25){
		return 0;
	}
	if (resulIMC>20) {
		return 1;
	}

}

Persona.prototype.esMayorDeEdad=function(){
	if (this.edad>18||this.edad==18){
		return true;
	}else return false;
}

Persona.prototype.toString=function(){
	return "Esta persona es "+this.nombre+" cuya edad es de "+this.edad+" , dni "+this.dni+" , sexo "+this.sexo+" , con una altura de "+this.altura+" y un peso de "+this.peso;
}


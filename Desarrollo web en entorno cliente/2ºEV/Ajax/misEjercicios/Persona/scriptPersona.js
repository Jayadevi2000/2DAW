var persona1 = new Persona("Juan",5,"12654997M","x",500,1.76);
var persona2 = new Persona("Roxana",38,"05327702N","M",34,1.68);
var persona3 = new Persona("Ramón",76,"56237412L","H",75,1.84);
//PERSONA1
document.writeln(persona1.toString());
document.writeln(persona1.esMayorDeEdad());
//document.writeln(persona1.calcularIMC());
switch(persona1.calcularIMC()){
	case -1:
	document.writeln("Estas en tu peso ideal.<br />");
	break;
	case 0:
		document.writeln("Estas en por debajo de tu peso ideal.<br />");
	break;
	case 1:
		document.writeln("Tienes sobrepeso.<br />");
	break;

}
document.writeln(persona2.toString());
document.writeln(persona2.esMayorDeEdad());

//PERSONA2
//document.writeln(persona2.calcularIMC());
switch(persona2.calcularIMC()){
	case -1:
	document.writeln("Estas en tu peso ideal.<br />");
	break;
	case 0:
		document.writeln("Estas en por debajo de tu peso ideal.<br />");
	break;
	case 1:
		document.writeln("Tienes sobrepeso.<br />");
	break;

}
//PERSONA3
//document.writeln(persona3.calcularIMC());
document.writeln(persona3.toString());
document.writeln(persona3.esMayorDeEdad());

switch(persona3.calcularIMC()){
	case -1:
	document.writeln("Estas en tu peso ideal.");
	break;
	case 0:
		document.writeln("Estas por debajo de tu peso ideal");
	break;
	case 1:
		document.writeln("Tienes sobrepeso");
	break;

}


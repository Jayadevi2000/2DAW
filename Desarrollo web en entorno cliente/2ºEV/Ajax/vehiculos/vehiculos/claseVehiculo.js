function Vehiculo (titular, tipo, color, marca, matriculacion){
    this.titular = titular;
    this.tipo=tipo;
	if(tipo=="moto" ){
		this.impuesto = 100;
	}
	if(tipo=="coche"  ){
		this.impuesto = 150;
	}
	if(tipo=="camion" ){
		this.impuesto = 250;
	}
    this.color = color;
    this.marca = marca;
    this.matriculacion = matriculacion;
}




Vehiculo.prototype.calcularSeguro = function () {
    var precio = 0;
    if(this.tipo == "coche"){
        precio = 1000;
	}
    else if(this.tipo == "moto"){
         precio = 500;
         }
    else if(this.tipo == "camion") {
         precio = 2000;
        
        }
    
	if(this.color == "blanco"){
            precio -= 100;
        }
    if(this.matriculacion < 2010){
            precio += 200;
        }

    return precio;
}


Vehiculo.prototype.baja = function () {
    this.titular = 'XXX';
}

Vehiculo.prototype.estadistica = function (ArrayCoches) {
    var contCocheA = 0;
    var contMotoA = 0;
    var contCamionA = 0;
    var contCocheD = 0;
    var contMotoD = 0;
    var contCamionD = 0;
    for(var i=0;i<ArrayCoches.length;i++){
		//primero coprobamos que no se haya dado de baja
		if(ArrayCoches[i].titular != "XXX"){
        if(ArrayCoches[i].matriculacion < 2010 && ArrayCoches[i].tipo == "coche"){
            contCocheA++;
        }else if(ArrayCoches[i].matriculacion < 2010 && ArrayCoches[i].tipo == "moto"){
            contMotoA++;
        }else if(ArrayCoches[i].matriculacion < 2010 && ArrayCoches[i].tipo == "camion"){
            contCamionA++;
        }else if(ArrayCoches[i].matriculacion > 2010 && ArrayCoches[i].tipo == "coche"){
            contCocheD++;
        }else if(ArrayCoches[i].matriculacion > 2010 && ArrayCoches[i].tipo == "moto"){
            contMotoD++;
        }else if(ArrayCoches[i].matriculacion > 2010 && ArrayCoches[i].tipo == "camion"){
            contCamionD++;
        }
		}
    }
    var ArrayEstadistica = [contCocheA,contMotoA,contCamionA,contCocheD,contMotoD,contCamionD];
	
    return ArrayEstadistica;
}



´ñ
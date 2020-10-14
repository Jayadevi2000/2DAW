function Coche(titular,tipo,color,marca,an_matriculacion) {
    this.titular = titular;
    this.tipo = tipo;
    this.impuesto = verImpuesto(tipo);
    this.color = color;
    this.marca = marca;
    this.an_matriculacion = an_matriculacion;
}

Coche.prototype.calcularSeguro = function () {
    var precio = 0;
    if(this.tipo == "coche"){
        precio = 1000;
        if(this.color == "blanco"){
            precio -= 100;
        }
        if(this.an_matriculacion < 2010){
            precio += 200;
        }
    }else if(this.tipo == "moto"){
         precio = 500;
        if(this.color == "blanco"){
            precio -= 100;
        }
        if(this.an_matriculacion < 2010){
            precio += 200;
        }
    }else if(this.tipo == "camion") {
         precio = 2000;
        if(this.color == "blanco"){
            precio -= 100;
        }
        if(this.an_matriculacion < 2010){
            precio += 200;
        }
    }else{
        console.log('error seguro');
    }

    return precio;
}

//ver si funciona
Coche.prototype.baja = function () {
    this.titular = 'XXX';
}

Coche.prototype.estadistica = function (ArrayCoches) {
    var contCocheA = 0;
    var contMotoA = 0;
    var contCamionA = 0;
    var contCocheD = 0;
    var contMotoD = 0;
    var contCamionD = 0;
    for(var i=0;i<ArrayCoches.length;i++){
        if(ArrayCoches[i].an_matriculacion < 2010 && ArrayCoches[i].tipo == "coche"){
            contCocheA++;
        }else if(ArrayCoches[i].an_matriculacion < 2010 && ArrayCoches[i].tipo == "moto"){
            contMotoA++;
        }else if(ArrayCoches[i].an_matriculacion < 2010 && ArrayCoches[i].tipo == "camion"){
            contCamionA++;
        }else if(ArrayCoches[i].an_matriculacion > 2010 && ArrayCoches[i].tipo == "coche"){
            contCocheD++;
        }else if(ArrayCoches[i].an_matriculacion > 2010 && ArrayCoches[i].tipo == "moto"){
            contMotoD++;
        }else if(ArrayCoches[i].an_matriculacion > 2010 && ArrayCoches[i].tipo == "camion"){
            contCamionD++;
        }else{
            console.log('error en estadistica clase');
        }
    }
    var ArrayEstadistica = [contCocheA,contMotoA,contCamionA,contCocheD,contMotoD,contCamionD];

    return ArrayEstadistica;
}

var verImpuesto = function (tipo) {
    var precio = 0;
    if(tipo == "moto"){
        precio= 100;
    }else if(tipo == "coche"){
        precio= 150;
    }else if(tipo == "camion"){
        precio= 250;
    }else{
        console.log('error en clase tipo');
    }

    return precio;
}

var verColorAnio = function (precio) {
    if(this.color == "blanco"){
        precio -= 100;
    }
    if(this.an_matriculacion < 2010){
        precio += 200;
    }
    return precio;
}
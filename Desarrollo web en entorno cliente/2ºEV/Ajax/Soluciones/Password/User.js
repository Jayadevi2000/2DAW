function User (login, clave){
    this.login = login;
    this.clave = clave;
}

    User.prototype.esFuerte = function(){
        var contMayus = 0;
        var contMinus = 0;
        var contNum = 0;
        var mayus = "ABCDEFGHIJKLMNPQRTUVWXYZ";
        var minus = "abcdefghijkmnpqrtuvwxyz";
        var numeros = "012346789";
        var arrayMayus = mayus.split("");
        var arrayMinus = minus.split("");
        var arrayNumeros = numeros.split("");
    
        var arrayPass = this.clave.split("");
        for (var i=0; i< arrayPass.length; i++){
            //comparamos cada letra de nuestra contraseña con cada letra mayuscula
            for (var j=0; j<arrayMayus.length; j++){
                if (arrayPass[i] == arrayMayus[j]){
                    //añadimos contador de mayusculas
                    contMayus++;
                    //alert("+1 mayuscula");
                }
            }
            //comparamos cada letra de nuestra contraseña con cada letra minuscula
    
            for (var k=0; k<arrayMinus.length; k++){
                if (arrayPass[i] == arrayMinus[k]){
                    //añadimos contador de minusculas
                    contMinus++;
                    //alert("+1 minuscula");
                }
            }
            //comparamos cada letra de nuestra contraseña con cada numero
    
            for (var n=0; n<arrayNumeros.length; n++){
                if (arrayPass[i] == arrayNumeros[n]){
                    //añadimos contador de minusculas
                    contNum++;
                    //alert("+1 num");
                }
            }
            //alert(arrayPass[i]);
        }
    
        
        if (contMayus >= 1 && contMinus >= 1 && contNum >= 4){
            alert("Tu contraseña ES FUERTE !!");
        }else{
            alert("Tu contraseña NO es fuerte!!");
        }
        
    
    }


User.prototype.generaClave = function(longitud){
    var caracteres = "abcdefghijkmnpqrtuvwxyzABCDEFGHIJKLMNPQRTUVWXYZ2346789";
    var clave = "";
    for (i=0; i<longitud; i++) {
        clave += caracteres.charAt(Math.floor(Math.random()*caracteres.length));
    }
    return clave;
}

User.prototype.addUser = function(listaUs){
    listaUs.push(this);

}


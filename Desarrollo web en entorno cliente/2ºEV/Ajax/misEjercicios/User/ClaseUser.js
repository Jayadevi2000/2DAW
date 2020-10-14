var User = function(usuario,contrasenia){
	 this.usuario = usuario;
    this.contrasenia = contrasenia;
}

 User.prototype.generarPassword = function() {
         var password="";
        for (var i=0;i<longitud;i++){
            var eleccion=Math.floor(Math.random()*3+1);
  
            if (eleccion==1){
                var minusculas=(char)(Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    var mayusculas=(char)(Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    var numeros=(char)(Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
    }
  
 User.prototype.esFuerte = function() {

        var cuentanumeros=0;
        var cuentaminusculas=0;
        var cuentamayusculas=0;
        for (var i=0;i<contrasenia.length();i++){
                if (contrasenia.charAt(i)>=97 && contrasenia.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contrasenia.charAt(i)>=65 && contrasenia.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
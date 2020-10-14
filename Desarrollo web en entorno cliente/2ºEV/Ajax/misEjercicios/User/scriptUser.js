        //Creamos los arrays
  var array_contrasenias=new User[tamanio];
        var fortalezaPassword=new Array[tamanio];
window.onload=function(){
        var tamanio=prompt("Introduce un tamaño para el array");
  
       var longitud=prompt("Introduce la longitud del password");
var btnAlta = document.getElementById("guardar");
    btnAlta.onclick = fuerte;      

    }
  function fuerte(){
        for(var i=0;i<array_contrasenias.length;i++){
         array_contrasenias[i]=new User(longitud);
            fortalezaPassword[i]=array_contrasenias[i].esFuerte();
            document.writeln(array_contrasenias[i].generarPassword()+" "+fortalezaPassword[i]);
        }
    }

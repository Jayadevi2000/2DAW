var listaUs = new Array();


window.onload = function () {
    document.getElementById("genera").onclick = creaUser;
    document.getElementById("muestra").onclick = mostrar;
   
}

function creaUser(){
	 login = document.getElementById("login").value;
     clave = document.getElementById("clave").value;
    var long = document.getElementById("long").value;

    if(long == "" && clave == ""){
		Pclave(8);
        //Crea clave con 8    
        
    }
    else if (clave == "" && !long == ""){
        //Crea clave con long
		Pclave(long);
        
    }
    else if(!long == "" && !clave == ""){
        alert("Estos dos campos no pueden estar rellenos");
    }
    else{
        Pclave("H");
    }

}
function Pclave(valor){
	
    
	var us = new User(login,clave);
		if (valor!="H"){
        var nuevaPass = us.generaClave(valor);
		var us = new User (login, nuevaPass);
		}
		else{
			var us = new User (login, clave);
		}
        
		us.esFuerte();
        us.addUser(listaUs);
}

function mostrar(){
    //creamos los arrays
    

    var titulo = document.createElement("h2");
    titulo.innerHTML = "DATOS DE USUARIOS";
    var div = document.getElementById("div2");

    
	div.innerHTML="";
	div.appendChild(titulo);
    for (var i=0; i<listaUs.length; i++){
     
	div.innerHTML+="Nombre: "+listaUs[i].login+" Contraseña: "+listaUs[i].clave+"<br/>";
       

    }
}

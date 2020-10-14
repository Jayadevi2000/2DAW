function comprobarNombre(palabra){
	if (palabra==null || palabra.length==0 || /^\s+$/.test(palabra) || isNaN(palabra)==false){
		return false;
	}
	else
		return true;
}

function comprobarEmail(correo){
	if (!(/^[_a-z0-9-]+(.[_a-z0-9-]+)*(.[a-z]{2,4})$/.test(correo)) ) {
		return false;
	}
	else
		return true;
}

function comprobarDNI(dni){
	var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
	if( !(/^\d{8}[A-Z]$/.test(dni)) || dni.charAt(8)!=letras[(dni.substring(0, 8))%23]) {
		return false;
	}
	else
		return true;
}

function comprobarEdad(edad){
	if (edad==null || edad.length==0 || /^\s+$/.test(edad) || isNaN(edad)==true){
		return false;
	}
	else
		return true;
}

function comprobarTextarea(textarea){
	if (textarea==null || textarea.length==0 || /^\s+$/.test(textarea)){
		return false;
	}
	else
		return true;
}

function comprobarSelect(seleccionado){
	if (seleccionado==null || seleccionado=="0")
		return false;
	else
		return true;
}

function comprobarRadio(array){
	var seleccion=false;
	var posicion=0;
	for(var i=0; i<array.length; i++) {
		if (array[i].checked){
			seleccion=true;
			posicion=i+1;
		}
	}

	if (!seleccion)
		return false;
	else
		return posicion;
}

function comprobarCheck(check){
	if (!check.checked){
		return false;
	}
	else
		return true;
}
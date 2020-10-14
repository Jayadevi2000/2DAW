window.onload = function() {
    document.getElementById("guardar").onclick = guardar;
    document.getElementById("lista").onclick = lista;
}

var alumnos = Array();
var alumnosTotales = 0;
var aprobados = 0;
var suspensos = 0;

function guardar(){

    var modulo = document.getElementById("modulos").value;
    var nombre = document.getElementById("nombre").value;
    var evaluaciones = document.getElementsByName("evaluacion");
    for(var i=0;i<evaluaciones.length;i++){
        if(evaluaciones[i].checked)
        var evaluacion = evaluaciones[i].value;
    }
    var nota = document.getElementById("nota").value;

    var alumno = new Notas(modulo, nombre, evaluacion, nota); //creamos un alumno

    if(comprobarFormato(alumno, nombre,modulo,evaluacion)){ //aqui comprobamos si el nombre/nota no estan vacios y si no es un alumno repetido
        

        alumnos.push(alumno);
        alumnosTotales++;

        if(alumno.nota >= 5){
            aprobados++;
        }else{
            suspensos++;
        }
        
        alert("Alumno registrado.");
    }else{
        alert("No se pudo registrar al alumno.");
    }

    
}

function lista(){

    var listado = document.getElementById("listado");

    listado.innerHTML = ""; //vaciamos lo que habia anteriormente

    for(var i=0; i<alumnos.length; i++){

        //alert(alumnos[i].alumno);
        listado.innerHTML += "<p>";

        listado.innerHTML += "<b>Nombre:</b> " + alumnos[i].nombreAlumno + "<br>";
        listado.innerHTML += "<b>Módulo:</b> " + alumnos[i].idModulo + "<br>";
        listado.innerHTML += "<b>Evaluación:</b> " + alumnos[i].evaluacion + "<br>";
        listado.innerHTML += "<b>Nota:</b> " + alumnos[i].nota + "<br>";

        listado.innerHTML += "</p>";
    }

    listaPorcentajes();
}

function comprobarFormato(alumno,nombre,modulo,evaluacion){

    if(alumno.nombreAlumno != null && alumno.nota != null && alumno.idModulo != undefined){
        //se pudo crear al alumno

        for(var i = 0; i < alumnos.length; i++){
            if(nombre == alumnos[i].nombreAlumno && modulo == alumnos[i].idModulo && evaluacion == alumnos[i].evaluacion){
                alert("Este alumno ya tiene una nota en este modulo esta evaluación");
                return false;
            }
        }

        return true;
    }else{
        return false;
    }

     
}

function listaPorcentajes(){

    var porcentajes = document.getElementById("porcentajes");

    porcentajes.innerHTML = ""; //vaciamos lo que habia anteriormente


    porcentajes.innerHTML += "<p style=\"color:green;\">";
    porcentajes.innerHTML += "<b>Aprobados:</b> "+Math.round((aprobados/alumnosTotales)*100)+"%";
    porcentajes.innerHTML += "</p>";

    porcentajes.innerHTML += "<p style=\"color:red;\">";
    porcentajes.innerHTML += "<b>Suspensos:</b> "+Math.round((suspensos/alumnosTotales)*100)+"%";
    porcentajes.innerHTML += "</p>";

}
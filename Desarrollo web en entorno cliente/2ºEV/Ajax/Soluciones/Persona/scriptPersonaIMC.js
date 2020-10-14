window.onload = function () {

    var botonIMC = document.getElementById("imc");
    botonIMC.onclick = calcular;

}

function calcular() {
    var nombre = document.getElementById("nombre").value;
    var edad = document.getElementById("edad").value;
    var dni = document.getElementById("dni").value;
    var sexo = document.getElementById("sexo").value;
    var peso = document.getElementById("peso").value;
    var altura = document.getElementById("altura").value;
    var miPersona = new Persona(nombre, edad, dni, sexo, peso, altura);
    if (miPersona.esMayorDeEdad()) {
        alert(nombre + " es mayor de edad");
    } else {
        alert(nombre + " es menor de edad");
    }
    borrarCampos();
    if (miPersona.calcularIMCs() == -1) {
        alert(nombre + " tiene IMC por debajo de 20");
    } else if (miPersona.calcularIMCs() == 0) {
        alert(nombre + " tiene IMC normal");
    } else {
        alert(nombre + " tiene IMC por encima de 25");
    }
    alert(miPersona.toString());
    crearElemento(miPersona);

}
function borrarCampos() {
    var nombre = document.getElementById("nombre");
    var edad = document.getElementById("edad");
    var dni = document.getElementById("dni");
    var sexo = document.getElementById("sexo");
    var peso = document.getElementById("peso");
    var altura = document.getElementById("altura");
    nombre.value = "";
    edad.value = "";
    dni.value = "";
    sexo.value = "";
    peso.value = "";
    altura.value = "";
}

function crearElemento(persona) {

    var nodo = document.createElement('table');
    nodo.border = "2";
    var nodo2 = document.createElement('tr');
    var textnode = document.createTextNode(persona.toString());
    nodo2.appendChild(textnode);
    nodo.appendChild(nodo2);
    document.getElementById("resultado").appendChild(nodo);
}
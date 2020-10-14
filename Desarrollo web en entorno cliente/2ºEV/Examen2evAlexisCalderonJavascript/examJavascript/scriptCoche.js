var arrayCoches = new Array();
var actualArray = 0;

window.onload = function () {
    var titular = document.getElementById("titular");
    titular.onchange = mostrarDatos;

    var siguiente = document.getElementById("siguiente");
    siguiente.onclick = cambio;

    var alta = document.getElementById("alta");
    alta.onclick = darAlta;

    var baja = document.getElementById("baja");
    baja.onclick = darBaja;

    var seguro = document.getElementById("calSeguro");
    seguro.onclick = calcSeguro;

    var tipoSelec = document.getElementsByName("tipoSeguro");
    for (var i=0; i<tipoSelec.length; i++){
        tipoSelec[i].onclick = mostrarCouta;
    }

    var estad = document.getElementById("estadistica");
    estad.onclick = estadisticas;

    var bajas = document.getElementById("bajasList");
    bajas.onclick = bajasCoches;
}

var darAlta = function () {
    var titulo = document.getElementById("titular").value;
    var tipo = "";
    var tipoSelec = document.getElementsByName("tipo");
    for (var i=0; i<tipoSelec.length; i++){
        if (tipoSelec[i].checked == true){
            tipo = tipoSelec[i].value;
        }
    }
    var color = document.getElementById("color").value;
    var marca = document.getElementById("marca").value;
    var anio = document.getElementById("aniom").value;

    for(var i=0; i<arrayCoches.length;i++){
        if(arrayCoches[i].titular == titulo && arrayCoches[i].tipo == tipo && arrayCoches[i].color == color && arrayCoches[i].marca == marca && arrayCoches[i].an_matriculacion == anio) {
            alert('ya existe');
            break;
        }
    }

    var coche = new Coche(titulo,tipo,color,marca,anio);
    arrayCoches.push(coche);
    console.log(arrayCoches);
    alert("dado de alta");
    borrar();
}

var darBaja = function () {
    var titulo = document.getElementById("titular").value;
    for(var i=0; i<arrayCoches.length;i++){
        if(arrayCoches[i].titular == titulo) {
            arrayCoches[i].baja();
            alert("dado de baja");
        }
    }
}

var mostrarDatos = function () {
    if(arrayCoches.length == 0){
        console.log('no hay coches');

    }else{
        for(var i=0; i<arrayCoches.length;i++){
            if(arrayCoches[i].titular == this.value){

                document.getElementById("titular").value = arrayCoches[i].titular;
                var tipo = document.getElementsByName("tipo");
                for (var j=0; j<tipo.length; j++) {
                    if (tipo[j].value == arrayCoches[i].tipo) {
                        tipo[j].checked = true;
                    }
                }
                document.getElementById("color").value =  arrayCoches[i].color;
                document.getElementById("marca").value =  arrayCoches[i].marca;
                document.getElementById("aniom").value =  arrayCoches[i].an_matriculacion;

                document.getElementById("siguiente").disabled = false;
                actualArray = i;
            }else{
                console.log('no se encuetra ese coche');
            }
        }
    }
}

var cambio = function () {
    for(var i=actualArray+1; i<arrayCoches.length;i++){
        if(arrayCoches[i].titular == this.value){

            document.getElementById("titular").value = arrayCoches[i].titular;
            var tipo = document.getElementsByName("tipo");
            for (var j=0; j<tipo.length; j++) {
                if (tipo[j].value == arrayCoches[i].tipo) {
                    tipo[j].checked = true;
                }
            }
            document.getElementById("color").value =  arrayCoches[i].color;
            document.getElementById("marca").value =  arrayCoches[i].marca;
            document.getElementById("aniom").value =  arrayCoches[i].an_matriculacion;

            document.getElementById("siguiente").disabled = false;
            actualArray = i;
        }
    }
}

var borrar = function () {
    document.getElementById("titular").value = "";
    var tipo = document.getElementsByName("tipo");
    for (var j=0; j<tipo.length; j++) {
        tipo[j].checked = false;
    }
     document.getElementById("color").value = "";
    document.getElementById("marca").value = "";
    document.getElementById("aniom").value = "";
}

var calcSeguro = function () {
    var titulo = document.getElementById("titular").value;
    for(var i=0; i<arrayCoches.length;i++){
        if(arrayCoches[i].titular == titulo) {
            var seguro = arrayCoches[i].calcularSeguro();
            document.getElementById("precioSeguro").value = seguro;
        }
    }
}

var mostrarCouta = function () {
    console.log(this.value + "valor de chceckbox");
    var cuota = 0;
    var precioSeguro = document.getElementById("precioSeguro").value;
    if(precioSeguro == ""){
        alert("primero calcular seguro!");
    }else{
        if(this.value == "mensual"){
            //el precio anual lo dividimos por 12 meses
            cuota = precioSeguro / 12;
        }else if(this.value  == "semestral"){
            //dividimos por 6 meses
            cuota = precioSeguro / 6;
        }else if(this.value  == "anual") {
            //dividimos por 1 año
            cuota = precioSeguro / 1;
        }else{
            console.log('error en couta');
        }
    }
    document.getElementById("couta").value = cuota;
}

var estadisticas = function () {
    var div = document.createElement("div");

    var c = new Coche();
    var lista = c.estadistica(arrayCoches);

        var p1 = document.createElement("p");
        var p2 = document.createElement("p");
        var p3 = document.createElement("p");

        p1.innerHTML = "Coches matriculados antes 2010: " + lista[0] + " y despues de 2010: " + lista[3];
        p2.innerHTML = "Motos matriculados antes 2010: " + lista[1] + " y despues de 2010: " + lista[4];
        p3.innerHTML = "Camiones matriculados antes 2010: " + lista[2] + " y despues de 2010: " + lista[5];

        div.appendChild(p1);
        div.appendChild(p2);
        div.appendChild(p3);

    document.getElementById("estadisticaField").appendChild(div);

}

var bajasCoches = function () {
    var div = document.createElement("div");

    for(var i=0; i<arrayCoches.length;i++){
        if(arrayCoches[i].titular == "XXX") {
            var p = document.createElement("p");
            p.innerHTML = i + ": " + "TIPO - " +  arrayCoches[i].tipo + " - MARCA - " + arrayCoches[i].marca + " - AÑO MATRICULACION -" + arrayCoches[i].an_matriculacion;
            div.appendChild(p);
        }
    }

    document.getElementById("bajasField").appendChild(div);

}
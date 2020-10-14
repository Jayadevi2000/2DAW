function Cine(pelicula, precio) {
    this.asientos = [];
    this.pelicula = pelicula;
    this.precio = precio;
    for (var i = 1; i < 9; i++) {
        for (var j = 65; j < 74; j++) {
            this.asientos.push(new Asiento(i, String.fromCharCode(j)));
        }
    }
}

function Pelicula(titulo, duracion, edadMin, director) {
    this.titulo = titulo;
    this.duracion = duracion;
    this.edadMin = edadMin;
    this.director = director;

}

function Espectador(nombre, edad, dinero) {
    this.nombre = nombre;
    this.edad = edad;
    this.dinero = dinero;
}

function Asiento(numeroF, letraC) {
    this.numeroF = numeroF;
    this.letraC = letraC;
    this.ocupado = false;
}

Asiento.prototype.toString = function () {
    return this.numeroF + "" + this.letraC;
};
Cine.prototype.visualizar = function () {
    debugger;
    var stringReturn = "";
    for (var i = 8; i > 0; i--) {
        for (var j = 0; j < this.asientos.length; j++) {
            if (this.asientos[j].numeroF === i) {
                if (this.asientos[j].ocupado) {
                    stringReturn += "<span style='background-color:#ff6666'>" + this.asientos[j] + "</span> ";
                } else {
                    stringReturn += "<span style='background-color:lightblue'>" + this.asientos[j] + "</span> ";
                }
            }
        }
        stringReturn += "<br/>";
    }
    return stringReturn;
};

Cine.prototype.llenarAsientos = function (numeroEspectadores) {
    debugger;
    var espectadorSentado;
    var asientoAleatorio;
    for (var i = 0; i < numeroEspectadores; i++) {
        do {
            espectadorSentado = false;
            asientoAleatorio = this.dameAsientoAleatorio();
            if (!asientoAleatorio.ocupado) {
                asientoAleatorio.ocupado = true;
                espectadorSentado = true;
            }
        } while (!espectadorSentado);
    }
};

function dameRandom(min, max) {
    return Math.floor(Math.random() * (max - min)) + min;
}

Cine.prototype.sentarEspectador = function (espectador) {
    var espectadorSentado;
    if (espectador.dinero > this.precio && espectador.edad > this.pelicula.edadMin) {
        espectador.dinero -= this.precio;
        do {
            espectadorSentado = false;
            asientoAleatorio = this.dameAsientoAleatorio();
            if (!asientoAleatorio.ocupado) {
                asientoAleatorio.ocupado = true;
                espectadorSentado = true;
            }
        } while (!espectadorSentado);
    }
};

Cine.prototype.dameAsientoAleatorio = function () {
    return this.asientos[dameRandom(0, this.asientos.length)];
};
function Renfe(codigo, hsalida, hllegada, tipo, destino, circulacion) {
    this.codigo = codigo;
    this.hsalida = hsalida;
    this.hllegada = hllegada;
    this.tipo = tipo;
    this.destino = destino;
    this.circulacion = circulacion;

}

Renfe.prototype.darAlta = function(arraytren) {
trenExiste = false;
    for (var i = 0; i < arraytren.length; i++) {
        if (this.codigo == arraytren[i].codigo && this.hsalida == arraytren[i].hsalida && this.hllegada == arraytren[i].hllegada && this.circulacion == arraytren[i].circulacion && this.tipo == arraytren[i].tipo && this.destino == arraytren[i].destino) {
            trenExiste = true;
        }
    }
    if (!trenExiste) {
        arraytren.push(this);
        alert("Nota añadida");
    } else {
        alert("Nota no añadida");
    }
    return arraytren;
};
Renfe.prototype.darBaja = function () {

if (tren.codigo==this.codigo){
	  tren.codigo = "";
    tren.hsalida = "";
    tren.hllegada = "";
    tren.tipo = "";
    tren.destino =  "";
    tren.circulacion =  "";
}else{
	alert("Ese código no está registrado, por lo tanto no hay nada que dar de baja.");
}
}


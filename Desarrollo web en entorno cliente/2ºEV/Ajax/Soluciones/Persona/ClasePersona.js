function Persona(nombre, edad, dni, sexo, peso, altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
    this.sexo = comprobarSexo(sexo);
    this.peso = peso;
    this.altura = altura / 100;
    this.imc = 0;


    Persona.prototype.calcularIMCs = function () {
        var res;
        res = this.peso / (this.altura ^ 2);
        this.imc = Math.round(res * 100) / 100;
        if (res < 20) {
            return -1;
        } else if (res >= 20 && res <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    Persona.prototype.esMayorDeEdad = function () {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    function comprobarSexo(charSexo) {
        if (charSexo == "H" || charSexo == "M") {
            return charSexo;
        } else {
            charSexo = "H";
            return charSexo;
        }
    }
    Persona.prototype.toString = function () {
        var salida =
            "Nombre: " + this.nombre + "\n" +
            "Edad: " + this.edad + "\n" +
            "Dni: " + this.dni + "\n" +
            "Sexo: " + this.sexo + "\n" +
            "Peso: " + this.peso + " kg \n" +
            "Altura: " + this.altura + " m \n" +
            "IMC: " + this.imc;
        return salida;
    }
}
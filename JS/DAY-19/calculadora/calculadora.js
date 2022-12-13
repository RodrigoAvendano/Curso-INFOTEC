class Calculadora {
    constructor(number) {
        this.number = number;
        this.resultado = 0;
    }

    sumar(number) {
        this.resultado += document.getElementById("screen").value;
    }

    restar() {

    }

    multiplicar() {

    }

    division() {

    }

}

let teclas = document.querySelectorAll(".numbers");
teclas.forEach(element => element.addEventListener('click', write));

function write() {
    console.log("oh");
}
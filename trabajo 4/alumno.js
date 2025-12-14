class Alumno {
    
    constructor(nombre, curso, promedioInicial) {
        
        this.nombre = nombre;
        this.curso = curso;
        this.promedio = promedioInicial;
    }

    saludar() {
        console.log(`Hola, soy ${this.nombre} y estoy en el curso ${this.curso}.`);
    }

    mostrarPromedio() {
        console.log(`El promedio actual de ${this.nombre} es: ${this.promedio}`);
    }

    aumentarPromedio(valor) {
        
        this.promedio += valor;
        console.log(`${this.nombre} ha aumentado su promedio en ${valor} puntos.`);
        this.mostrarPromedio(); 
    }
}

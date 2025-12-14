public class alumno {
    
    String nombre;
    String curso;
    double promedio;

    public alumno(String nombre, String curso, double promedioInicial) {
        this.nombre = nombre;
        this.curso = curso;
        this.promedio = promedioInicial;
    }

    public void saludar() {
        System.out.println("Hola, soy " + this.nombre + " y estoy en el curso " + this.curso);
    }
    
    public void mostrarPromedio() {
        System.out.println("El promedio actual de " + this.nombre + " es: " + this.promedio);
    }
    
    public void aumentarPromedio(double valor) {
        this.promedio += valor; 
        System.out.println(this.nombre + " ha aumentado su promedio en " + valor + ".");
        this.mostrarPromedio();
    }
}
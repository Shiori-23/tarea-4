public class main {
    public static void Main (String[] args) {
        
        alumno alumno1 = new alumno("Fuwawa", "7mo5ta", 8.5);
        
        System.out.println("\n--- PRUEBAS INICIALES ---");
        alumno1.saludar();
        
        System.out.println("\n--- PRUEBAS DE PROMEDIO (TAREA 4) ---");
        
        alumno1.mostrarPromedio();
        
        alumno1.aumentarPromedio(0.5); 
        
        alumno1.mostrarPromedio();
        
        System.out.println("\n--- FIN DE PRUEBAS ---");
    }
}
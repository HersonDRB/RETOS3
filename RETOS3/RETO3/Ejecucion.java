package RETOS3.RETO3;

public class Ejecucion {
    public static void main(String[] args) {
        Empleado persona = new Empleado();
        persona.pedirDatos();
        persona.mostrarHorarios();
        persona.calcularImc();
        persona.mayorEdad();
        int honorarios = persona.calcularHonorarios();
        System.out.println("El valor de los honorarios del empleado es: " + honorarios);
    }
}

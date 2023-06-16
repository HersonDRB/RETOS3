package RETOS3.RETO1.Principal;

import RETOS3.RETO1.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
    }
}

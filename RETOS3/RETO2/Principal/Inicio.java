package RETOS3.RETO2.Principal;

import RETOS3.RETO2.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.pedirDatos();
        persona.mostrarPersona();

        String resultadoImc = persona.calcularImc();
        if (resultadoImc.equals("PESOBAJO")) {
            System.out.println("\nEl peso está por debajo de lo ideal");
        } else if (resultadoImc.equals("PESOIDEAL")) {
            System.out.println("\nEl peso es ideal");
        } else {
            System.out.println("\nTiene sobrepeso");
        }

        persona.mayorEdad();
    }
}

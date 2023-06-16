package RETOS3.RETO1.Salud;

import java.util.Scanner;

public class Persona {
    String tipoDoc, nombre, apellido, sexo;
    int documento, edad;
    double peso, estatura;
    
    public void pedirDatos() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de documento: ");
        tipoDoc = leer.next();
        
        System.out.println("Ingrese el número de documento: ");
        documento = leer.nextInt();
        
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        
        System.out.println("Ingrese su apellido: ");
        apellido = leer.next();
        
        System.out.println("Ingrese su peso en kg: ");
        peso = leer.nextDouble();
        
        System.out.println("Ingrese su estatura en metros: ");
        estatura = leer.nextDouble();
        
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();
        
        System.out.println("Ingrese su sexo: ");
        sexo = leer.next();

        leer.close();
    }
    
    public void mostrarPersona(){
        System.out.println("\nSu tipo de documento es: " + tipoDoc);
        System.out.println("Su número de documento es: " + documento);
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su apellido es: " + apellido);
        System.out.println("Su peso es: " + peso);
        System.out.println("Su estatura es: " + estatura);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su sexo es: " + sexo);
    }
    
    public void calcularImc() {
        double pesoActual = peso / (estatura * estatura);
        
        if (pesoActual < 20) {
            System.out.println("\nEl peso está por debajo de lo ideal");
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("\nEl peso es ideal");
        } else {
            System.out.println("\nTiene sobrepeso");
        }
    }
    
    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println("\nEs mayor de edad");
        } else {
            System.out.println("\nNo es mayor de edad");
        }
    }
}

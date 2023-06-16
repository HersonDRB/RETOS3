package RETOS3.RETO3;

import java.util.Scanner;

public class Persona {
    private String tipoDoc, nombre, apellido, sexo;
    private int documento, edad;
    private double peso, estatura;
    
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
    
    public String calcularImc() {
        double pesoActual = peso / (estatura * estatura);
        
        if (pesoActual < 20) {
            return "PESOBAJO";
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }
    
    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println("\nEs mayor de edad");
        } else {
            System.out.println("\nNo es mayor de edad");
        }
    }


    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
}

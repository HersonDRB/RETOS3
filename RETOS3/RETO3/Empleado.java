package RETOS3.RETO3;

import java.util.Scanner;

public class Empleado extends Persona {
    private String cargo, departamento;
    private int valorHora, horasTrabajadas;

    public void pedirDatos() {
        super.pedirDatos();
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba su cargo por favor: ");
        cargo = leer.nextLine();

        System.out.println("Ingrese cual es el valor que gana por hora: ");
        valorHora = leer.nextInt();

        System.out.println("Ingrese las horas que ha trabajado: ");
        horasTrabajadas = leer.nextInt();

        System.out.println("Escriba en el departamento en el que está: ");
        departamento = leer.next();

        leer.close();
    }

    public void mostrarHorarios() {
        int RETEICA = (int) (((valorHora * horasTrabajadas) * 0.966) / 100);
        mostrarPersona(); 
        System.out.println("El cargo que tiene es de: " + cargo);
        System.out.println("Las horas trabajadas son: " + horasTrabajadas);
        System.out.println("El valor por hora es: " + valorHora);
        System.out.println("El total a pagar es: " + RETEICA);
    }

    public int calcularHonorarios() {
        int RETEICA = (int) (((valorHora * horasTrabajadas) * 0.966) / 100);
        return (valorHora * horasTrabajadas) - RETEICA;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
package RETOS3.RETO5;

import java.util.Random;
import java.util.Scanner;   

public class Ppt  {
    private String nombre;
    private int opcionJugador;
    private int numAleatorio;
    // metodos constructores

    public Ppt() {}

    public Ppt(String nombre, int opcionJugador, int numAleatorio) {
        this.opcionJugador = opcionJugador;
        this.nombre = nombre;
        this.numAleatorio = numAleatorio;
    }

    Scanner leer = new Scanner(System.in);

    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador: ");
        nombre = leer.nextLine();
    }

    public void jugar() {
        System.out.println(nombre + " realice su eleccion: \n 1.Piedra \n 2.Papel \n 3.Tijera");
        opcionJugador = leer.nextInt();
        Random aleatorio = new Random();
        numAleatorio = aleatorio.nextInt(3) + 1;
        System.out.println("*Elgiendo*");
    }

    public void finalizar() {
        if (numAleatorio == 1 && opcionJugador == 1) {
            System.out.println("Sacaste piedra y la maquina saco piedra, Empate " + nombre);
        } else if (numAleatorio == 2 && opcionJugador == 2) {
            System.out.println("Sacaste papel y la maquina saco papel, Empate " + nombre);
        } else if (numAleatorio == 3 && opcionJugador == 3) {
            System.out.println("Sacaste tijera y la maquina saco tijera, Empate " + nombre);
        } else if (numAleatorio == 1 && opcionJugador == 2) {
            System.out.println("Sacaste papel y la maquina saco piedra, Ganaste " + nombre);
        } else if (numAleatorio == 2 && opcionJugador == 3) {
            System.out.println("Sacaste tijera y la maquina saco papel, Ganaste " + nombre);
        } else if (numAleatorio == 3 && opcionJugador == 1) {
            System.out.println("Sacaste piedra y la maquina saco tijera, Ganaste " + nombre);
        } else if (numAleatorio == 2 && opcionJugador == 1) {
            System.out.println("Sacaste piedra y la maquina saco papel, Perdiste " + nombre);
        } else if (numAleatorio == 3 && opcionJugador == 2) {
            System.out.println("Sacaste papel y la maquina saco tijera, Perdiste " + nombre);
        } else if (numAleatorio == 1 && opcionJugador == 3) {
            System.out.println("Sacaste tijera y la maquina saco piedra, Perdiste " + nombre);
        }
    }

}

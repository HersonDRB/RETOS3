package RETOS3.RETO4;

import java.util.Scanner;

public class Figura {
    private String figura;
    private double radio, base, altura;

    public void elegirFigura() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Elija una figura (1) círculo, (2) rectángulo, (3) triángulo, (4) pentágono: ");
        figura = leer.nextLine();

        if (figura.equalsIgnoreCase("1")) {
            System.out.println("Ingrese el radio del círculo: ");
            radio = leer.nextDouble();
        } else if (figura.equalsIgnoreCase("2")) {
            System.out.println("Ingrese la base del rectángulo: ");
            base = leer.nextDouble();
            System.out.println("Ingrese la altura del rectángulo: ");
            altura = leer.nextDouble();
        } else if (figura.equalsIgnoreCase("3")) {
            System.out.println("Ingrese la base del triángulo: ");
            base = leer.nextDouble();
            System.out.println("Ingrese la altura del triángulo: ");
            altura = leer.nextDouble();
        } else if (figura.equalsIgnoreCase("4")) {
            System.out.println("Ingrese la longitud del lado del pentágono: ");
            base = leer.nextDouble();
        } else {
            System.out.println("Figura no válida.");
        }

        leer.close();
    }

    public void operacion() {
        if (figura.equalsIgnoreCase("1")) {
            double area = Math.PI * radio * radio;
            System.out.println("El área del círculo es: " + area);
        } else if (figura.equalsIgnoreCase("2")) {
            double area = base * altura;
            System.out.println("El área del rectángulo es: " + area);
        } else if (figura.equalsIgnoreCase("3")) {
            double area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);
        } else if (figura.equalsIgnoreCase("4")) {
            double area = (5 * base * base) / (4 * Math.tan(Math.PI / 5));
            System.out.println("El área del pentágono es: " + area);
        }
    }

    public void mostrarFigura() {
        if (figura.equalsIgnoreCase("1")) {
            System.out.println("Figura seleccionada: Círculo");
            System.out.println("Radio: " + radio);
        } else if (figura.equalsIgnoreCase("2")) {
            System.out.println("Figura seleccionada: Rectángulo");
            System.out.println("Base: " + base);
            System.out.println("Altura: " + altura);
        } else if (figura.equalsIgnoreCase("3")) {
            System.out.println("Figura seleccionada: Triángulo");
            System.out.println("Base: " + base);
            System.out.println("Altura: " + altura);
        } else if (figura.equalsIgnoreCase("4")) {
            System.out.println("Figura seleccionada: Pentágono");
            System.out.println("Longitud del lado: " + base);
        }
    }
}

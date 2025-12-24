//Crea un programa que pida diez números reales por teclado, los almacene en un
// array, y luego muestre todos sus valores.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración e instanciación del array
        float almacena10num[] = new float[10];

        //petición de los números
        for (int i = 0; i < almacena10num.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            almacena10num [i] = sc.nextFloat();
        }

        //Mostramos los valores introducidos
        System.out.println("Valores introducidos:");
        for (int i = 0; i < almacena10num.length; i++) {
            System.out.println("Posición " + i + ": " + almacena10num[i]);
        }
    }
}


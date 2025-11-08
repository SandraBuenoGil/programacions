//Programa que me permite calcular el factorial de una serie de números acabada con la introducción del número -1.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        int numInt, factorial = 0;

        //Comienzo del bucle
        do {
            System.out.println("Introduce un número positivo: ");
            numInt = entrada.nextInt();
        //Si el número es mayor que -1 se ejecuta la operación
            if (numInt > -1) {
                factorial = 1;
                for (int cont = 1; cont <= numInt; cont++){
                    factorial = factorial * cont;
                }
                System.out.println("El factorial de " + numInt + " es: " + factorial);
        //Si es menor que -1 dice que hay un error
            } else if (numInt < -1) {
                System.out.println("El número no puede ser negativo.");
            }
        }
        while (numInt != -1);
        System.out.println("Fin del programa.");
    }
}
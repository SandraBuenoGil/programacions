//Programa que lee un numero entero y positivo y nos indica si es primo o no.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//declaración de variables
        int num = 0;
//inicio del bucle
        while (num != -1) {

            //petición del número
            System.out.println("Introduce un número.");
            num = entrada.nextInt();

            //si el número es divisible por 1 o por sí mismo.
            if (num < 2) {
                System.out.println("El número no es primo");
            } else {
                for (int i = 2; i <= num; i++) {
                    if (num % i == 0) {
                        System.out.println("El número es primo.");
                    } else {
                        System.out.println("El número no es primo");
                    }
                } //fin for
            }

        }//fin While
        System.out.println("Fin del programa");
    }
}
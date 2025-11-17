//Programa que lee un numero entero y positivo y nos indica
// si es primo o no.

import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//declaración de variables
        int num = 0, i;
        boolean isPrimo = true;

//inicio del bucle
        while (num != -1) {

            //petición del número
            System.out.println("Introduce un número.");
            num = entrada.nextInt();

            //si el número es divisible por 1 o por sí mismo.
            if (num < 2) {
                System.out.println("El número no es primo");
                isPrimo = false;
            } else {
                i=2;
                while(i <= Math.sqrt(num) && isPrimo==true) {
                    if (num % i == 0) {
                        isPrimo = false;
                    }
                    i++;
                } //fin for
                if (isPrimo == true) {
                    System.out.println("El número es primo.");

                } else {
                    System.out.println("El número no es primo");
                }
            }
            isPrimo = true;
        }//fin While
        System.out.println("Fin del programa");
    }
}
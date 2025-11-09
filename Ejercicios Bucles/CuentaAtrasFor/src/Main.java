//Programa que permite realizar una cuenta atras, desde el numero que introduzca el usuario hasta cero.
// Ejemplo con For.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        int numIni;

        System.out.println("Introduce un número");
        numIni = entrada.nextInt();

        //inicio del bucle For para contar hacia atrás
        for (int num = numIni ; num >= 0 ; num--) {
            System.out.println(num);
        }
    }
}
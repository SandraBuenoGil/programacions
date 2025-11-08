//Programa que permite realizar una cuenta atras, desde el numero que introduzca el usuario hasta cero.
// Ejemplo con Do While.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        int num;

        System.out.println("Introduce un número");
        num = entrada.nextInt();

        //inicio del bucle Do While para contar hacia atrás
        do {
            System.out.println(num);
            num--;
        }
        while (num >= 0);
    }
}
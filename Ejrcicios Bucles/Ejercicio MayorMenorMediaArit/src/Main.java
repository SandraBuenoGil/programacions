//Pediremos numeros, y diremos cual es el doble del numero introducido.
// Pararemos cuando el numero introducido sea cero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //declaración de variable
        int num, doble;

        //pedida del número
        System.out.println("Introduce un número. Para finalizar el programa introduce 0");
        num = entrada.nextInt();

        //inicio del bucle

        while (num>0) {
            doble = num * 2;
            System.out.println("El doble de " + num + " es " + doble);

            System.out.println("Introduce un número. Para finalizar el programa introduce 0");
            num = entrada.nextInt();
        }
        System.out.println("Fin del programa.");
    }
}
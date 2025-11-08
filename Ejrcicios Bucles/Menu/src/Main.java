//Programa que muestra un menú con las siguientes opciones:
//
//Suma.
//Resta.
//Multiplicación.
//División.
//Salir.
//Y permite hacer las operaciones con dos numeros hasta que pulsemos la opción de salir.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        int numMenu = 0, resultado, num1, num2;

        //Inicio del bucle
        while (numMenu != 5) {

            //Preguntar cual operación se quiere hacer
            System.out.println("Introduce el número de la operación quieres realizar? \n" +
                    "1 - Suma \n" +
                    "2 - Resta \n" +
                    "3 - Multiplicación \n" +
                    "4 - División \n" +
                    "5 - Salir del programa");
            numMenu = entrada.nextInt();

            if (numMenu > 5 && numMenu < 0) {
                System.out.println("El número selector de la operación es erroneo.");
            } else {
                //Pedida de número para la operación
                System.out.println("Introdice el primer número");
                num1 = entrada.nextInt();

                System.out.println("Introduce el segundo número");
                num2 = entrada.nextInt();

                //Si la operación es suma
                if (numMenu == 1) {
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    if (numMenu == 2) {
                        resultado = num1 - num2;
                        System.out.println("El resultado es: " + resultado);
                    } else {
                        if (numMenu == 3) {
                            resultado = num1 * num2;
                            System.out.println("El resultado es: " + resultado);
                        } else {
                            if (numMenu == 4) {
                                resultado = num1 / num2;
                                System.out.println("El resultado es: " + resultado);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Fin del programa.");
    }
}
/**/
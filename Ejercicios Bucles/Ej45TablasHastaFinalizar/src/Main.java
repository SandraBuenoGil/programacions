//Crear un programa que pida un número entero y muestre la tabla de multiplicar correspondiente a dicho número.
// El programa terminará cuando pulsemos el valor -1.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        //Declaración de variables
        int tabla, result;

        //petición de la tabla o si se quiere salir ocn -1
        System.out.println("Qué tabla quieres ver? Introduce -1 para salir.");
        tabla = numeros.nextInt();

        //Inicio del bucle While para ejecutar el programa mientras no sea -1
        while (tabla > -1) {

        //Bulcle For para calcular la tabla
            for (int cont = 0; cont <= 10; cont++) {
                System.out.println("Tabla del " + tabla);
                result = tabla * cont;
                System.out.println(tabla + " * " + cont + "=" + result);
            }
            System.out.println("Qué tabla quieres ver? Introduce -1 para salir.");
            tabla = numeros.nextInt();
        }
        System.out.println("Fin del programa");
    }
}
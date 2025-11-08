//El usuario "piensa" un número del 1 al 100 y el ordenador lo adivina.
// (el usurio debe indicarle al ordenador si es mayor, menor o igual):

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        int max = 100, min = 1, resultado = 1;
        String indicacion = "mayor";

        //Print para el usuario
        System.out.println("Piensa un número entre el 1 y el 100. Indica si el número es mayor o menor del que se muestra.");

        //Bucle que adivina el número
        while (indicacion.equalsIgnoreCase("mayor") || indicacion.equalsIgnoreCase("menor")) {
            resultado = (max + min) / 2;
            System.out.println("Es este tu número?: " + resultado + ". Escribe mayor, menor o igual.");
            indicacion = entrada.nextLine();
            if (indicacion.equalsIgnoreCase("mayor")){
                min = resultado + 1;
            }
            else {
                max = resultado - 1;
            }
        }
        System.out.println("Este es tu número: " + resultado);
    }
}
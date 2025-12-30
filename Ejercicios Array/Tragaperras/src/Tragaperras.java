/*
Ejercicio Tragaperras: Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:

El ordenador mostrará una tirada que consiste en mostrar 3 figuras.
Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”
Se puede repetir hasta que el usuario no quiera jugar más.
 */

import java.util.Locale;
import java.util.Scanner;

public class Tragaperras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Scanner scLetras = new Scanner(System.in);

        //declaración de variables
        char continuar = 's';
        int saldo;

        //introduccion del total de monedas a jugar
        System.out.println("Introduce la cantidad de monedas que vas a jugar: ");
        saldo = sc.nextInt();

        do {
            //se pregunta si se quiere tirar
            System.out.println("Quiere tirar (s/n)");
            continuar = scLetras.nextLine().charAt(0);

            //se resta uno al saldo
            saldo -= 1;

            //se ejecuta el programa si se hace la tirada o si queda saldo suficiente
            if (saldo < 0) {
                System.out.println("Saldo insuficiente. Fin del juego");
                continuar = 'n';
            } else if (continuar == 's') {
                //llamada al metodo para sacar las tiradas y las monedas recibidas por esa tirada
                saldo += tirada();
                //muestro el total del saldo acumulado
                System.out.println("Total de monedas: " + saldo);
            } else {
                System.out.println("Fin del juego.");
            }

        } while (continuar != 'n');
    }

    /**
     * METODO PARA SACAR EL VALOR RANDOM Y SUMAR LAS MONEDAS
     *
     * @return devuelve las monedas ganadas según la tirada
     */
    public static int tirada() {
        //declaro el array y lo instancio con los valores ya dados
        String[] simbolos = new String[]{"Corazón", "Diamante", "Herradura", "Campana", "Limón"};

        //declaración de variables
        String p1, p2, p3;
        boolean par1 = false, par2 = false, par3 = false;
        int monedas = 0;

        //mediante el metodo generarNumerosRandom doy un valor a las variables de los simbolos que saldrán
        p1 = simbolos[generarNumerosRandom(simbolos.length)];
        p2 = simbolos[generarNumerosRandom(simbolos.length)];
        p3 = simbolos[generarNumerosRandom(simbolos.length)];

        //print del resultado de la tirada
        System.out.println(p1 + " - " + p2 + " - " + p3);

        //comparo
        if (p1 == p2 && p2 == p3) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
            monedas = 10;
        } else if (p1 == p2 || p2 == p3 || p3 == p2) {
            System.out.println("Bien, ha recuperado su moneda");
            monedas = 1;
        } else {
            System.out.println("Lo siento, ha perdido");
        }
        return monedas;
    }

    /**
     * METODO INDICE RANDOM, DEVUELVE UN VALOR ALEATORIO ENTRE 0 Y EL VALOR PROPORCIONADO POR EL PARÁMETRO
     *
     * @param rango
     * @return devuele un valor aleatorio entre el rango 0 al máximo que se declare
     */
    public static int generarNumerosRandom(int rango) {
        //int rango = (max - min) + 1;
        return (int) (rango * Math.random());
    }

}

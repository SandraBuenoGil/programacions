/*
Escribir un programa que rellene un array con números aleatorios
de tipo float. El programa, primero pedirá la cantidad de números aleatorios
(máximo 50) y el rango de los números aleatorios (valor_min. valor_max) y
posteriormente mostrará todos los números aleatorios en el orden en que se han
generado.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaración de variables
        float max, min, rand[];
        int cantidad;

        //petición de la cantidad de número
        do {
            System.out.println("Introduce la cantidad de número que quieres mostrar (50 máximo): ");
            cantidad = sc.nextInt();
        } while (cantidad < 1 || cantidad > 50);

        //petición del valor máximo de los número que se van a mostrar
        do {
            System.out.println("Introduce el valor máximo: ");
            max = sc.nextFloat();
        } while (max <= 0);

        //petición del valor mínimo
        do {
            System.out.println("Introduce un valor por debajo de " + max);
            min = sc.nextFloat();
        } while (min < 0 || min > max);

    /*
        //instanciación del array
        rand = new float[cantidad];

        //bucle para rellenar el array con números random

        el random va de 0 a 1, para que tenga el tamaño que queremos ( 0 a 50) hay que multiplicar
        Math.random (que tendría un valor entre 0 y 1) por el número que se introduzca para que de el
        número entero, y después se suma el mínimo para que entre dentro del rango mínimo y máximo.
        Ej: min = 20
            max = 30
            Math.random() = 0.3
        Paso a paso:
            max - min = 10
            0.3 * 10 = 3
            20 + 3 = 23
         */
        /*
        for (int i = 0; i < cantidad; i++) {
            num = min + (float) Math.random() * (max - min);

            //para que muestre solo dos decimales
            num = ((int) (num * 100)) / 100.0f;
            rand[i] = num;
        }

        //mostramos los números
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Valor de la posición " + (i + 1) + " : " + rand[i]);
        }
    */
        //llamada al método de creación de randoms en el array
        rand = rellenarRandom(cantidad, max, min);

        //muestra del resultado del array
        mostrar(rand);
    }

    public static float[] rellenarRandom(int cantidad, float max, float min) {
        //declaración e instanciación del array
        float rand[] = new float[cantidad];
        float num;

        //rellenar el array con número random y que el número tenga solo dos decimales
        for (int i = 0; i < cantidad; i++) {
            num = min + (float) Math.random() * (max - min);

            //para que salgan solo dos decimales
            num = ((int) (num * 100)) / 100.0f;

            rand[i] = num;
        }
        return rand;
    }

    public static void mostrar(float rand[]) {
        for (float i : rand) {
            System.out.println("Valor de la posición " + (i + 1) + " : " + i);
        }
    }
}

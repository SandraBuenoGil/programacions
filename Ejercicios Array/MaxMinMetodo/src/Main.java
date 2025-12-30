/*
Dado un vector de números reales (por ejemplo 20), escribe un metodo que nos devuelva
el máximo y el mínimo de los valores incluidos en el vector.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);

    //declaración de variables
    float secuencia[] = new float[20];
    float num, maxValor, minValor;
    int cantidad = 0;

    do {
        System.out.println("Introduce un valor (-1 para terminar):");
        num = sc.nextFloat();

        if (num < -1) {
            System.out.println(num + " es un valor negativo. Introduce un valor positivo (-1 para terminar):");
            num = sc.nextFloat();
        } else if (num != -1) {
            secuencia[cantidad] = num;
            cantidad++;
        }

    } while (num != -1 && cantidad < secuencia.length);

    //llamo al metodo y guardo los resultados en un array (solo guardará el máximo y el mínimo)
    float [] arrayResultado = maxMinValor(secuencia, cantidad);

    //printeo los resultados, sabiendo que en la posición 0 está el valor máximo y en la 1 el mínimo
    System.out.println("Valor máximo " + arrayResultado[0]);
    System.out.println("Valor mínimo " + arrayResultado[1]);
    }

    /**
     * METODO QUE DEVUELVE MAXIMO Y MÍNIMO VALOR
     * @param secuencia
     * @param cantidad
     * @return nuevo array, en la posición 0 valor máximo, posición 1 valor mínimo
     */

    public static float []maxMinValor (float secuencia[], int cantidad) {
    float maxValor, minValor;

    maxValor = secuencia[0];
    minValor = secuencia[0];

    for (int i = 0; i < cantidad; i++) {
        if (secuencia[i] > maxValor) maxValor = secuencia[i];
        if (secuencia[i] < minValor) minValor = secuencia[i];
    }

    //devuelvo un array solo con el valor máximo y mínimo
    return new float [] {maxValor, minValor};
    }
}

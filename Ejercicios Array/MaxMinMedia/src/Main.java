/*
Dado un vector de números reales (por ejemplo 20):

Escribir un método llenar para rellenar el vector.
Escribir un método max que nos devuelva el máximo de los valores incluidos en el vector.
Escribir un método min que nos devuelva el mínimo de los valores incluidos en el vector.
Escribir un método media que nos devuelva la media de los valores incluidos en el vector.
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //declaración de variables
        int cantidad;
        float maxValor, minValor, media;
        float secuencia[] = new float[20];

        //se guarda la cantidad de número introducidos en el array mediante el método rellenarVector
        cantidad = rellenarVector(secuencia);

        //if para, en caso de no haber introducido ningún valor, no mostrar los resultados
        if (cantidad > 0) {

            //primero llamamos a los métodos y guardamos los resultados en las variables
            maxValor = maximoValor(secuencia, cantidad);
            minValor = minimoValor(secuencia, cantidad);
            media = mediaValores(secuencia, cantidad);

            //después mostramos los resultados
            System.out.println("El valor máximo de los valores introducidos es: " + maxValor);
            System.out.println("El valor mínimo de los valores introducidos es: " + minValor);
            System.out.println("La media de todos los valores inrtoducidos es: " + media);
        }
        else System.out.println("No se ha introducido ningún valor");
    }

    //METODO RELLENAR ARRAY
    public static int rellenarVector(float secuencia[]) {
        int cont = 0;
        float num;
        do {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.US);

            System.out.println("Introduce un número positivo. (-1 para terminar)");
            num = sc.nextFloat();

            //evitamos que se escriban número negativos
            if (num < -1) {
                System.out.println(num + " es un número negativo, introduce números positivos. (-1 para terminar)");
                num = sc.nextFloat();
            }

            if (num != -1) {
                secuencia[cont] = num;
                cont++;
            }
        } while (cont < secuencia.length && num != -1);

        return cont;
    }

    //METODO MÁXIMO VALOR
    public static float maximoValor (float secuencia[], int cantidad) {
        float maxValor;

        maxValor = secuencia[0];
        for (int i = 0; i < cantidad; i++) {
            if (secuencia[i] > maxValor) maxValor = secuencia[i];
        }
        return maxValor;
    }

    public static float minimoValor (float secuencia[], int cantidad) {
        float minValor;

        minValor = secuencia[0];
        for (int i = 0; i < cantidad; i++) {
            if (secuencia[i] < minValor) minValor = secuencia[i];
        }
        return minValor;
    }

    //METODO CALCULAR MEDIA
    public static float mediaValores (float secuencia[], int cantidad) {
        float suma = 0, media;

        //se acumulan todos los valores del array
        for (int i = 0; i < cantidad; i++){
            suma += secuencia[i];
        }

        //se calcula la media
        media = suma / cantidad;

        return media;
    }
}

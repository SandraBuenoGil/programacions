//Crea un programa que pida veinte números reales por teclado, los almacene en un array
// y luego lo recorra para calcular y mostrar la media: (suma de valores) / no de valores.

import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);

        //declaración e intanciación del array
        float array20 [] = new float[20];

        //declaración de variables
        float suma = 0, media;

        //petición de los números
        for (int i = 0; i < array20.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            array20 [i]= sc.nextFloat();
        }

        //cálculo de la media
        for (int i = 0; i < array20.length; i++) {
            suma += array20 [i];
        }

        //cálculo de la media
        media = suma / array20.length;

        //print de la media
        System.out.println("La media de los números es: " + media);
    }
}

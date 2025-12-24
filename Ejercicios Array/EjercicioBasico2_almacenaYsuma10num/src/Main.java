//Crea un programa que pida diez números reales por teclado, los almacene en un
// array, y luego muestre la suma de todos los valores.

import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);

        //declaración e instanciación del array
        float almacena10num [] = new float[10];

        //declaración de variables
        float suma = 0;

        for (int i = 0; i < almacena10num.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            almacena10num [i] = sc.nextFloat();
        }

        //suma de todos los valores
        for (int i = 0; i < almacena10num.length; i++) {
            suma += almacena10num [i];
        }

        //se muestra el resultado
        System.out.println("La suma de todos los número es: " + suma);
    }
}

//Crea un programa que pida diez números reales por teclado, los almacene en
//un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.

import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);

        //declaración e instanciación del array
        float almacenaNum [] = new float[10];

        //declaración de variables
        float max, min;

        //petición de los números
        for (int i = 0; i < almacenaNum.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            almacenaNum [i] = sc.nextFloat();
        }

        //cálculo del máximo y mínimo
        max = almacenaNum [0];
        min = almacenaNum [0];
        for (int i = 0; i < almacenaNum.length; i++) {
            if (almacenaNum [i] > max) {
                max = almacenaNum [i];
            }
            if (almacenaNum [i] < min) {
            min = almacenaNum [i];
            }
        }
        System.out.println("El número mayor es: " + max + "\n" +
                "El número menor es: " + min);
    }
}
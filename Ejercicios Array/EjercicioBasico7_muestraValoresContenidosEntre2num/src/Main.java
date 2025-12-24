//Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores
// desde P hasta Q, y lo muestre por pantalla.

import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);

        //declaración de variables
        int p, q, tamanio, mayor = 0, menor = 0;

        //petición de los valores p y q
        System.out.println("Introduce el valor de 'P':");
        p = sc.nextInt();

        System.out.println("Introduce el valor de 'Q':");
        q = sc.nextInt();

        //comprobamos cuál es mayor y menor para hacer el cálculo de los números que hay entre p y q
        mayor = Math.max(p, q);
        menor = Math.min(p, q);

        //calculamos el tamaño del array (los número que van entre p y q
        tamanio = mayor - menor + 1;

        //declaración e instanciación del array
        int array[] = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            array[i] = menor;
            System.out.println("Valor de la posición " + (i + 1) + " = " + menor);
            menor++;
        }
    }
}

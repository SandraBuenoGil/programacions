/* Realiza un programa que lea una serie de números enteros con valores comprendidos
entre 0 y 1000, hasta que se introduzca un número entero que no esté comprendido entre
esos valores.

El programa debe escribir después, los valores entre 0 y 1000 que el usuario ha introducido.
Utilizad un vector de 20 posiciones, si el usuario lo llena se da por finalizada la introducción
de valores.
*/

import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);

        //declaración de variables
        boolean fin = true;
        int x, cont = 0, num[] = new int[20];

        //bucle para peticion de los valores
        do {
            System.out.println("Introduce un valor comprendido entre 0 y 1000: ");
            x = sc.nextInt();
            //comprobacion de que el número está comprendido entre 0 y 1000
            if (x >= 0 && x <= 1000) {
                //si está comprenido se guarda en el array
                num[cont] = x;
                cont++;
                //si no se acaba el programa
            } else fin = false;
        } while (fin == true && cont < 20);

        //print de los valores antes de finalizar el programa
        for (int i = 0; i < cont; i++) {
            System.out.println("El valor de la posición " + (i + 1) + " es: " + num[i]);
        }
    }
}
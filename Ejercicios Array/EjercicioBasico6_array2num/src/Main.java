//Crea un programa que pida dos valores enteros N y M, luego cree un array de
// tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.

import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc =  new Scanner(System.in);

        //declaración de variables
        int n, m;

        //petición del tamaño del array y el número
        System.out.println("Introduce el tamaño del array: ");
        n = sc.nextInt();

        System.out.println("Introduce el valor:");
        m = sc.nextInt();

        //declaración e instanciación del array
        int array[] = new int[n];

        //guardar en todas las posiciones el valor m
        for (int i = 0; i < array.length; i++) {
            array[i] = m;
        }

        //print del valor en cada posición
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor en posición " + (i + 1) + "=" + array[i]);
        }
    }
}
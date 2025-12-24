//Escribir un programa que lea diez números, los guarde en un vector y a continuación
// los imprima en orden inverso al de su entrada

import java.util.Scanner;

public class Main {
void main() {
    Scanner sc = new Scanner(System.in);

    //declaración e instanciación del array
    int num[] = new int[10];

    //petición de los números
    for (int i = 0; i < num.length; i++) {
        System.out.println("Introduce el valor nº " + (i + 1) + ":");
        num[i] = sc.nextInt();
    }

    for (int i = num.length -1; i >= 0; i--) {
        System.out.println("Cadena de valores invertida: " + num[i]);
    }
    }
}

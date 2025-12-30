/*
Programa que permita introducir una secuencia de números enteros positivos finalizada
en -1 (fin de secuencia) máximo 20 números, utilizando métodos se debe averiguar y mostrar:

¿Cuántos de esos números son pares?

¿Cuál es el valor del número máximo?

¿Cuál es el valor del número mínimo?
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaración de valores
        int secuencia[] = new int[20];
        int p = 0, cont = 0, num;

        //petición de los números
        do {
            System.out.println("Introduce un número positivo. (-1 para salir) : ");
            num = sc.nextInt();

            //descontmos que el valor -1 se grabe en el array
            if (num != -1 ) {
                secuencia[cont] = num;
                cont++;
            }
        } while (num != -1 && cont < 20);

        //llamada al método de pares
        System.out.println("El total de números pares es: " + contadorPares(secuencia, cont));
        //llamada al método del valor máximo
        System.out.println("El valor máximo es: " + maximoValor(secuencia, cont));
        //llamada al método del valor mínimo
        System.out.println("El valor mínimo es: " + minimoValor(secuencia, cont));
    }

    //método para saber números pares
    public static int contadorPares(int secuencia[], int cont) {
        //declaración de variables
        int par = 0;
        for (int i = 0; i < cont; i++) {
            if (secuencia[i] % 2 == 0) par++;
        }
        return par;
    }

    //metodo para saber el número máximo
    public static int maximoValor(int secuencia[], int cont) {
        // declaración de variables
        int max;

        //partimos de que el valor máximo es el que está en la posición 0
        max = secuencia[0];

        //con el bucle comparamos los valores y guardamos el mayor en la variable max
        for (int i = 0; i < cont; i++){
            if (secuencia[i] > max) max = secuencia[i];
        }
        return max;
    }

    public static int minimoValor(int secuencia[], int cont) {
        //declaración de variables
        int min;

        //partimos de que el valor mínimo es el que está en la posición 0
        min = secuencia[0];

        //con el bucle comparamos todos los valores y guardamos el que sea menor en min
        for (int i = 0; i < cont; i++) {
            if (secuencia[i] < min) min = secuencia[i];
        }
        return min;
    }
}

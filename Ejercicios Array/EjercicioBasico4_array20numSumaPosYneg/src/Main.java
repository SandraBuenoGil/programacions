//Crea un programa que pida veinte números enteros por teclado, los almacene en un
// array y luego muestre por separado la suma de todos los valores positivos y negativos.

import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);

        //Declaración e instanciación del array
        int arrayNum [] = new int[20];

        //declaracion de las variables
        int sumaPos = 0, sumaNeg = 0, sumaTotal = 0;

        //Petición de los números
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            arrayNum [i] = sc.nextInt();
        }

        //cálculo de la suma de todos los número
        for (int i = 0; i < arrayNum.length; i++) {
            sumaTotal += arrayNum[i];
        }
        System.out.println("La suma total es: " + sumaTotal);

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] >= 0) {
                sumaPos += arrayNum[i];
            } else sumaNeg += arrayNum[i];
        }
        System.out.println("La suma de los número positivos es: " + sumaPos);
        System.out.println("La suma total de los número negativos es: " + sumaNeg);
    }
}
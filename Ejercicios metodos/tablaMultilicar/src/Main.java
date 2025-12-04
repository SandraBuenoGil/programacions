//Programa que escribe la tabla de multiplicar de un número introducido por teclado. El programa debe tener un
// método que recibe como parámetro un número entero y muestra la tabla de multiplicar de dicho número.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEclaracion de variable
        int num = 0;

        System.out.println("Qué tabla quieres ver?");
        num = sc.nextInt();
        tablaMultiplicar(num);
    }

    //metodo multiplicar
    public static void tablaMultiplicar(int num) {
        //Declaro las variables
        int result = 0;

        for (int i = 0; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " x" + i + " = " + result);
        }
    }
}

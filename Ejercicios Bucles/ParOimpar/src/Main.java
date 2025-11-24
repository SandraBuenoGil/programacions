import java.util.Scanner;
//Programa que solicita 15 números y nos va indicando
// si son pares o impares. Al finalizar nos mostrará cuantos son pares y cuantos impares.
public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

       int num, totalPar = 0, totalImpar = 0;


        for (int i = 1; i <= 15; i++) {
            System.out.println("Introduce número " + i + ":");
            num = numeros.nextInt();

            if (num % 2 == 0) {
                totalPar++;
                System.out.println("El número es par.");
            } else {
                totalImpar++;
                System.out.println("El número es impar.");
            }
        }
        System.out.println("Total de número impares: " +totalImpar);
        System.out.println("Total de número pares: " +totalPar);
    }
}

//Programa en Java que calcule el Índice de Masa Corporal (IMC) de una persona,
// indique su clasificación y evalúe su estado de salud según su edad.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        int edad;
        float peso, altura, indice;
        char salir = 'n';
        String result;


        while (salir != 's') {

            System.out.println("Introduce tu peso en kg:");
            peso = numeros.nextFloat();

            System.out.println("Introduce tu altura en metros:");
            altura = numeros.nextFloat();

            System.out.println("Introduce tu edad");
            edad = numeros.nextInt();

            indice = peso / (altura * altura);

            if (indice < 18.5) {
                result = " Bajo peso";
            } else if (indice < 25) {
                result = " Peso normal";
            } else if (indice < 30) {
                result = " Sobrepeso";
            } else {
                result = " Obesidad";
            }
            if (edad < 18 && indice < 18.5) {
                System.out.println("IMC = " + indice + result + "\n Atención: posible bajo peso en menor de edad");
            } else if (edad > 60 && indice >= 25) {
                System.out.println("IMC = " + indice + result + "\n Precaución: control médico recomendado.");
            } else if (edad >= 18 && edad <= 60 && indice > 18.5 && indice < 25) {
                System.out.println("IMC = " + indice + result + "\n Salud dentro de parámetros normales");
            } else {
                System.out.println("IMC = " + indice + result + "\n Consulta médica aconsejada");
            }
            System.out.println("Quieres continuar? \n" +
                    "Introduce 's' para salir. \n" +
                    "Para continuar introduce cualquier letra");
            salir = letras.nextLine().charAt(0);
        }
        System.out.println("Fin del programa");
    }
}

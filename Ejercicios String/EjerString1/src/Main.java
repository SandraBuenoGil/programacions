//1.- Solitar una cadena por teclado y mostrar por pantalla la cantidad de vocales que tiene.
//Ejemplo:
//Entrada: cad = "Hola tu"
//Salida: La cantidad de vocales es 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);

        //Declaración de variables
        String frase;
        char caracter;
        int contVoc = 0;

        //Petición de la frase
        System.out.println("Introduce una frase: ");
        frase = cadena.nextLine();

        //partimos a comprobar desde el caracter 0; si es menor que el tamaño del texto; sumamos 1 al caracter
        for (int c = 0; c < frase.length(); c++) {
            //asignamos a la variable que convierta la frase en una cadena de char y (c) nos dice que posición está contando
            caracter = frase.charAt(c);

            //pasamos todos los caracteres a minusculas
            caracter = Character.toLowerCase(caracter);

            //decimos que si el caracter es una de esas letras sume 1 al contVoc
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contVoc++;

            }
        }
        //Print de la frase pasada a letras minúsculas
        System.out.println("El número de vocales es: " + contVoc);
    }
}
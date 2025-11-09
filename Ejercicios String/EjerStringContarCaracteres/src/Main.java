// Pedir una cadena por teclado (cad) y un carácter (car), y calcular cuántas veces se repite el carácter car en la cadena cad,
//Por ejemplo:
//Entrada: cad = "casa blanca", car = 'a'
//Salida: El caracter 'a' se repite 4 veces

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        String texto;
        char letra, posicion;
        int cont = 0;

        //petición del texto y letra
        System.out.println("Escribe un texto.");
        texto = sc.nextLine();
        System.out.println("Que letra quieres contar?");
        letra = sc.nextLine().charAt(0);

        //se pasa ambos a minúsculas solo
        texto = texto.toLowerCase();

        //Character.toLoweCase("nombreDeLaVariableChar) para hacer minusculas los char
        letra = Character.toLowerCase(letra);

        //Se inicia el bulcle for para que compruebe letra por letra.
        for (int c = 0; c < texto.length(); c++) {
            //con esta variable le decimos que convierta la posicion de c en un char
            posicion = texto.charAt(c);

            //comparamos si el caracter actual es igual que la letra elegida y sumamos 1 al contador si es que sí
            if (posicion == letra) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " " + letra);
    }
}
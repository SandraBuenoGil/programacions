//Pedir cadena cadena por teclado e invertir la misma y mostrar por pantalla.
//Ejemplo:
//Entrada: "casa blanca"
//Salida: "acnalb asac"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);

        //Declaración de variables
        String frase, invertida = "";

        //se pide el texto
        System.out.println("Introduce un texto");
        frase = letras.nextLine();

        //Se inicia un bucle for para que haga la acción tantas veces como caracteres tiene el texto.
        //c = al tamaño del texto ; mientras c sea mayor que 0 (hasta que llegue al primer caracter) ; restamos una
        // posición en la cadena del texto
        for (int c = frase.length(); c > 0; c--){
            //guardamos en invertida el proceso, por eso sumamos invertida al charAt (c-1 se pone para que cuente la posición 0)
            invertida += frase.charAt(c-1);
        }
        System.out.println(invertida);
    }
}
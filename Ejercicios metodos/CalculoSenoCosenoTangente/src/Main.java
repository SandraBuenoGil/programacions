//Dado el valor de un ángulo, sería interesante saber su seno,
// coseno y tangente. Escribir una función que muestre en pantalla los datos anteriores.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaracion de variables
        float angulo;

        //introduccion del angulo
        System.out.println("Introduce el ángulo.");
        angulo = sc.nextFloat();
        calculoSenoCosenoTangente(angulo);

    }

    public static void calculoSenoCosenoTangente (float angulo) {
        //declaracion de variables
        double seno, coseno, tangente, rad;

        //se pasa a radianes
        rad = Math.toRadians(angulo);

        //Calculo de seno, coseno, tangente
        seno = Math.sin(rad);
        coseno = Math.cos(rad);
        tangente = Math.tan(rad);

        System.out.println("Angulo: " + angulo + "grados \n" +
                "Seno = " + seno + "\n" +
                "Coseno = " + coseno + "\n" +
                "Tangente = " + tangente);
    }
}

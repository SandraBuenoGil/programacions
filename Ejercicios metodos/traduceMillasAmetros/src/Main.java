//Programa que dado un valor en millas nos lo traduce a metros. El programa debe tener un método que reciba como
//parámetro una cantidad (en millas) y nos devuelva la cantidad en metros.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaracion de variable
        float millas;

        System.out.println("Introduce las millas");
        millas = sc.nextFloat();
        millasAmetros(millas);

    }

    public static void millasAmetros (float millas) {

        //declaracion de variable
        float result;

        //paso de millas a metros
        result = millas * 1609.34f;
        System.out.println("Metros = " + result);
    }
}
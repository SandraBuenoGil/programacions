import java.util.Scanner;

public class Millas {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce las millas: ");

        double millas=entrada.nextFloat();
        double metros=millas*1609.344;
        System.out.println("Metros: "+metros);
    }
}


//Programa que dado un valor en millas nos lo traduce a metros
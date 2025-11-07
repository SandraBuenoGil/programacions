import java.util.Scanner;

public class EjercicioComún13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce número 1: ");
        float num1 = entrada.nextFloat();

        System.out.println("Introduce núemro 2: ");
        float num2 = entrada.nextFloat();

        if (num1>num2) {
            System.out.println("El número " + num1 + " es mayor.");
        }
        else {
            System.out.println("El número " + num2 + " es mayor.");
        }
    }
}
/*Programa que lee dos número y muestar el mayor*/

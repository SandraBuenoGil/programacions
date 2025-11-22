import java.util.Scanner;

public class MayorAmenorDosNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce número 1: ");
        float num1 = entrada.nextShort();

        System.out.println("Introduce número 2: ");
        float num2 = entrada.nextFloat();

        if (num1>num2) {
            System.out.println("El orden es: " +num1+ ", " +num2);
        }
        else {
            if (num1<num2)
            System.out.println("El orden es: " +num2+ ", " +num1);
            else {
                if (num1==num2)
                    System.out.println("Los dos son iguales.");
            }
        }
    }
}
/*Prgrama que lee dos número y los visualiza en orden ascendente*/
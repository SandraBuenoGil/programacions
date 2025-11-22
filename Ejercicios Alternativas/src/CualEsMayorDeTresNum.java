import java.util.Scanner;

public class CualEsMayorDeTresNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce número 1: ");
        float num1 = entrada.nextFloat();

        System.out.println("Introduce número 2: ");
        float num2 = entrada.nextFloat();;

        System.out.println("Introduce núemero 3: ");
        float num3 = entrada.nextFloat();

        if (num1>num2) {
            System.out.println("El número "+num1+" es el mayor.");
        }
        else {
            if (num1<num2)
                System.out.println("");
        }
    }
}
/*programa que lee tres números distinto y nos dice cuál es el mayor.*/
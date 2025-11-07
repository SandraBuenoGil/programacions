import java.util.Scanner;

public class EjercicioComun19 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);

        //declaración de variables 
        float num1, num2, num3;

        //introducción de datos 
        System.out.println("Introduce el primer número: ");
        num1 = entrada.nextFloat();

        System.out.println("Introduce el segundo número: ");
        num2 = entrada.nextFloat();

        System.out.println("Introduce el tercer número: ");
        num3 = entrada.nextFloat();

        //operación 
        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos los números son iguales.");
        } else {
            if (num1 == num2)
                System.out.println("El primer y segundo número son iguales.");
            else {
                if (num1 == num3)
                    System.out.println("El primer y tercer número son iguales.");
                else {
                    if (num2 == num3)
                        System.out.println("El segundo y tercer número son iguales.");
                    else
                        if (num1 != num2 && num2 != num3) {
                        System.out.println("Todos los número son diferentes.");
                    }
                }
            }
        }
    }
}




//Programa que lee tres números cualesquiera y nos indica todas sus relaciones 
//de igualdad.
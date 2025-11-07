import java.util.Scanner;

public class EjercicioComun10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la edad: ");
        int edad = entrada.nextInt();

        if (edad>=18) {
            System.out.println("Eres mayor de edad.");
        }
            else {
            System.out.println("Eres menor de edad.");
        }
    }
}
//Programa de un programa que pide la edad y nos muestra el mensaje "ERES MAYOR DE EDAD"
//solo si lo somos.
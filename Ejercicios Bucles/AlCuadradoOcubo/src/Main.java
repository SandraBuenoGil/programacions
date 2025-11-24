import java.util.Scanner;

//Programa escriba en pantalla una tabla con cuardados y cubos desde el 1 hasta otro numero tope
//pedido por pantalla
public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

//Desclaracion de variables
        int tope;
        double cuadrado, cubo;

        //peticion del numero tope
        System.out.println("Introduce el número tope: ");
        tope = numeros.nextInt();

//bucle for para hacer los calculos hasta el número tope del cuadrado
        for (int i = 1; i <= tope; i++) {
            cuadrado = Math.pow(i,2);
            System.out.println("El cuadrado de " + i + " ^ 2 = " + cuadrado);
        }

        for (int i2 = 1; i2 <= tope; i2++){
            cubo = Math.pow(i2, 3);
            System.out.println("El cubo de " + i2 + " ^ 2 = " +cubo);
        }
    }
}

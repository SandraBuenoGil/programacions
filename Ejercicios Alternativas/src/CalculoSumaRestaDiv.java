import java.util.Scanner;

public class CalculoSumaRestaDiv {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce número 1: ");
        float num1 = entrada.nextFloat();
        System.out.println("Introduce número 2: ");
        float num2 = entrada.nextFloat();

        float suma = num1+num2;
        float resta = num1-num2;
        float producto = num1*num2;
        float division = num1/num2;

        System.out.println("Suma: " +suma);
        System.out.println("Resta: " +resta);
        System.out.println("Producto: " +producto);
        System.out.println("División: " +division);
    }
}
/*Programa que lee dos números calcula muestra el
valor de su suma, resta, producto y divissión *tener en cuenta la división por cero**/

import java.util.Scanner;

public class PositivoONegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        float num = entrada.nextFloat();

        if (num>=0) {
            System.out.println("El número " +num+ " es positivo.");
        }
        else {
            System.out.println("El número " +num+ " es negativo.");
        }
    }
}
/*programa que lee un número que dice si es positivo o negrativo considerando el
* 0 como negativo*/
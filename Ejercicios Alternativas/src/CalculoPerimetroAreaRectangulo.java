import java.util.Scanner;

public class CalculoPerimetroAreaRectangulo {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce la base: ");
        int base=entrada.nextInt();
        System.out.println("Introduce la altura: ");
        int altura=entrada.nextInt();

        int perimetro=2*(base+altura);
        int area=base*altura;

        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Perímetro: "+perimetro);
        System.out.println("Área: "+area);
    }
}
//Escribe un programa que defina dos variables enteras para describir las
// longitudes de los lados de un rectángulo. El programa debe pedir, calcular y
// escribir en la pantalla las longitudes de los lados, el perímetro y
// el área del rectángulo.
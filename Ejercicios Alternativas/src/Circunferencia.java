import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce el radio: ");
        double radio=entrada.nextDouble();

        double longitud=2*(Math.PI*radio);
        double area=Math.PI*Math.pow(radio, 2);
        double volumen=(4/3)*Math.PI*Math.pow(radio, 3);

        System.out.println("Longitud: "+longitud);
        System.out.println("Área: "+area);
        System.out.println("Volumen: "+volumen);
    }
}
//Programa que solicita el radio de una circunferencia y muestra la longitud de la
// circunferencia,el área del círculo que se crea y el volumen de la esfera que forma.
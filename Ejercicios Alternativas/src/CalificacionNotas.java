import java.util.Scanner;

public class CalificacionNotas {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        // declaración de varaiables
        float calif;

        //introducción de valores
        System.out.println("Introduce la calificación entre 0 y 10: ");
        calif = entrada.nextFloat();

        //operación
        if (calif<3) {
            System.out.println("Muy Deficinte");
        }
        else {
            if (calif<5)
                System.out.println("Insuficiente");
            else {
                if (calif<6)
                    System.out.println("Suficiente");
                else{
                    if (calif<8)
                        System.out.println("Bien");
                    else {
                        if (calif<9)
                            System.out.println("Notable");
                        else {
                            if (calif <= 10)
                                System.out.println("Sobresaliente");
                        }
                    }
                }
            }
        }
    }

}
    /*Programa que lee una calificación numérica entre 0 y 10 y la transforma en
calificación alfabética, escribiendo el resultado.
de 0 a <3 Muy Deficiente.
de 3 a <5 Insuficiente.
de 5 a <6 Suficiente
de 6 a<7 Bien
de 6 a <9 Notable
de 9 a 10 Sobresaliente*/

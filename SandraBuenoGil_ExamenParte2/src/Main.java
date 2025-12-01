import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        //declaracion de variables
        char aniadir, salir;
        int numEntradas, menu = 0, contEntradas = 0;
        float precio = 0;
        do {
            //PEticion de entradas
            System.out.println("Qué tipo de entrada quiere: \n" +
                    "(1) Entrada normal - 7.50 \n" +
                    "(2) Entrada infantil - 5.00 \n" +
                    "(3) Entrada 3D - 9.00 \n" +
                    "(4) Finalizr la compra.");
            menu = numeros.nextInt();

            while (menu < 1 || menu > 4) {
                System.out.println("Error, introduce una opción válida \n" +
                        "(1) Entrada normal - 7.50 \n" +
                        "(2) Entrada infantil - 5.00 \n" +
                        "(3) Entrada 3D - 9.00 \n" +
                        "(4) Finalizr la compra.");
                menu = numeros.nextInt();
            }

            //Cuantas entradas
            System.out.println("Cuántas entradas quiere?");
            numEntradas = numeros.nextInt();

            System.out.println("Quiere palomitas con las entradas? s/n");
            aniadir = letras.nextLine().toLowerCase().charAt(0);

            while (aniadir != 's' && aniadir != 'n') {
                System.out.println("Error. Introduce 's' o 'n'");
                aniadir = letras.nextLine().toLowerCase().charAt(0);
            }

            switch (menu) {
                case 1:
                    precio = 7.50f;
                    break;
                case 2:
                    precio = 5.00f;
                    break;
                case 3:
                    precio = 9.00f;
                    break;
            }

            //calculo del precio por entradas
            precio = precio * numEntradas;

            //añadir o no palommitas
            if (aniadir == 's') {
                precio = precio + (8.5f * numEntradas);
            }

            if (precio > 40) {
                precio = precio - (precio * 0.12f);
            }

            //contador de las entradas totales
            contEntradas += numEntradas;

            System.out.println("Quiere añadir más entradas? s/n");
            salir = letras.nextLine().toLowerCase().charAt(0);


        } while (salir != 's');
        System.out.println("Total de enradas cocmpradas: " +contEntradas);
        System.out.println("Tipo de entrada y cantidad: ");
        System.out.println("Total bruto: ");
        System.out.println("Descuentos aplicados: ");
        System.out.println("Cargo por servicio: ");
        System.out.println("Fin del programa");
    }
}

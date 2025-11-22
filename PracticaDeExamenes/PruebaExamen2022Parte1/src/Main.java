import java.util.Scanner;

public class Main {
    /*
    1.- Escribe un proyecto en Java con NetBeans que realice las siguientes cosas:
• Leer los nombres, las alturas y la edad de personas, hasta que introduzcamos un
nombre igual a “FIN”.
• Al final se deberá mostrar:
1. El nombre de la persona de más edad y su altura.
2. El nombre de la persona de menos edad y su altura.
3. La altura media y la edad media de las personas.
4. Cuantas personas son más altas de 1,60 m*/

    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        //Desclaación de variables
        String nombre, nombreMayor = "", nombreMenor = "";
        int edad, mayor = 0, menor = 0, cont = 0, contAltura = 0;
        float altura, edadMedia = 0, alturaMedia = 0, alturaMayor = 0, alturaMenor = 0;
        char fin = 's';

        //bucle hasta que se diga fin
        do {
            //reseteamos el nombre y la altura
            nombre = "";
            altura = 0;
            System.out.println("Introduce tu nombre.");
            nombre = letras.nextLine().toLowerCase();


            System.out.println("Introduce tu altura con una coma Ej: 1,60.");
            altura = numeros.nextFloat();

            //aseguramos que la altura sea correcta
            while (altura < 0 || altura > 3) {
                System.out.println("Error. Introduce tu altura con una coma Ej: 1,60.");
                altura = numeros.nextFloat();
            }

            //Contador de altura si supera el 1,60
            if (altura >= 1.60){
                contAltura++;
            }

            System.out.println("Introduce tu edad.");
            edad = numeros.nextInt();

            //asefuramos que la edad sea correcta
            while (edad < 0 || edad > 150) {
                System.out.println("Error. Introduce tu edad.");
                edad = numeros.nextInt();
            }

            //acumulamos las edades y alturas para calcular la media
            edadMedia += edad;
            alturaMedia += altura;

            if (edad > 18) {
                mayor = edad;
                nombreMayor = nombre;
                alturaMayor = altura;
                cont++;

            } else {
                nombreMenor = nombre;
                menor = edad;
                alturaMenor = altura;
                cont++;
            }

            System.out.println("Quieres añadir más datos? s/n");
            fin = letras.nextLine().toLowerCase().charAt(0);

            //asguramos que la respuesta sea s o n
            while (fin != 'n' && fin != 's') {
                System.out.println("Error. Introduce 's' o 'n'.");
                fin = letras.nextLine().toLowerCase().charAt(0);
            }

        } while (fin != 'n');
        //Calculamos la media de altura y edad
        alturaMedia /= cont;
        edadMedia /= cont;

        System.out.println("La peronsa con mayor edad es: " + nombreMayor + ". Edad: " + mayor + ". Alura: " + alturaMayor);
        System.out.println("La peronsa con menor edad es: " + nombreMenor + ". Edad: " + menor + ". Alura: " + alturaMenor);
        System.out.println("La altura media es: " + alturaMedia);
        System.out.println("La edad media es: " + edadMedia);
        System.out.println("Total de personas más altas de 1,60: " + contAltura);
        System.out.println("Fin del programa.");
    }
}

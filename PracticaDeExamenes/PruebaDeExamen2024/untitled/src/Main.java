import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        int opcion, plato = 0;
        float precio, total = 0;
        String nombre, respuesta;

        do {
            do {
                System.out.println("Selecciona una opción: \n" +
                        "1. Entradas.\n" +
                        "2. Platos principales.\n" +
                        "3. Postres.\n" +
                        "4. Salir. ");
                opcion = numeros.nextInt();
            } while (opcion <= 0 || opcion > 4);

            switch (opcion) {
                case 1:
                    do {
                        do {
                            System.out.println("Introdue el nombre del entrante: ");
                            nombre = letras.nextLine();

                            System.out.println("Introduce el precio?");
                            precio = numeros.nextInt();

                            System.out.println("Estás seguro de su elección s/n?");
                            respuesta = letras.nextLine();

                        } while (respuesta.equalsIgnoreCase("si"));
                        plato++;
                        total = total + precio + 0.25f;
                        System.out.println("Desea otro entrante s(n?");
                        respuesta = letras.nextLine();
                    } while (respuesta.equalsIgnoreCase("si"));
                    break;
                case 2:
                    do {
                        do {
                            System.out.println("Introdue el nombre del plato principal: ");
                            nombre = letras.nextLine();

                            System.out.println("Introduce el precio?");
                            precio = numeros.nextInt();

                            System.out.println("Estás seguro de su elección s/n?");
                            respuesta = letras.nextLine();

                        } while (respuesta.equalsIgnoreCase("si"));
                        plato++;
                        total = total + precio + 0.75f;
                        System.out.println("Desea otro plato principal s/n?");
                        respuesta = letras.nextLine();
                    } while (respuesta.equalsIgnoreCase("si"));
                    break;
                case 3:
                    do {
                        do {
                            System.out.println("Introdue el nombre del postre: ");
                            nombre = letras.nextLine();

                            System.out.println("Introduce el precio?");
                            precio = numeros.nextInt();

                            System.out.println("Estás seguro de su elección s/n?");
                            respuesta = letras.nextLine();

                        } while (respuesta.equalsIgnoreCase("si"));
                        plato++;
                        total = total + precio + 0.80f;
                        System.out.println("Desea otro postre s/n?");
                        respuesta = letras.nextLine();
                    } while (respuesta.equalsIgnoreCase("si"));
                    break;
            }
        } while (opcion != 4);
        System.out.println("Fin del programa.");
    }
}
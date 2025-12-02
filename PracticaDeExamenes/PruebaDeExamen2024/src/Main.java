import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        //Declaración de variables
        float precio = 193, acum = 0, total = 0;
        char salir = 'n', otro = 's';
        String nombre;
        int edad, dia;

        //Bucle while para saber si se quiere continuar con otro grupo familiar
        while (salir != 's') {
            acum = 0;
            //Bucle para introdcir miembros de la familia hasta que se diga fin
            do {
                System.out.println("Nombre:");
                nombre = letras.nextLine();
                System.out.println("Introduce la edad: ");
                edad = numero.nextInt();

                //aseguramos que la edad sea corrects
                while (edad < 0 || edad > 150) {
                    System.out.println("Error. Introduce una edad correcta.");
                    edad = numero.nextInt();
                }
//Hacemos los descuentos para cada edad y acumulamos el precio
                if (edad <= 3) {
                    total = 0;
                    acum = acum + total;

                } else if (edad < 14) {
                    total = (float) (precio - (precio * 0.40));
                    acum = acum + total;

                } else if (edad < 25) {
                    total = (float) (precio - (precio * 0.30));
                    acum = acum + total;

                } else if (edad >= 60) {
//preguntamos el día para calcular el desuento
                    System.out.println("Introduce el día de la semana: \n" +
                            "1 para Lunes \n" +
                            "2 para Martes \n" +
                            "3 para Miércoles \n" +
                            "4 para Jueves \n" +
                            "5 para Viernes \n" +
                            "6 para Sábado \n" +
                            "7 para Domingo \n");
                    dia = numero.nextInt();
                    if (dia < 0 || dia > 7) {
                        System.out.println("El dia introducido es incorrecto. \n" +
                                "Introduce el día de la semana: \n" +
                                "1 para Lunes \n" +
                                "2 para Martes \n" +
                                "3 para Miércoles \n" +
                                "4 para Jueves \n" +
                                "5 para Viernes \n" +
                                "6 para Sábado \n" +
                                "7 para Domingo \n");
                        dia = numero.nextInt();

                    } else if (dia <= 5 && dia > 0) {
                        total = (float) (precio - (precio * 0.25));
                        acum = acum + total;
                    } else if (dia <= 7) {
                        total = (float) (precio - (precio * 0.45));
                        acum = acum + total;
                    }
                } else {
                    total = precio;
                    acum = acum + total;
                }
                System.out.println("Quiere introducir otro familiar?");
                otro = letras.nextLine().charAt(0);

            } while (otro != 'n');
            System.out.println("Total a pagar: " + acum);
            System.out.println("Quiere salir del programa?");
            salir = letras.nextLine().charAt(0);
        }
        System.out.println("Fin del programa.");
    }
}

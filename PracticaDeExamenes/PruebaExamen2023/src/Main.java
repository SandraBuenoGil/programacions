import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        //Declaración de variables
        float notas, precio = 193, acum = 0, total;
        int aprobados = 0, suspensos = 0, totalNotas, edad, dia;
        char salir, otro = 's';
        String nombre;

        //Bucle para el menú
        do {
            System.out.println("Selecciona una opción: \n" +
                    "(a) Aprobados y suspendidos \n" +
                    "(b) Billetes a Madrid \n" +
                    "(c) Salir");
            salir = letras.nextLine().toLowerCase().charAt(0);

            //descartar respuestas diferentes
            while (salir != 'a' && salir != 'b' && salir != 'c') {
                System.out.println("Carácter invalido, vuelve a introducirlo: \n" +
                        "Selecciona una opción: \n" +
                        "(a) Aprobados y suspendidos \n" +
                        "(b) Billetes a Madrid \n" +
                        "(c) Salir");
                salir = letras.nextLine().toLowerCase().charAt(0);
            }
            if (salir == 'a') {
                do {
                    //MENU A: Petición del total las notas a introducir
                    System.out.println("Cuantas notas vas a introducir?: ");
                    totalNotas = numeros.nextInt();

                    //inicio del buble para calcular los aprobados y suspensos
                    for (int i = 0; i < totalNotas; i++) {
                        System.out.println("Introduce la nota: ");
                        notas = numeros.nextFloat();

                        //restringir el rango de notas
                        while (notas > 10 || notas < 0) {
                            System.out.println("La nota introducida no es correcta, vuelve a escribirla.");
                            notas = numeros.nextFloat();
                        }

                        if (notas >= 5 && notas <= 10) {
                            aprobados++;
                        } else if (notas < 5 && notas >= 0) {
                            suspensos++;
                        } else {
                        }
                    }
                    //Comprobación de aprobados y suspendidos
                    if (aprobados > suspensos) {
                        System.out.println("Hay más aprobados");
                    } else if (aprobados == suspensos) {
                        System.out.println("Hay los mismo suspensos que aprobados");
                    } else {
                        System.out.println("Hay más suspensos");
                    }

                    //Resetear los contadores
                    aprobados = 0;
                    suspensos = 0;

                    //Se pregunta si se van a introducir más notas y nos aseguramos de que la respuesta sea S/N
                    do {
                        System.out.println("Quieres introducir más notas? s/n: ?");
                        otro = letras.nextLine().toLowerCase().charAt(0);
                        if (otro != 's' && otro != 'n') {
                            System.out.println("Error. Por favor, introduce 's' para sí o 'n' para no.");
                        }
                    } while (otro != 's' && otro != 'n');

                } while (otro != 'n');
            } else if (salir == 'b'){
                //MENU B: Bucle para introdcir miembros de la familia hasta que se diga fin
                do {
                    System.out.println("Nombre:");
                    nombre = letras.nextLine();
                    System.out.println("Introduce la edad: ");
                    edad = numeros.nextInt();

                    //Hacemos los descuentos para cada edad y acumulamos el precio
                    if (edad <= 3) {
                        total = precio - precio;
                        acum = acum + total;
                        System.out.println(total);
                    } else if (edad < 14) {
                        total = (float) (precio - (precio * 0.40));
                        acum = acum + total;
                        System.out.println(total);
                    } else if (edad < 25) {
                        total = (float) (precio - (precio * 0.30));
                        acum = acum + total;
                        System.out.println(total);
                    } else if (edad >= 60) {

                        //preguntamos el día para calcular el desuento de ancianos
                        System.out.println("Introduce el día de la semana: \n" +
                                "1 para Lunes \n" +
                                "2 para Martes \n" +
                                "3 para Miércoles \n" +
                                "4 para Jueves \n" +
                                "5 para Viernes \n" +
                                "6 para Sábado \n" +
                                "7 para Domingo \n");
                        dia = numeros.nextInt();
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
                            dia = numeros.nextInt();

                        } else if (dia <= 5 && dia > 0) {
                            total = (float) (precio - (precio * 0.25));
                            acum = acum + total;
                            System.out.println(total);
                        } else if (dia <= 7) {
                            total = (float) (precio - (precio * 0.45));
                            acum = acum + total;
                            System.out.println(total);
                        }
                    } else {
                        total = precio;
                        acum = acum + total;
                        System.out.println(total);
                    }

                    do {
                        //Preguntamos si va a introducirse otro grupo y no aseguramos que conteste s/n
                        System.out.println("Quiere introducir otro familiar s/n?");
                        otro = letras.nextLine().toLowerCase().charAt(0);

                        if (otro != 's' && otro != 'n') {
                            System.out.println("Error. Por favor, introduce 's' para sí o 'n' para no.");
                        }
                    } while (otro != 's' && otro != 'n');

                } while (otro != 'n');

                //total de los billetes
                System.out.println("Total a pagar: " + acum);

            }
        } while (salir != 'c');
        System.out.println("Fin del programa.");
    }
}
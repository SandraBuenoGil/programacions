import java.util.Scanner;

/*2.- Escribe un proyecto en Java con NetBeans que realice las siguientes cosas:
• Tenga el siguiente menú:
1. Hora España/China.
2. Entrada al museo.
3. Salir.
 (1 puntos).
La opción 1: La diferencia horaria entre China y España es de 6 horas más en China que
en España. El usuario debe poder introducir cualquiera de las dos horas, preguntar que
país es el origen y el programa le debe mostrar la del otro país según los datos dados,
utilizar horario HH MM por ejemplo las 20 horas 25 minutos (no am y pm).
Validar que la hora sea correcta.
 (1 puntos).*/

public class Main {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        //Declaracion de variables
        int horas, minutos, diaSemana, edad;
        char pais, salir = 'n', opcion, grupo;
        String dia = "", nombrePais = "";
        float precioGeneral = 15, total, acum = 0;

        /*//Declaración de variables
        float notas, precio = 193, acum = 0, total;
        int aprobados = 0, suspensos = 0, totalNotas, edad, dia;
        char salir, otro = 's';
        String nombre;*/

        //Bucle para el menú
        do {
            System.out.println("Selecciona una opción: \n" +
                    "(a) Hora España/China \n" +
                    "(b) Entrada al museo \n" +
                    "(c) Salir");
            opcion = letras.nextLine().toLowerCase().charAt(0);

            //descartar respuestas diferentes
            while (opcion != 'a' && opcion != 'b' && opcion != 'c') {
                System.out.println("Carácter invalido, vuelve a introducirlo: \n" +
                        "Selecciona una opción: \n" +
                        "(a) Aprobados y suspendidos \n" +
                        "(b) Billetes a Madrid \n" +
                        "(c) Salir");
                opcion = letras.nextLine().toLowerCase().charAt(0);
            }
            if (opcion == 'a') {
                //bucle Do while para ejecutarse hasta que se elija salir
                do {
                    //peticion del PAIS
                    System.out.println("De qué país quieres saber la hora? \n" +
                            "(a) Estoy en España, quiero saber la hora de China \n" +
                            "(b) Estoy en China, quiero saber la hora de España");
                    pais = letras.nextLine().toLowerCase().charAt(0);

                    //restringir la respuesta a las opciones dadas
                    while (pais != 'a' && pais != 'b') {
                        System.out.println("Error. Introduzca un caracter válido. \n" +
                                "De qué país quieres saber la hora? \n" +
                                "(a) Estoy en España, quiero saber la hora de China \n" +
                                "(b) Estoy en China, quiero saber la hora de España");
                        pais = letras.nextLine().toLowerCase().charAt(0);
                    }

                    //petición HORAS
                    System.out.println("Introduce primero las horas y después los minutos. \n" +
                            "Horas (24h): \n");
                    horas = numeros.nextInt();

                    //aseguramos que la hora sea correcta
                    while (horas < 0 || horas > 23) {
                        System.out.println("Error. Introduzca una hora entre 00 y 23. \n" +
                                "Horas (24h): ");
                        horas = numeros.nextInt();
                    }

                    //petición MINUTOS
                    System.out.println("Minutos: ");
                    minutos = numeros.nextInt();

                    //aseguramos que los minutos sean correctos
                    while (minutos < 0 || minutos > 59) {
                        System.out.println("Error. Introduzca los minutos entre 00 y 59. \n" +
                                "Minutos: ");
                        minutos = numeros.nextInt();
                    }

                    //petición DIA
                    System.out.println("Selecciona el número del de la semana. \n" +
                            "(1) Lunes \n" +
                            "(2) Martes \n" +
                            "(3) Miércoles \n" +
                            "(4) Jueves \n" +
                            "(5) Viernes \n" +
                            "(6) Sábado \n" +
                            "(7) Domingo");
                    diaSemana = numeros.nextInt();

                    //aseguramos que el día sea correcto
                    while (diaSemana < 0 || diaSemana > 7) {
                        System.out.println("Error. Introduzca el número del día. \n" +
                                "(1) Lunes \n" +
                                "(2) Martes \n" +
                                "(3) Miércoles \n" +
                                "(4) Jueves \n" +
                                "(5) Viernes \n" +
                                "(6) Sábado \n" +
                                "(7) Domingo");
                        diaSemana = numeros.nextInt();
                    }
                    //calculo del caso A
                    if (pais == 'a') {
                        horas += 6;

                        if (horas > 24) {
                            diaSemana++;
                            horas = horas - 24;
                        }
                        if (horas == 24) {
                            horas = 00;
                            diaSemana++;
                        }
                        if (diaSemana > 7) {
                            diaSemana = 1;
                        }
                        nombrePais = "China";

                        //calculo del caso b
                    } else if (pais == 'b') {
                        horas -= 6;

                        if (horas < 0) {
                            diaSemana--;
                            horas = horas + 24;
                        }
                        if (horas == 24) {
                            horas = 00;
                        }
                        if (diaSemana < 1) {
                            diaSemana = 7;
                        }
                        nombrePais = "España";
                    }

                    //switch para sumar o restar dia
                    switch (diaSemana) {
                        case 1:
                            dia = "Lunes";
                            break;
                        case 2:
                            dia = "Martes";
                            break;
                        case 3:
                            dia = "Miércoles";
                            break;
                        case 4:
                            dia = "Jueves";
                            break;
                        case 5:
                            dia = "Viernes";
                            break;
                        case 6:
                            dia = "Sábado";
                            break;
                        case 7:
                            dia = "Domingo";
                            break;
                    }

                    System.out.println("La hora en " + nombrePais + " Es: " + horas + ":" + minutos + " dia= " + dia);

                    System.out.println("Quiere consultar otra hora? s/n");
                    salir = letras.nextLine().toLowerCase().charAt(0);

                    while (salir != 's' && salir != 'n') {
                        System.out.println("Error. Introduce 's' o 'n'.");
                        System.out.println("Quiere consultar otra hora? s/n");
                        salir = letras.nextLine().toLowerCase().charAt(0);
                    }
                } while (salir != 'n');
                /*La opción 2: La entrada al museo se calcula por grupo, y depende de la edad y de si
tiene algún descuento.
• Precio general 15,00 euros.
• 60 años o más: 10,20 euros
• 10-16 años (incluidos): 5,60 Euros
• menos de 10 años: gratis
Posibles descuentos:
• Si eres profesor/alumno un 80 %.
• Si eres familia numerosa 20 %
Se quiere averiguar el coste total para un grupo.
El control del número de miembros del grupo os lo dejo a vuestra elección.*/

            } else if (opcion == 'b') {
                //MENU B: Bucle para introdcir miembros del grupo hasta que se diga fin
                do {
                    System.out.println("Descuentos:  \n" +
                            "(a) Estudiante o profesor \n" +
                            "(b) Familia numerosa \n" +
                            "(c) Ninguno");
                    grupo = letras.nextLine().toLowerCase().charAt(0);

                    //aseguramos que se escoge una opcion dada
                    while (grupo != 'a' && grupo != 'b') {
                        System.out.println("Error, introdice una opción valida. \n" +
                                "Descuentos: \n" +
                                "(a) Estudiante o profesor \n" +
                                "(b) Familia numerosa \n" +
                                "(c) Ninguno");
                        grupo = letras.nextLine().toLowerCase().charAt(0);
                    }

                    System.out.println("Introduce la edad: ");
                    edad = numeros.nextInt();

                    //aseguramos que la edad sea correcta
                    while (edad > 150 || edad < 0) {
                        System.out.println("Error, introdice una edad válida.");
                        edad = numeros.nextInt();
                    }

                    //Hacemos los descuentos para cada edad del grupo A

                    if (edad < 10) {
                        total = 0;
                        acum = acum + total;
                        System.out.println(total);
                    } else if (edad <= 16) {
                        total = 5.60f;
                        acum = acum + total;
                        System.out.println(total);
                    } else if (edad >= 60) {
                        total = 10.20f;
                        acum = acum + total;
                        System.out.println(total);
                    } else {
                        total = 15;
                        acum = acum + total;
                        System.out.println(total);
                    }

                    if (grupo == 'a') {
                        total = (total * 0.80f) - total;
                    } else if (grupo == 'b') {
                        total = (total * 0.20f) - total;
                    } else {
                        total = total;
                    }
                    //Preguntamos si va a introducirse otro grupo y no aseguramos que conteste s/n
                    System.out.println("Quiere introducir otra entrada s/n?");
                    salir = letras.nextLine().toLowerCase().charAt(0);

                    while (salir != 's' && salir != 'n') {
                        System.out.println("Error. Por favor, introduce 's' para sí o 'n' para no.");
                        salir = letras.nextLine().toLowerCase().charAt(0);
                    }
                } while (salir != 'n');

                //total de los billetes
                System.out.println("Total a pagar: " + acum);
            }
            
        } while (opcion != 'c');
        System.out.println("Fin del programa.");
    }
}
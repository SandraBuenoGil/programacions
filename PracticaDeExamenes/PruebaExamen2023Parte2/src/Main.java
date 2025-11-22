import java.util.Scanner;

/*Ejercicio 2: La diferencia horaria entre Japón y España es de 8 horas. En Japón tienen 8
horas más que en España.
El usuario debe poder introducir la hora* de cualquiera de los dos países, preguntar que
país es el origen y el día de la semana (lunes, martes,…) y el programa le debe mostrar la
del otro país según los datos dados, utilizar horario HH MM por ejemplo las 20 horas 25
minutos (no AM y PM).
Por ejemplo: Para España 20:34 lunes la salida sería → Japón 04:34 martes
 Para Japón 07:45 martes la salida sería → España 23:45 lunes
Validar que la hora sea correcta. No es necesario validar el día de la semana.
Repetir el programa hasta que el usuario decida terminar.
*/
public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        //Declaracion de variables
        int horas, minutos, diaSemana;
        char pais, salir = 'n';
        String dia = "";

        //bucle Do while para ejecutarse hasta que se elija salir
        do {
            //peticion del PAIS
            System.out.println("De qué país quieres saber la hora? \n" +
                    "(a) Estoy en España, quiero saber la hora de Japón \n" +
                    "(b) Estoy en Japón, quiero saber la hora de España");
            pais = letras.nextLine().toLowerCase().charAt(0);

            //restringir la respuesta a las opciones dadas
            while (pais != 'a' && pais != 'b') {
                System.out.println("Error. Introduzca un caracter válido. \n" +
                        "De qué país quieres saber la hora? \n" +
                        "(a) Estoy en España, quiero saber la hora de Japón \n" +
                        "(b) Estoy en Japón, quiero saber la hora de España");
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
                horas += 8;

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

                //calculo del caso b
            } else if (pais == 'b') {
                horas -= 8;

                if (horas < 0) {
                    diaSemana--;
                    horas = horas + 24;
                }
                if (horas == 24){
                    horas = 00;
                }
                if (diaSemana < 1) {
                    diaSemana = 7;
                }
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

            System.out.println("horas= " + horas + " minutos= " + minutos + " dia= " + dia);

            System.out.println("Quiere consultar otra hora? s/n");
            salir = letras.nextLine().toLowerCase().charAt(0);

            while (salir != 's' && salir != 'n'){
                System.out.println("Error. Introduce 's' o 'n'.");
                System.out.println("Quiere consultar otra hora? s/n");
                salir = letras.nextLine().toLowerCase().charAt(0);
            }

        } while (salir != 'n');
        System.out.println("Fin del programa.");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        int dia, mes, anio;
        int diaPorMes = 0;

        //introducción de valores
        System.out.println("Intrude el día");
        dia = entrada.nextInt();

        System.out.println("Introduce el mes");
        mes = entrada.nextInt();

        System.out.println("Introduce el año");
        anio = entrada.nextInt();


        //operacion
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diaPorMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaPorMes = 30;
                break;
            case 2:
                diaPorMes = 28;
                break;
        }
        //calculamos si la suma de 7 nos pasa al siguiente mes
        if ((dia + 7) > diaPorMes) {
            dia = (dia + 7) - diaPorMes;
            mes += 1;
        } else {
            dia += 7;
        }

        //comprobamos si pasamos al año siguiente
        if (mes > 12) {
            anio += 1;
            mes = 1;
        }
        System.out.println("La fecha es: " + dia + "/" + mes + "/" + anio);

    }
}
//Realizar las comprobaciones necesarias para que el día, el mes y el año sean correctos,  en el caso de no
// ser una fecha correcta debes dar un mensaje
// de error y terminar.
//Considerar el mes de febrero como que tiene 28 días (no es necesario controlar si el año es bisiesto)
//El programa debe mostrar la fecha pasados 7 días, con respecto a la fecha introducida
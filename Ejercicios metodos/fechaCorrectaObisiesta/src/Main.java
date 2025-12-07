import java.util.Scanner;
import java.util.regex.*;

/*Proqrama que lee una fecha con el siguiente formato (dd-mm-aaaa) y nos dice si es correcta o no.
El programa debe tener dos métodos, uno para saber si un año es bisiesto o no lo és, y otro al
que le pasamos los datos necesarios y nos devuelve un boolean indicando si es correcta o no.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scLetras = new Scanner(System.in);

        //declaracion de variables
        String fecha;

        //peticion de la fecha
        System.out.println("Introduce la fecha. Formato dd-mm-aaaa");
        fecha = scLetras.nextLine();

        //muestra si la fecha es correcta o no
        if (fechaCorrecta(fecha)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    }

    //método para coprobar si es bisiesto
    public static boolean anyoBisiesto(int anyo) {
        return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
    }

    //metodo para comprobar que el patron de fecha y la fecha están bien
    public static boolean fechaCorrecta(String fecha) {

        //declaracon de variables
        int dia, mes, anyo, diaMes = 0;
        boolean fechaValida = false;

        Pattern patronFecha = Pattern.compile("^([1-9]|0[1-9]|[12]\\d|3[01])-([1-9]|0[1-9]|1[0-2])-(\\d{4})$");
        Matcher matchFecha = patronFecha.matcher(fecha);

        //si la fecha encaja en el patrón continua con la comprobación de la fecha
        if (matchFecha.matches()) {
        /*guardamos cada grupo de caracteres es una variable (con pattern ya se han definido los grupos de caracteres)
        y lo pasamos a integro con parseInt*/
            dia = Integer.parseInt(matchFecha.group(1));
            mes = Integer.parseInt(matchFecha.group(2));
            anyo = Integer.parseInt(matchFecha.group(3));

            //señalamos cuantos dias tiene cada mes para compropbar que la fecha sea correcta
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    diaMes = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diaMes = 30;
                    break;
                    //usando el metodo anyoBisiesto comprobamos si la fecha introducida es en año bisiesto
                case 2:
                    if (anyoBisiesto(anyo)) {
                        diaMes = 29;
                    } else {
                        diaMes = 28;
                    }
                    break;
            }

            //si los dís coinciden con los que deberian ser al mes se guarda en la variable true si no se queda en false
            if (dia >= 1 && dia <= diaMes) {
                fechaValida = true;
            }
        }

        //devuelve la variable fechaValida (se crea la variable para solo hacer un return en el método)
        return fechaValida;
    }
}

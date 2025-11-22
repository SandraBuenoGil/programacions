import java.util.Scanner;

public class HoraTrasUnSegunto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //desclaración de variables 
        int horas, minutos, segundos;

        //introducción de valores
        System.out.println("Introduce las horas: ");
        horas = entrada.nextInt();

        System.out.println("Introduce los minutos: ");
        minutos = entrada.nextInt();

        System.out.println("Introduce los segundos: ");
        segundos = entrada.nextInt();

        //oreación
        if (horas > 23 || minutos > 59 || segundos > 59) {
            System.out.println("La hora introducida no es correcta");
        } else {
            if (segundos <= 58) {
                segundos = segundos + 1;
            } else {
                segundos = 0;

                if (minutos <= 58) {
                    minutos = minutos + 1;

                } else {
                    minutos = 0;

                    if (horas <= 22) {
                        horas = horas + 1;
                    } else {
                        horas = 0;
                    }
                }
            }
            System.out.println(+horas + ":" + minutos + ":" + segundos);
        }
    }
}


//Programa que recibe como datos de entrada una hora expresada en horas, minutos y segundos que nos 
// calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo.
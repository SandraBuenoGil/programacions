import java.util.Scanner;

public class Main {
    public static void main (String [] Args) {

        Scanner numero = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        //Declaración de variables
        float peso, altura, indiceCorporal;
        int edad;
        char respuesta;
        // String resp;

        //Bucle do While porque se va a ejecutar al menos una vez
        do {
            //Bucles para obligar a que la respuesta esté dentro de los parametros
          do {
              System.out.println("Indica el peso en kg: ");
              peso = numero.nextFloat();
              if (peso <= 0 || peso > 250) {
                  System.out.println("Incorrecto, intrduce un peso válido.");
              }
          }while (peso <= 0 || peso > 250);

              do {
                  System.out.println("Introduce la altura en metros: ");
                  altura = numero.nextFloat();
                  if (altura <= 0 || altura > 2.50f) {
                      System.out.println("Incorrecto, intrduce una altura válida.");
                  }
              } while (altura <= 0);

            do {
                System.out.println("Introduce la edad: ");
                edad = numero.nextInt();
                if (edad <= 0 || edad > 150) {
                    System.out.println("Incorrecto, intrduce una edad valida.");
                }
            } while (altura <= 0);

            //Comprobar los índices de masa corporal
            indiceCorporal = peso /( altura * altura);

            if (indiceCorporal < 18.5) {
                System.out.println("Peso bajo");
            } else if (indiceCorporal < 25) {
                System.out.println("Peso normal");
            } else if (indiceCorporal < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidad");
            }

            //Comprobar la masa corporal con respecto a la edad
            if (edad < 18 && indiceCorporal < 18.5) {
                System.out.println("Atención: posible bajo peso en menor de edad");
            } else if (edad > 60 && indiceCorporal >= 25) {
                System.out.println("Precaución: control médico recomendado.");
            } else if (edad >= 18 && edad <= 60 && indiceCorporal >= 18.5 && indiceCorporal < 25) {
                System.out.println("Salud dentro de parámetros normales");
            } else {
                System.out.println("Consulta médica aconsejada");
            }

            System.out.println("Desea continuar. Introducce 's' para continuar.");
            respuesta = letras.nextLine().toLowerCase().charAt(0);
            //resp = letras.nextLine();

            //Bucle para obligar la respuesta a ser s o n
            while (respuesta != 's' || respuesta != 'n') {
                System.out.println("Incorrecto, escribe 's' o 'n':");

                //Se vuelve a pedir la resuesta
                System.out.println("Desea continuar. Introducce 's' para continuar.");
                respuesta = letras.nextLine().toLowerCase().charAt(0);
            }

        }while (respuesta == 's');
        System.out.println("Fin del programa.");

    }
}
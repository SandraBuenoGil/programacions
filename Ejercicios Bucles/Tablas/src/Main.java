//Escribir un programa que me ayude a aprender las tablas de multiplicar.
//Para ello se irá pidiendo la tabla de multiplicar de un número (pedido por teclado con anterioridad) y comprobando que
// los valores introducidos son correctos. Si es así el programa escribirá "CORRECTO" y en caso contrario deberá escribir
// "LO SIENTO, SE HA EQUIVOCADO. LA RESPUESTA CORRECTA ES número".
//La última línea mostrará el número de aciertos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner exit = new Scanner(System.in);

//desclaración de variables
        int tabla, aciertos = 0, res;
        String salir = "no";

//bucle while para continuar dentro del programa cuando acabe una tabla
        //recuerda que si tienes un int y string tienes que hacer dos Scanner, uno para String y otro para int
        while (salir.equalsIgnoreCase("no")) {

//print para saber la tabla que se va a hacer
            System.out.println("Qué tabla quieres aprender?");
            tabla = entrada.nextInt();

//bucle for ya que sabemos de antemano las veces que se va ejecutar el bucle.
            for (int cont = 0; cont <= 10; cont++) {
                System.out.println(tabla + " * " + cont + " = ?");
                res = entrada.nextInt();

                if (res == tabla * cont) {
                    System.out.println("Es correcto");
                    aciertos++;
                } else {
                    System.out.println("Incorrecto. El resultado es: " + (tabla * cont));
                }
            }
            System.out.println("Aciertos: " + aciertos);
//reseteamos el acumulador para que en el siguiente no parta con lo anterior
            aciertos = 0;

//usamos el Scanner creado para String
            System.out.println("Quieres finalizar el programa? Escribe 'si' para salir y 'no' para quedarte.");
            salir = exit.nextLine();
        }
        System.out.println("Fin del programa.");
    }
}
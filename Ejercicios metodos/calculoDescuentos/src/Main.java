//Calcular el porcentaje de descuento que nos han hecho al comprar algo. Se debe
//solicitar la cantidad de tarifa y lo que realmente pagamos. Realizarlo creado un
//método al que le pasamos ambos parámetros y nos devuelve el resultado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaracion de valores
        float tarifa, pagado, descuento;

        //peticion de los datos
        System.out.println("Introduce la tarifa original");
        tarifa = sc.nextFloat();

        System.out.println("Introduce el precio pagado");
        pagado = sc.nextFloat();

        //metodo calcularDescuento
        calculoPorcentaje(tarifa, pagado);

    }

    //método de cálculo del descuento
    public static void calculoPorcentaje (float tarifa, float pagado) {
        //declaracion de variable
        float total;

        //cálculo del descuento
        total = ((tarifa - pagado) / tarifa) * 100;

        //print del total
        System.out.println("Total = " +total);
    }
}

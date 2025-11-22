import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //declaración de variables
        float sueldoneto, salariobruto, horas, horasextra, precioporhora, impuesto, sueldobase, sbhe;
        String nombre;

        //Introducción de valores
        System.out.println("Esctibe tu nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Introduce horas trabajadas: ");
        horas = entrada.nextFloat();

        System.out.println("Introduce precio por horas: ");
        precioporhora = entrada.nextFloat();

        //declaración de valor de las variables
        horasextra = horas - 35;
        sbhe = (horasextra * precioporhora) * 1.5f;

        sueldobase = horas * precioporhora + sbhe;


        //calculo salario base
        if (horas<=35) {
            salariobruto = sueldobase;
        } else {
            salariobruto = sueldobase + sbhe;
        }

        //calculo impuestos
        if (salariobruto<=500) {
            impuesto = 0;
        } else if (salariobruto>=900) {
            impuesto = (salariobruto * 0.25f) - salariobruto;
        } else {
            impuesto = (salariobruto * 0.45f) - salariobruto;
        }
        sueldoneto = salariobruto - impuesto;
        System.out.println("Sueldo bruto: " +salariobruto);
        System.out.println("Tasas: " +impuesto);
        System.out.println("Sueldo neto: " +sueldoneto);
    }
}
//Programa que calcula el salario neto semanal de un trabajador en función
// del número de horas
// trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
//
//Las primeras 35 horas se pagan a tarifa normal.
//Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
//Las tasas de impuestos son:
//
//Los primeros 500 euros son libres de impuestos.
//Los siguientes 400 tienen un 25% de impuestos.
//Los restantes un 45% de impuestos.
//
//Escribir nombre, salario bruto, tasas y salario neto.
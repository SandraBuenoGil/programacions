import javax.swing.plaf.metal.MetalLookAndFeel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        //Declaracion de variables
        int tipo, dia, horas, cliente, vehiculos;
        float tarifa, recargo, tipoCliente, acumTotal = 0, precioTotal = 0, descuento = 0;
        char salir;


        do { //otro cliente
            //pregutamos cuantos veículos se van a introducir
            System.out.println("Cuantos vehículo va a introducir: ");
            vehiculos = numeros.nextInt();

            for (int cont = 1; cont <= vehiculos; cont++ ) {

                //seleccion de tipo
                System.out.println("Qué tipo de vehículo es: \n" +
                        "(1) Coche \n" +
                        "(2) Moto \n" +
                        "(3) Furgoneta");
                tipo = numeros.nextInt();

                //descartamos opciones erroneas
                while (tipo < 1 || tipo > 3) {
                    System.out.println("Error, introduce un número valido \n" +
                            "Qué tipo de vehículo es: \n" +
                            "(1) Coche \n" +
                            "(2) Moto \n" +
                            "(3) Furgoneta");
                }

                //peticion de las horas
                System.out.println("Introduce las horas de estacionamiento: ");
                horas = numeros.nextInt();

                //descartamos horas menores a 0
                while (horas < 1) {
                    System.out.println("Error, introduce una hora válida");
                    horas = numeros.nextInt();
                }

                //peticion del día
                System.out.println("Introduce el día de la semana: \n" +
                        "1 para Lunes \n" +
                        "2 para Martes \n" +
                        "3 para Miércoles \n" +
                        "4 para Jueves \n" +
                        "5 para Viernes \n" +
                        "6 para Sábado \n" +
                        "7 para Domingo \n");
                dia = numeros.nextInt();

                //comprbamos que la fecha sea correcta
                while (dia < 1 || dia > 7) {
                    System.out.println("Error, introduce un número válido \n" +
                            "1 para Lunes \n" +
                            "2 para Martes \n" +
                            "3 para Miércoles \n" +
                            "4 para Jueves \n" +
                            "5 para Viernes \n" +
                            "6 para Sábado \n" +
                            "7 para Domingo \n");
                    dia = numeros.nextInt();
                }

                //Tipo de cliente
                System.out.println("Tipo de cliente: \n" +
                        "(1) Residente \n" +
                        "(2) Abonado mensualmente \n" +
                        "(3) Visitante");
                cliente = numeros.nextInt();

                //comprobamos que la opcion es correcta
                while (cliente < 1 || cliente > 3) {
                    System.out.println("Error, introduce un número válido \n" +
                            "(1) Residente \n" +
                            "(2) Abonado mensualmente \n" +
                            "(3) Visitante");
                    dia = numeros.nextInt();
                }

                //calculo de las tarifas por tipo de vehículo
                //tarifa de coche
                if (tipo == 1) {
                    tarifa = 2.5f * horas;
                    //tarifa de moto
                } else if (tipo == 2) {
                    tarifa = 1.5f * horas;
                    //tarifa furgoneta
                } else {
                    tarifa = 3.5f * horas;
                }

                //recargo segun el día
                if (dia == 6 || dia == 7) {
                    recargo = tarifa + (tarifa * 0.20f);
                } else {
                    recargo = tarifa;
                }

                //descuento según cliente
                //residente
                if (cliente == 1){
                    tipoCliente = recargo - (recargo * 0.15f);
                    acumTotal = tipoCliente + acumTotal;
                    //abonados mensuales
                } else if (cliente == 2) {
                    tipoCliente = recargo - (recargo * 0.30f);
                    acumTotal = tipoCliente + acumTotal;
                    //visitantes
                } else {
                    tipoCliente = recargo;
                    acumTotal = tipoCliente + acumTotal;
                }

                //despcuento por horas
                if (horas > 8) {
                    descuento = tipoCliente - (tipoCliente * 0.10f);
                    acumTotal = acumTotal - descuento;
                } else if (horas < 1) {
                    descuento = 0;
                }
                System.out.println("Desglose: \n" +
                        "Precio por hora: " + tarifa + "\n" +
                        "Tarifa más el recargo: " + recargo + "\n" +
                        "Descuento segun cliente: " + tipoCliente + "\n" +
                        "Desccuento según horas de estacionamiento : " + descuento + "\n" +
                "Precio total: " +acumTotal);
            }

            //total de los billetes
            System.out.println("Total a pagar: " + acumTotal);

            //preguntamo si hay más grupos
            System.out.println("Quiere introducir otro grupo de vehículos? s/n");
            salir = letras.nextLine().toLowerCase().charAt(0);

            //resetemos el contador
            acumTotal = 0;

        } while (salir != 'c');
    }
}

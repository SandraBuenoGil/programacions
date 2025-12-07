
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Scanner scLetras = new Scanner(System.in);

        //Declaración de variables
        String cliente = "", pedido = "", producto = "", salir;
        int cantidad, pago = 0, gastoEnvio;
        float precio, descuento, costeTotal;

        //bucle para pedir datos hasta que se quiera salir
        do {

            // peticion y calculo de los datos mediante métodos
            pedido = numPedido(pedido);

            cliente = nombreCliente(cliente);

            System.out.println("Introduce el nombre del producto");
            producto = scLetras.nextLine();

            System.out.println("Introduce el precio unitario del producto");
            precio = sc.nextFloat();
            //comprobamos que el precio se mayor que 0
            while (precio < 0) {
                System.out.println("El precio debe ser un número decimal mayor a 0 \n" +
                        "Introduce el precio unitario del producto");
                precio = sc.nextFloat();
            }

            System.out.println("Introduce la cantidad");
            cantidad = sc.nextInt();
            //comprbamos que la cantidad sea mayor a 0
            while (cantidad < 1) {
                System.out.println("La cantidad debe ser mayor a 0 \n" +
                        "Introduce la cantidad");
                cantidad = sc.nextInt();
            }

            pago = formaPago(pago);

            //calculo del coste total
            costeTotal = precio * cantidad;

            //inicializo la variable con el método
            descuento = aplicaDescuento(pago);
            gastoEnvio = calculaGastosEnvio(costeTotal);
            costeTotal = calculaImporteTotal(costeTotal, descuento, gastoEnvio);

            //devolucion de los datos
            System.out.println("Número del pedido: " + pedido);
            System.out.println("Nombre del cliente: " + cliente);
            System.out.println("Producto: " + producto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio unitario: " + precio);
            System.out.println("Coste total del producto: " + precio * cantidad + "€");
            System.out.println("Descuento aplicado: " + descuento * 100f + "%");
            System.out.println("Gastos de envío: " + gastoEnvio + "€");
            System.out.println("Total a pagar: " + costeTotal + "€");

            //pregunta si se desea otro cliente
            System.out.println("Quieres procesar más clientes? (si/no)");
            salir = scLetras.nextLine();

            //comprobamos que la respuesta no sea erronea
            while (!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no")) {
                System.out.println("Error. Escribe si/no");
                salir = scLetras.nextLine();
            }

        } while (salir.equalsIgnoreCase("si"));
        System.out.println("Saliendo...");
    }

    //METODOS

    //método que pide el número de pedido y lo valida
    public static String numPedido(String pedido) {
        Scanner scLetras = new Scanner(System.in);

        //peticion del número
        System.out.println("Introduce el número del pedido");
        pedido = scLetras.nextLine().trim();

        //se establece el patrón y se compara
        Pattern patronPedido = Pattern.compile("^\\d{4}-\\d{4}$");
        Matcher matchPatron = patronPedido.matcher(pedido);

        //mientras no coincida con el patron se pide de nuevo
        while (!matchPatron.matches()) {
            System.out.println("Formato incorrecto, intentelo de nuevo");
            pedido = scLetras.nextLine().trim();
            //para que vuelva a compararlo y no quede en bucle infinito se vuelve a poner el matcher
            matchPatron = patronPedido.matcher(pedido);
        }
        return pedido;
    }

    //método que pide el nombre y lo guarda
    public static String nombreCliente(String cliente) {
        Scanner scLetras = new Scanner(System.in);

        //peticion de nombre
        System.out.println("Introduce el nombre del cliente");
        cliente = scLetras.nextLine();

        return cliente;
    }

    //método que solicita la forma de pago y valida que sea una de las opciones dadas
    public static int formaPago(int pago) {
        Scanner sc = new Scanner(System.in);

        //peticion del precio
        System.out.println("Introduce el método de pago: \n" +
                "1 - Crédito \n" +
                "2 - Débito \n" +
                "3 - Transferencia");
        pago = sc.nextInt();

        //devolvemos error si no es uno de las formas propuestas
        while (pago < 1 || pago > 3) {
            System.out.println("Introduce un método de pago válido: \n" +
                    "1 - Crédito \n" +
                    "2 - Débito \n" +
                    "3 - Transferencia");
            pago = sc.nextInt();
        }
        return pago;
    }

    //método que calcula el descuento según la forma de pago

    public static float aplicaDescuento(int pago) {
        //declaracion de variable
        float descuento = 0;

        //switch para aplicar el descuento segun el metodo de pago
        switch (pago) {
            case 1:
                descuento = 0.05f;
                break;
            case 2:
                descuento = 0f;
                break;
            case 3:
                descuento = 0.10f;
                break;
        }
        return descuento;
    }

    //método que calcula los gastos de envío
    public static int calculaGastosEnvio(float costeTotal) {
        //declaro la variable gastoEnvio
        int gastoEnvio;

        //comprobamos si al coste se le suman gastos de envío
        if (costeTotal < 100) {
            gastoEnvio = 5;
        } else gastoEnvio = 0;

        return gastoEnvio;
    }

    //método que calcula el importe total con descuentos y gastos de envío
    public static float calculaImporteTotal(float costeTotal, float descuento, int gastoEnvio) {

        costeTotal = costeTotal - (descuento * costeTotal) + gastoEnvio;

        return costeTotal;
    }
}
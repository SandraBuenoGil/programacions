import java.util.Scanner;

public class Main {
    //En el programa principal simplemento llamamos al metodo de leer edad y hacemos el print de la edad que tiene
    //Todo lo demas lo hace la llamada al metodo
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int edad;
        boolean correcta;
        edad = leerLaEdad();
        System.out.println("Tu edad es: " + edad);

        System.out.println("Dame tu edad");
        edad = numeros.nextInt();
        //En esta variable estas llamando al metodo de comprobar edad
        correcta = comprobarEdad(edad);
        if (correcta) {
            System.out.println("Tu edad es correcta");
        } else {
            System.out.println("Tu edad es incorrecta");
        }
    }

    //Aquí es un metodo para pedir la edad.
    public static void leerLaEdad() {
        Scanner numeros = new Scanner(System.in);

        int edad;
        do {
            System.out.println("Dame tu edad:");
            edad = numeros.nextInt();
            if (edad < 0 || edad > 100) {
                System.out.println("Edad inválida.");
            }
        } while (edad < 0 || edad > 100);

        return edad;
    }

    public static boolean comprobarEdad (int edad) {
        boolean correcta = true;
        if (edad < 0 || edad > 100) {
            correcta = false;
        }
        return correcta;
    }
}

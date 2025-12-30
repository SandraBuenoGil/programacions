import java.util.Scanner;

public class MorseChatGPT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        // Arrays locales (NO globales)
        char[] letras = {
                'A','B','C','D','E','F','G','H','I','J',
                'K','L','M','N','O','P','Q','R','S','T',
                'U','V','W','X','Y','Z','0','1','2','3',
                '4','5','6','7','8','9'
        };

        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--..",
                "-----",".----","..---","...--","....-",
                ".....","-....","--...","---..","----."
        };

        do {
            System.out.println("\n--- MENÚ MORSE ---");
            System.out.println("1. Castellano a Morse");
            System.out.println("2. Morse a Castellano");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (opcion == 1) {
                // CASTELLANO → MORSE
                System.out.print("Introduce una frase: ");
                String texto = sc.nextLine().toUpperCase();
                String resultado = "";

                for (int i = 0; i < texto.length(); i++) {
                    char c = texto.charAt(i);

                    if (c == ' ') {
                        resultado += "   "; // 3 espacios entre palabras
                    } else {
                        for (int j = 0; j < letras.length; j++) {
                            if (letras[j] == c) {
                                resultado += morse[j] + " ";
                                break;
                            }
                        }
                    }
                }

                System.out.println("Morse:");
                System.out.println(resultado);

            } else if (opcion == 2) {
                // MORSE → CASTELLANO
                System.out.print("Introduce código Morse: ");
                String codigo = sc.nextLine();
                String resultado = "";

                String[] palabras = codigo.split("   ");

                for (String palabra : palabras) {
                    String[] letrasMorse = palabra.split(" ");

                    for (String l : letrasMorse) {
                        for (int i = 0; i < morse.length; i++) {
                            if (morse[i].equals(l)) {
                                resultado += letras[i];
                                break;
                            }
                        }
                    }
                    resultado += " ";
                }

                System.out.println("Texto:");
                System.out.println(resultado.trim());

            } else if (opcion != 0) {
                System.out.println("Opción incorrecta");
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado");
        sc.close();
    }
}

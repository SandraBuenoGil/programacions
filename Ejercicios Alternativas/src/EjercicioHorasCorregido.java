
/* Programa que lee como datos de entrada una fecha expresada en día (del 1 al 31) mes(del 1 al 12) y año (xxxx)
y nos dice la fecha que será al día siguiente. Se supondrá que febrero tiene siempre 28 días.
 */
import java.util.Scanner;

public class EjercicioHorasCorregido {
    public static void main(String[] args) {
        //Declaro las variables
        int d, m, a, dm;
        Scanner entrada=new Scanner(System.in);

        //Solicito los datos
        System.out.println("Intruducir día");
        d= entrada.nextInt();
        System.out.println("Intruducir mes");
        m= entrada.nextInt();
        System.out.println("Intruducir año");
        a= entrada.nextInt();

        //Restringo bien los limites, especificando dias por meses, porque sino tengo problemas
        //Después asigno los dias según los meses
        if (d>0 && a>=0 && (d<=28 && m==2) | (d<=30 && m==4 | m==6 | m==9 | m==11) | (d<=31 && m==1 | m==3 | m==5 | m==7 | m==8 | m==10 | m==12))
        {
            d+=1;

            if (m==2)
            {
                dm=28;
            }
            else
            {
                if (m==4 | m==6 | m==9 | m==11)
                    dm=30;
                else
                {
                    dm=31;
                }
            }

            //Si los días superan lo establecido, entonces cambia el mes
            //Si justo el mes es 12, suma 1 al año
            if (dm<d)
            {
                d=1;
                m+=1;
                if (m>12)
                {
                    m=1;
                    a+=1;
                }
            }

            System.out.println("La fecha el día siguiente es= " +d +'/' +m +'/' +a);
        }

        else
        {
            System.out.println("Error en los datos introducidos");
        }
    }
}
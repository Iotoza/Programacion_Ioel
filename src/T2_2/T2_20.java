package T2_2;
import java.util.Scanner;

public class T2_20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Realiza un programa que lee por consola dos números enteros (A y B)
        //Si B es mayor que A, muestra todos los números impares entre ellos

        System.out.println("Introduce un numero entero");
        int a = in.nextInt();

        System.out.println("Introduce otro");
        int b = in.nextInt();

        if (b > a) {

            System.out.println("La diferencia en impares es:");

            while (b > a) {

                   b--;

                   System.out.println(b);

                   b--;
            }
            }else {

            System.out.println("Los numeros son: " + a + " y " + b);

        }
    }
}
package T3;
import java.util.Scanner;

public class T3_5 {

    public static int tablademultiplicar (int num) {

        int resul = 0;
        int cont = 0 ;

        while (cont < 11) {

            resul = num * cont;
            System.out.println(num + " * " + cont + " = " + resul);
            cont++;

        }

        return resul;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero del 1 al 10");

        int num = sc.nextInt();

        int tabla = tablademultiplicar(num);


    }
}
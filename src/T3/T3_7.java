package T3;

import java.util.Scanner;

public class T3_7 {

    public static boolean esPrimo(int num) {
        int contador = 2;

        boolean primo = true;

        while ((primo) && (contador != num)) {

            if (num % contador == 0) {
                primo = false;
                contador++;
            }
        }

        return primo;

    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero");

        int num = sc.nextInt();

        do {

            esPrimo(num);

            if (esPrimo(num)) {
                System.out.println("Primo");
            } else {
                System.out.println("No es Primo");
            }

            System.out.print("Dame otro numero (0 para parar)");
            num = sc.nextInt();

        } while (num != 0);
    }
}
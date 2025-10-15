package T2;

import java.util.Scanner;

public class T2_EJ2 {
    public static void main(String[] args) {

    // Area rectangulo = Base * Altura = Area

        Scanner in = new Scanner(System.in);

        System.out.println("Dame la base");
        int base = in.nextInt();

        System.out.println("Dame la altura");
        int alt = in.nextInt();

        int area = base * alt;

        double per  = Math.pow(base,2) + Math.pow(alt,2);

        System.out.println("El area es " + area + "cm²");

        System.out.println("El perimetro es " + per + "cm" );

    }
}
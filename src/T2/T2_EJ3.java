package T2;

import java.util.Scanner;

public class T2_EJ3 {
    public static void main(String[] args) {

    // Area triangulo = Base * Altura % 2 = Area

        Scanner in = new Scanner(System.in);

        System.out.println("Dame la base");
        int base = in.nextInt();

        System.out.println("Dame la altura");
        int alt = in.nextInt();

        int area = (base * alt) / 2;

        double per  = base +  base + base;

        System.out.println("El area es " + area + "cm²");

        System.out.println("El perimetro es " + per + "cm" );

    }
}
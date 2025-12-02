package T3;

import java.util.Scanner;

import static T3.T3_1.numberSign;

public class T3_3 {

    public static boolean validRadius(int r) {

        return numberSign(r) >= 0;
    }

    public static double calculatePerimetre(int r) {
        double perimetre = 2 * Math.PI * r;
        return perimetre;
    }

    public static double calculateArea(int r) {
        double area = r * r * Math.PI;
        return area;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero del radio: ");

        int r = sc.nextInt();

        //Control de validez

        boolean valid = validRadius(r);
        if (!valid) {
            System.out.println("No pasa el control");
        } else {

            System.out.println("El numero ha pasado el control");

            //Calculo de perimetro

            double perimetre = calculatePerimetre(r);
            System.out.print("El perimetre según el radio es : " + perimetre);

            double area = calculateArea(r);
            System.out.print("El area es " + area);

        }
    }
}
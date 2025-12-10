package T3.T3_2_Mymath;

import java.util.Scanner;

public class MyMath {

    public static int squarePerimeter(int lado) {

        return lado * 4;
    }

    public static int squareArea(int base, int altura) {

        return base * altura;
    }

    public static int rectanglePerimeter(int base, int altura) {

        return 2 * (base + altura);
    }

    public static int rectangleArea(int base, int altura) {

        return base * altura;
    }

    public static double circlePerimetre(double radio, double diametro) {

        double perimetre = 0;

        if (diametro != 0) {
            perimetre = Math.PI * diametro;
        } else {
            perimetre = 2 * Math.PI * radio;
        }
        return perimetre;
    }

    public static double circleArea(double radio, double diametro) {

        double area;

        if (radio != 0) {
            area = Math.PI * Math.pow(radio, 2);
        } else {
            radio = diametro / 2;
            area = Math.PI * Math.pow(radio, 2);
        }
        return area;
    }

    public static boolean comprobadorPrimo(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int contadordigitos(int num) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero entero");
        num = sc.nextInt();

        int cif = 1;

        int cont = 0;

        while (num < cont) {
            System.out.println("Dame un numero entero");
            num = sc.nextInt();
        }

        while (num >= cif) {
            cif = cif * 10;

            cont++;
        }

        return cont;
    }

    public static int contadordigitos_pares(int num) {

        int cont = 0;

        int resul = num % 2;

        while (cont < num) {
            num = (num / 10) ;

            if (resul == 0) {
                cont++;
            }
        }
        System.out.println("El numero tiene " + cont + " numeros pares");



        return cont;
    }

    public static int contadordigitos_impares(int num){

        int cont = 0;

        int resul = num % 2;

        while (cont < num) {
            num = (num / 10) ;

            if (resul != 0) {
                cont++;
            }
        }
        System.out.println("El numero tiene " + cont + " numeros impares");




        return cont;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();

        contadordigitos_impares(num);

    }
}
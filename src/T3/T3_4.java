package T3;

import java.util.Scanner;

public class T3_4 {

    public static void showMenu() {
        System.out.println("System: Bienvenido al sistema de conversion de ITZ");
        System.out.println("System: De dolares a euros (D)");
        System.out.println("System: De euros a dolares (E)");

        Scanner sc = new Scanner(System.in);

    }

    public static double dolarEuro(double D) {
        D = D * 0.86;
        return D;
    }

    public static double euroDolar(double E) {
        E = E / 1.16;
        return E;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double d = 0;
        double e = 0;

        showMenu();

        char op = sc.next().charAt(0);

        switch (op) {

            case 'd':
                System.out.println("De dolares a euros");
                System.out.println("Cuantos dolares tienes?");
                d = sc.nextDouble();
                System.out.println("Perfecto iniciando conversión");
                double resul = dolarEuro(d);
                System.out.println("El resultado es : " + resul + " euros");


            case 'e':

                System.out.println("De euros a dolares");
                System.out.println("Cuantos euros tienes?");
                e = sc.nextDouble();
                System.out.println("Perfecto iniciando conversión");
                double resultado = euroDolar(e);
                System.out.println("El resultado es : " + resultado + " dolares");

            default:
                System.out.println("Error");
        }
    }
}
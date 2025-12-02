package T3_3;
import java.util.Scanner;
public class Utils {

    public static double millas_a_kilometros(double millas) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame los kilometros a pasar millas");

        millas = sc.nextDouble();

        double kilometros = millas * 1.60934;

        return kilometros;
    }

    public static double getTaxes(int euros) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cantidad de euros a tramitar");

        euros = sc.nextInt();

        System.out.println("Tramitando");

        double imp = 21;

        imp = (euros * imp) / 100;

        return Math.round(imp * 100) / 100;
    }
}
/*
public static double getmoney(int euros){
    Scanner sc = new Scanner(System.in);

    int imp = 0;

    System.out.println("Introduce cantidad de euros a tramitar");
    euros = sc.nextInt();

    System.out.println("Introduce el porcentaje a sumar");
    imp =  sc.nextInt();

    euros =

    return
}















public static void main(String[] args) {


    }
*/
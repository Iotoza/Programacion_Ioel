package T2;

import java.util.Scanner;
public class T2_EJ14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas personas se hospedan?");
        int n_per = sc.nextInt();

        System.out.println("Y....durante cuantos dias");

        int n_dia = sc.nextInt();

        int precio_fn = n_dia * 15;

        double descuento = precio_fn * 0.25;


        if (n_per > 5 && n_dia >= 7){

            System.out.println("El precio de la estancia es " + descuento);

        } else {

            System.out.println("El precio de la estancia es " + precio_fn);
        }


    }
}
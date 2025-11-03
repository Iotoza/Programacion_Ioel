package T2;

import java.util.Scanner;

public class T2_EJ13 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            System.out.println("Dime la hora (0-23):");
            int hora = sc.nextInt();
        while (hora < 0) {
            System.out.println("Prueba de nuevo");
            System.out.println("Dime la hora (0-23):");
            hora = sc.nextInt();
        }

        System.out.println("Dime los minutos (0-59)");
        int min = sc.nextInt();
        while (min < 0) {
            System.out.println("Prueba de nuevo");
            System.out.println("Dime los minutos (0-59)");
            min = sc.nextInt();
        }

        System.out.println("Y dime los segundos (0-59):");
        int seg = sc.nextInt();
        while (seg < 0) {
            System.out.println("Prueba de nuevo");
            System.out.println("Y dime los segundos (0-59):");
            seg = sc.nextInt();
        }

        seg= seg+1;


        if (seg == 60) {
            seg = 0;
            min++;
        }

        if (min == 60) {
            min = 0;
            hora++;
        }

            if (hora == 24) {
                hora = 0;
            }















            System.out.println("La hora mas un segundo es: " + hora + ":" + min + ":" + seg);


    }
}
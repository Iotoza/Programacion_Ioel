import java.util.Scanner;

public class T2_EJ13 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            System.out.println("Dime la hora (0-23):");
            int hora = sc.nextInt();

            if (hora == 24) {
                hora = 0;
            }

            System.out.println("Dime los minutos (0-59)");
            int min = sc.nextInt();

            if (min == 60) {
                min = 0;
                hora++;
            }


            System.out.println("Y dime los segundos (0-59):");
            int seg = sc.nextInt() + 1;

            if (seg == 60) {
                seg = 0;
                min++;
            }
                System.out.println("La hora mas un segundo es: " + hora + ":" + min + ":" + seg);


    }
}
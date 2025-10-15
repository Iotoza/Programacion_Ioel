import java.util.Scanner;

public class T2_EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Dame la cantidad de dolares");
        double dolar = sc.nextInt();

        double eur = 1;

        if (dolar == eur) {

            System.out.println("Tienes un euro");

        } else {

            if (dolar > eur) {

                System.out.println("Tienes" + dolar / eur + "euros");

            }else{

                    System.out.println("No llegas al euro");

            }
        }
    }
}

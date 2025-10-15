import java.util.Scanner;

public class T2_EJ8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Dame la cantidad de euros");
    double eur = sc.nextInt();

    double dolar = 1.16;

        if (eur == dolar){
            System.out.println("Tienes un dolar");
        }

        if (eur > dolar) {
        System.out.println("Tienes" + eur / dolar + "dolares");

        }else{

            System.out.println("No llegas al dolar");
        }

            System.out.println("Tienes un dolar");

    }
}

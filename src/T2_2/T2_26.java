package T2_2;
import java.util.Scanner;
public class T2_26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero primo");

        int num = sc.nextInt();

        if (num ==2 || num ==3 || num ==5 || num ==7) {

            System.out.println("Es primo");
        }else if (num % 2 ==0 || num % 3 == 0||num % 5 == 0 || num % 7 == 0) {

            System.out.println("Este numero no es primo");

        } else if (num % num ==0 || num % 1 ==0)  {

            System.out.println("Este numero es primo");

        }


    }
}
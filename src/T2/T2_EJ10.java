package T2;

import java.util.Scanner;

public class T2_EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero");
        double num1 = sc.nextInt();

        System.out.println("Dame otro numero");
        double num2 = sc.nextInt();

        System.out.println("Dame otro numero");
        double num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3){
            System.out.println("Estan ordenados");

        }else {
            System.out.println("No estan ordenados");
        }













    }
}
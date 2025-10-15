package T2;

import java.util.Scanner;
//corregir
public class T2_EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero");
        int num1 = sc.nextInt();

        System.out.println("Dame otro numero");
        int num2 = sc.nextInt();

        System.out.println("Dame otro numero");
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("El resultado es " + num1 + num2 + num3);

        } else if (num2 < num1 && num1 < num3){
            System.out.println("El resultado es " + num2 + num1 + num3);
        }

        if (num3 < num1 && num1 < num2) {
            System.out.println("El resultado es " + num3 + num2 + num1);
        }


























    }
}
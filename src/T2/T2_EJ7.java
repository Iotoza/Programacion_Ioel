package T2;

import java.util.Scanner;

public class T2_EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero");
        int Num1 = sc.nextInt();

        System.out.println("Dame otro numero");
        int Num2 = sc.nextInt();

        if (Num1 > Num2) {
            int Resul = Num1 - Num2;
            System.out.println("El resultado es "  + Resul);
        }else {
            int Resul = Num2 - Num1;
            System.out.println("El resultado es "  + Resul);
        }















    }
}
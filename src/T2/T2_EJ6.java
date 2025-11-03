package T2;

import java.util.Scanner;

public class T2_EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int Num = sc.nextInt();

        if (Num < 0) {
            System.out.println("El numero es negativo");
        }else{
            if (Num > 0) {
                System.out.println("El numero es positivo");
            }
        }
        if (Num == 0){
            System.out.println("El numero es 0");
        }





    }
}
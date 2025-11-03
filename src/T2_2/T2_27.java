package T2_2;

import java.util.Scanner;

public class T2_27 {
    public static void main(String[] args) {

    int num = 0;

    //El limite es 20, y tenemos que aumentar num de manera progresiva
    // hasta llegar al numero 20, y hacer la comprobación


     while  (num < 20) {

         if (num % 2 != 0 && num % 3 != 0) {
             System.out.println(num+" primo");

         } else {

             System.out.println(num+" no primo");
         }

         num++;
     }
        System.out.println("Estos son los numeros primos del 1-20");


    }
}
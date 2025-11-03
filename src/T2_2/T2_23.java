package T2_2;
import java.util.Scanner;

public class T2_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero entero");
        int num= sc.nextInt();

        int sumnum = 0;

        int cont = 0;

       do{
           System.out.println("Dame un numero entero");
           num = sc.nextInt();

           if (num > 0) {

               sumnum = sumnum + num;

           } else if (num < 0) {

               sumnum = sumnum - num;

           }

           cont++;

        } while (num > 0);

        System.out.println("Sumnum es : " + sumnum);

        System.out.println("Cont es : " + cont)
        ;
        double media = (sumnum / cont);

        System.out.println("La media es: " + media);



    }
}
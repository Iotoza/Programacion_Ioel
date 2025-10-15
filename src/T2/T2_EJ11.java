import java.util.Scanner;

public class T2_EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero");
        double num1 = sc.nextInt();

        System.out.println("Dame otro numero");
        double num2 = sc.nextInt();

        System.out.println("Dame otro numero");
        double num3 = sc.nextInt();

        if (num1 + 1 == num2 ){
            if (num2 + 1 == num3){
                System.out.println("Son consecutivos");

        }else{
                System.out.println("No son consecutivos");
        } }






















    }
}
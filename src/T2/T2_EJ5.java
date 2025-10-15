import java.util.Scanner;

public class T2_EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero");
        int x1 = sc.nextInt();

        System.out.println("Dame el segundo numero");
        int x2 = sc.nextInt();

        System.out.println("Dame el tercer numero");
        int x3 = sc.nextInt();

        int Media1 = (x1 + x2 + x3) / 3;

        double Media2 = (x1 + x2 + x3) / 3;

        System.out.println("El resultado no decimal es " + Media1);

        System.out.println("El resultado decimal es " + Media2);



















    }
}
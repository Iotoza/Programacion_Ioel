package T2_2;
import java.util.Scanner;
public class T2_30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;

        int num2 = 0;

        int resul = 0;

        System.out.println("Dime que operación quieres hacer: + - * / % ");

        char op = sc.next().charAt(0);


        if (op == 'F'){

            while (op != '+' && op != '-' && op != '*' && op != '/' && op != '%') {

                System.out.print("Ingresa un signo de operación valido por favor ");

                op = sc.next().charAt(0);

            }


            if (op == '+') {

                System.out.println("Dame un num");
                num1 = sc.nextInt();

                System.out.println("Dame otro");
                num2 = sc.nextInt();

                resul = num1 + num2;

                System.out.println("El resultado es: " + resul);

                System  .out.println("Alguna operación mas? + - * / % (F para salir)");
                op = sc.next().charAt(0);

            }

            if (op == '-') {
                System.out.println("Dame un num");
                num1 = sc.nextInt();

                System.out.println("Dame otro");
                num2 = sc.nextInt();

                resul = num1 - num2;

                System.out.println("El resultado es: " + resul);

                System  .out.println("Alguna operación mas? + - * / % (F para salir)");
                op = sc.next().charAt(0);

            }

            if (op == '*') {
                System.out.println("Dame un num");
                num1 = sc.nextInt();

                System.out.println("Dame otro");
                num2 = sc.nextInt();

                resul = num1 * num2;

                System.out.println("El resultado es: " + resul);

                System  .out.println("Alguna operación mas? + - * / % (F para salir)");
                op = sc.next().charAt(0);

            }

            if (op == '/') {
                System.out.println("Dame un num");
                num1 = sc.nextInt();

                System.out.println("Dame otro");
                num2 = sc.nextInt();

                resul = num1 / num2;

                System.out.println("El resultado es: " + resul);

                System  .out.println("Alguna operación mas? + - * / % (F para salir)");
                op = sc.next().charAt(0);
            }

            if (op == '%') {

                System.out.println("Dame un num");
                num1 = sc.nextInt();

                System.out.println("Dame otro");
                num2 = sc.nextInt();

                resul = num1 % num2;

                System.out.println("El resultado es: " + resul);

                System  .out.println("Alguna operación mas? + - * / % (F para salir)");
                op = sc.next().charAt(0);
            }
        }
    }
}
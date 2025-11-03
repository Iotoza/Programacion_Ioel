package T2_2;
import java.util.Scanner;
public class T2_29 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        int secreto = (int) (Math.random()*101);

        System.out.println("Dame un numero del 0 al 100");

        int num = sc.nextInt();

        int dif = num - secreto;

        while (num > secreto || num < secreto) {

            System.out.println("El numero "+num+" es incorrecto");
            if (num > secreto){

                System.out.println("Esta por encima de X");

            }

            if (num < secreto){

                System.out.println("Es menor a X");

            }

            System.out.println("Prueba suerte de nuevo");
            num = sc.nextInt();

            dif = num - secreto;

            if(num == secreto){

                System.out.println("El numero "+num +" es correcto");
                System.out.println("FELICIDADES!!!!PONÉ LA MÚSICA!!!!!");

            }
        }
    }
}
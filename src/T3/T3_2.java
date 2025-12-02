package T3;

import java.util.Scanner;

import static T3.T3_1.numberSign;
//ahora puedo utilizar el numberSign para comprobar la validez de los numeros en el resto de ejercicios

public class T3_2 {

    public static void validezedad() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Indica que edad tienes: ");

        int age = sc.nextInt();

        boolean adult = false;

        if (age == 18) {
            adult = true;

        } else if (age < 18) {
            adult = false;
        }

        int age2 = numberSign(age);

        if (age2 < 0 || age2 == 0) {
            System.out.println("No has nacido?");

        } else if (age2 == 1) {
            System.out.println("Tienes un año y escribes?");
        }

        if (!adult) {
            System.out.println("Eres menor, nonono");

        } else
            System.out.println("Eres mayor, mamahuevo, brrrrrrrrrrrrr puñetah");
    }

    static void main(String[] args) {

        validezedad();

    }
}
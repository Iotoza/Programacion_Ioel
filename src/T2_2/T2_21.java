package T2_2;

public class T2_21 {
    public static void main(String[] args) {

        int num = 1;
        int sumpar = 0;

        while (num <= 1000) {

            if (num % 2 == 0) {

                sumpar = sumpar + num;
            }

            num++;

        } System.out.println("El resultado de la suma es: " + sumpar);
    }
}
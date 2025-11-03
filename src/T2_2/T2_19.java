package T2_2;

public class T2_19 {
    public static void main(String[] args) {
        //Escribe un programa que muestra por consola todos los números pares entre 1 y 1000.

        System.out.println("Numeros pares del 1-1000");

        int num = 1;

        while (num <= 1000) {

               if (num % 2 != 0) {

               num++;

            } else {

                System.out.println(num);

                num++;

            }
        }
    }
}
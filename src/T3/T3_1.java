package T3;

import java.util.Scanner;

public class T3_1 {

//Esto sirve para almacenar la función
// con funcion nos referimos a la mecanica definida del programa.

// En este caso que si la variable numusu es:
// Igual a 0, se devolvera el 0, con devolver me refiero a que cambia el valor a 0
// Si es por ejemplo 2 el valor pasaria a ser 1 por la funcion, si es mayor que 0 es 1
// Y si el valor es -10 pasaria a ser -1 porque si es menor que 0 el valor es -1

    public static int numberSign(int numusu) {

        if (numusu == 0) {
            return 0;
        } else if (numusu > 0) {
            return 1;
        } else {
            return -1;
        }

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce numero: ");

        int numusu = sc.nextInt();

        int nubs = numberSign(numusu);
        if (nubs == 0) {
            System.out.println("El numero es 0");

        } else if (nubs > 0) {
            System.out.println("El numero es positivo");

        } else {
            System.out.println("El numero es negativo");
        }

        System.out.println(nubs);


    }
}
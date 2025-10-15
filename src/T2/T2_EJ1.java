package T2;

import java.util.Scanner;

public class T2_EJ1 {
    public static void main(String[] args) {

    // Area cuadrado = Lado * Lado = L²

       Scanner in =  new Scanner(System.in);


        double lado = in.nextInt();

        double area = Math.pow(lado,2);

        System.out.println("El area es "+ area + "cm²");

        System.out.println("El perimetro es " + Math.pow(lado, 4) + "cm");

    }
}
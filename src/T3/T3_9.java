package T3;

import java.util.Scanner;

public class T3_9 {

    public static void piramide() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime que carácter quieres: ");
        char char1 = sc.next().charAt(0);

        System.out.print("Dime el numero de filas: ");
        int fila = sc.nextInt();

        // Bucle externo para las filas
        for (int cont_fila = 0; cont_fila < fila; cont_fila++) {
            // Bucle interno para los espacios (para alinear a la derecha)
            for (int espacio = 0; espacio < fila - cont_fila - 1; cont_fila++) {
                System.out.print(" ");
            }
            // Bucle interno para las letras o caracteres
            for (int letra = 0; letra < cont_fila + 1; letra++) {
                // Puedes usar una letra fija o una variable
                System.out.print(char1);
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
    }

    static void main(String[] args) {

        piramide();

    }
}
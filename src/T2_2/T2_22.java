package T2_2;
import java.util.Scanner;

public class T2_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero entero");
        int num = sc.nextInt();

        int cif = 1;

        int cont = 0;

        while (num < cont) {
            System.out.println("Dame un numero entero");
            num = sc.nextInt();
        }

    // El contador esta intentando igualar el valor minimo alcanzable al numero introducido por
    // el usuario a base de ceros, y el contador se suma una vez añadido un 0 mas a "cif"

        while (num >= cif){
            cif =cif*10;

            cont++;
        }
        System.out.println("Tu numero tiene: " + cont );
    }
}
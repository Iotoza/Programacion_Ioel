package T3;
import java.util.Scanner;
import static T3.T3_5.tablademultiplicar;

public class T3_6 {
public static void tablasnumeros(int num) {

    tablademultiplicar(num);
    int cont = 0;
    do {

        System.out.println("La tabla del: " + num);
        tablademultiplicar(num);
        cont++;

    } while (cont < 10);

    }
}
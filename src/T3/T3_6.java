package T3;

import static T3.T3_5.tablademultiplicar;

public class T3_6 {
public static void main(String[] args) {
int num = 0;

tablademultiplicar(num);

    do {

        System.out.println("La tabla del: " + num);
        tablademultiplicar(num);
        num++;

    } while (num < 10);



    }
}
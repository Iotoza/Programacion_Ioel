package T2_2;
import java.util.Scanner;
public class T2_28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //calcula un numero aleatorio del 0 al 99.999 ambos incluidos

        int premio_lote = (int) (Math.random()*100000);

        System.out.println("Dame un numero de loteria (5 cifras)");

        int lote_usu= sc.nextInt();

        while (lote_usu > premio_lote||lote_usu < premio_lote) {

            System.out.println("El numero "+lote_usu+" es incorrecto");
            System.out.println("El numero "+premio_lote+" era el correcto");

            premio_lote = (int) (Math.random()*100000);

            System.out.println("Dame otro numero de loteria");

            lote_usu= sc.nextInt();

            if(lote_usu==premio_lote){

                System.out.println("El numero "+lote_usu+" es correcto");
                System.out.println("FELICIDADES!!!!PONÉ LA MÚSICA!!!!!");

            }
        }

        if(lote_usu == premio_lote){

            System.out.println("El numero "+lote_usu+" es correcto");
            System.out.println("FELICIDADES!!!!PONÉ LA MÚSICA!!!!!");

        }










    }
}
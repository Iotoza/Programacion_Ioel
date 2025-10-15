package T2;

import java.util.Scanner;

    public class T2_EJ4 {
        public static void main(String[] args) {

        //Decidir que numero es mas grande

            Scanner in = new Scanner(System.in);

            System.out.println("Dame el primer numero");
            int num1 = in.nextInt();

            System.out.println("Dame el segundo");
            int num2 = in.nextInt();

            System.out.println("Dame el tercero");
            int num3 = in.nextInt();

            // A partir de aquí se decide cual es el numero mayor, lo  hacemos designando
            // una variable nueva en la que se ubicaría el numero mas alto

            int num4 = 0;

            //El && se utiliza para marcar que si el 1 es mayor que el 2 y el 3 entonces es el mas mayor

            if (num1 > num2 && num1 > num3)

                num4 = num1;
            else if (num2 > num1 && num2 > num3 )

                num4 = num2;
            else num4 = num3;

            // Solo se necesitan 2 variables porque con el ultimo else hemos dicho que si no se cumple
            // ninguna de las anteriores condiciones eso significa que el mas mayor es el 3

            System.out.println("El numero mas grande es " + num4 );
        }
}
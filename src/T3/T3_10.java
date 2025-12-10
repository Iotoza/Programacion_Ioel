package T3;

import java.util.Scanner;

import static T3.T3_1.numberSign;
import static T3.T3_2.validezedad;
import static T3.T3_3.*;
import static T3.T3_4.*;
import static T3.T3_5.tablademultiplicar;
import static T3.T3_6.tablasnumeros;
import static T3.T3_7.esPrimo;
import static T3.T3_8.fechacorrecta;
import static T3.T3_9.piramide;

public class T3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige el modo del programa: ");

        char op = sc.next().charAt(0);

        switch (op) {
            case 'a':

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
                break;

            case 'b':
                validezedad();
                break;

            case 'c':

                System.out.print("Ingrese el numero del radio: ");

                int r = sc.nextInt();

                //Control de validez

                boolean valid = validRadius(r);
                if (!valid) {
                    System.out.println("No pasa el control");
                } else {

                    System.out.println("El numero ha pasado el control");

                    //Calculo de perimetro

                    double perimetre = calculatePerimetre(r);
                    System.out.print("El perimetre según el radio es : " + perimetre);

                    double area = calculateArea(r);
                    System.out.print("El area es " + area);

                }
                break;

            case 'd':

                double d = 0;
                double e = 0;

                showMenu();

                char op1 = sc.next().charAt(0);

                switch (op1) {

                    case 'D':
                        System.out.println("De dolares a euros");
                        System.out.println("Cuantos dolares tienes?");
                        d = sc.nextDouble();
                        System.out.println("Perfecto iniciando conversión");
                        double resul = dolarEuro(d);
                        System.out.println("El resultado es : " + resul + " euros");


                    case 'E':

                        System.out.println("De euros a dolares");
                        System.out.println("Cuantos euros tienes?");
                        e = sc.nextDouble();
                        System.out.println("Perfecto iniciando conversión");
                        double resultado = euroDolar(e);
                        System.out.println("El resultado es : " + resultado + " dolares");

                    default:
                        System.out.println("Error");
                }
                break;

            case 'e':
                System.out.println("Dame un numero del 1 al 10");

                int num = sc.nextInt();

                tablademultiplicar(num);

                break;

            case 'f':
                System.out.println("Dame un numero");
                num = sc.nextInt();
                tablasnumeros(num);

                break;


            case 'g':

                System.out.println("Dame un numero");

                int num1 = sc.nextInt();

                do {

                    esPrimo(num1);

                    if (esPrimo(num1)) {
                        System.out.println("El numero" + num1 + "es primo");
                    } else {
                        System.out.println("No es Primo");
                    }

                    System.out.print("Dame otro numero (0 para parar)");
                    num1 = sc.nextInt();

                } while (num1 != 0);
                break;

            case 'h':
                System.out.print("Dame un dia: ");
                int dia = sc.nextInt();

                System.out.print("Dame un mes: ");
                int mes = sc.nextInt();

                System.out.print("Dame un año: ");
                int ano = sc.nextInt();

                if (fechacorrecta(dia, mes, ano)) {
                    System.out.println("La fecha: " + dia + "/" + mes + "/" + ano + "es correcta");
                } else {
                    System.out.println("La fecha no es correcta");
                }

                break;

            case 'i':

                piramide();

            default:
                System.out.println("Tu no ereh' un real brrrrrr puñetah'");
        }

    }
}
package T3;

import java.util.Scanner;

public class T3_8 {

    public static boolean fechacorrecta(int dia, int mes, int ano) {

        Scanner sc = new Scanner(System.in);

        while (dia > 31 || dia < 1) {
            System.out.println("El " + dia + " no es un dia valido");
            System.out.print("Dame otro dia: ");
            dia = sc.nextInt();
        }

        while (mes > 12 || mes < 1) {
            System.out.println("El " + mes + " no es un dia valido");
            System.out.print("Dame otro mes: ");
            mes = sc.nextInt();
        }

        while (ano < 1) {
            System.out.println("El " + ano + " no es un dia valido");
            System.out.print("Dame otro año: ");
            ano = sc.nextInt();
        }

        return true;

    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
    }
}
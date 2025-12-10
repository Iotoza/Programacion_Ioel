package T3.T3_4_Arrays;

import java.util.Scanner;

public class MyArray {

    public  static void imprimir_array (int[] lista){
    for (int cont = 0; cont < lista.length; cont++)
        System.out.print(lista[cont]);
    }

    public static void maximo_array (int[] lista){

        int max = lista[0];
        for( int cont =0; cont < lista.length; cont++) {

            if (lista[cont] > max) {
                max = lista[cont];
            }
        }
        System.out.print("El maximo es: "+ max);
    }

    public static void minimo_array (int[] lista){

        int cont;
        int min = lista[0];
        for(cont= 0; cont < lista.length; cont++) {

            if (lista[cont] < min) {
                min = lista[cont];
            }
        }
        System.out.print("El minimo es: "+ min);
    }

    public static void lista_media(int[] lista){

        int cont;
        int sumat = 0;
        for(cont= 0; cont < lista.length; cont++) {

            sumat = sumat + lista[cont];
        }
        System.out.print("La media es: " + sumat / cont );
    }

    public static boolean existencia(int[] lista,int comp) {


        boolean error = false;

        for (int cont = 0; cont < lista.length; cont++) {
            if (comp == lista[cont]) {
                System.out.println("Hay una coincidencia");
                return true;
            }
        }
        System.out.println("No hay coincidencias");
        return false;
    }

    public static int suma_por_vectores (int[] lista1,int[] lista2) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame vector del array1");
        int pos1 = sc.nextInt();

        System.out.println("Dame el vector del array2");
        int pos2 = sc.nextInt();

        return lista1[pos1] + lista2[pos2];
    }

    public static int resta_por_vectores (int[] lista1,int[] lista2) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame vector del array1");
        int pos1 = sc.nextInt();

        System.out.println("Dame el vector del array2");
        int pos2 = sc.nextInt();

        return lista1[pos1] - lista2[pos2];
    }

    public static int escalado_por_vectores (int[] lista1,int[] lista2) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame vector del array1");
        int pos1 = sc.nextInt();

        System.out.println("Dame el vector del array2");
        int pos2 = sc.nextInt();

        return lista1[pos1] * lista2[pos2];
    }

    public static int inversion_de_vectores (int[] lista1){







        return ;
    }

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] lista1 = new int[] {1,2,3,4,5};



        System.out.println((lista1));

    }
}
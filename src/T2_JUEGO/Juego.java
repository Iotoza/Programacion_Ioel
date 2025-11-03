package T2_JUEGO;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HP = 0;
        int DEF = 0;
        int MP = 0;
        int DMG = 0;
        int contador_peaso = 0;
        int t_atributos= 0;

        //Crítico se divide en daño y % si el porcentaje supera un 50%
        //acierta el crítico, el daño crítico tiene que ser el daño base + el porcentaje de crítico

        double crit_ch = Math.floor(Math.random() * 100);
        double crit_dmg = Math.floor(Math.random() * 100);

        //  if (crit_ch > 50)
        double critico = Math.floor(DMG * (crit_dmg / 100));


        System.out.println("PLAYER 1");
        System.out.println("SELECCIONA ESTADISTICAS");

        //Estadisticas Player1 y Modo


        //Control 1 PTS. INDIVIDUALES{

        //Vida

        System.out.print("HP: ");
        HP = sc.nextInt();
        while (HP > 500 ) {
            System.out.println("No, no puedes tener todos los puntos en vida,friki, 200 MAX");
            HP = sc.nextInt();
        }

        //Defensa

        System.out.print("DEF: ");
        DEF = sc.nextInt();
        while (DEF > 200) {
            System.out.println("No, no puedes ser Malphite, pero buen try, 200 MAX");
            DEF = sc.nextInt();
        }

        //Maná (ataques magicos)

        System.out.print("MP: ");
        MP = sc.nextInt();
        while (MP > 200) {
            System.out.println("No, no puedes ser Merlin, tienes la varita demasiado corta,eso si tienes varita, 200 MAX");
            MP = sc.nextInt();
        }

        //Daño

        System.out.print("DMG: ");
        DMG = sc.nextInt();
        while (DMG > 200) {
            System.out.println("Bro estas jugando, un juego, no te proyectes en algo que no eres *skull emoji*, 200 MAX");
            DMG = sc.nextInt();
        }



        //Control 2 SUMA TOTAL PTS. {

        t_atributos= HP + DEF + MP + DMG;

        if (t_atributos > 500); {

            System.out.println("Pruebe de nuevo, y no se pase de los 500 pts totales");

            System.out.print("HP: ");
            HP = sc.nextInt();


            System.out.print("DEF: ");
            DEF = sc.nextInt();


            System.out.print("MP: ");
            MP = sc.nextInt();


            System.out.print("DMG: ");
            DMG = sc.nextInt();

        }

        //He pensado en asignación de clase automatica según los puntos sumados, será más sencillo
        // es decir, tienes 70 DE MP == MAGO || 70 DE DMG == BARBARO || 70 DE VIDA == MONGE || 70 DE DEFENSA == CABALERO
        // luego si sigo con este proyecto de manera personal podría añadir cosas como percepción para tener arqueros
        // cambiar el daño por inteligencia para los magos y demás interacciónes














        //Control 3 {

        while (HP <= 0 || DEF < 0 || MP < 0 || DMG < 0) {

            System.out.println("System: No se pueden números negativos base, ni no tener vida");
            System.out.println("System: Vamos a hacerlo mas sencillo");
            System.out.println("System : SELECCIONA ESTADISTICAS O [67_76_65_83_69]");
            char dest = sc.nextLine().charAt(0);

            if (dest == 'C') {

                System.out.println("Bienvenido al modo Player vs ^CPU^");
                System.out.println("Muchos lo han intentado han intentado ganarme, pocos lo han conseguido");
                System.out.println("Si pierdes el precio a pagar sera alto, estas dispuesto?");
                System.out.println("if contrato == 'N'-()(·(/$=)·¿=·}[|@#~]{");
                System.out.println("Bueno, tampoco es que me importe, es tarde para elegir ;) ");
                System.out.println("Selecciona clase, pringao' >:) ");


            }
                if (dest == 'E') {
                    HP = sc.nextInt();
                    DEF = sc.nextInt();
                    MP = sc.nextInt();
                    DMG = sc.nextInt();
                    contador_peaso++;
                }



                if (t_atributos > 500) {

                    System.out.println("Pruebe de nuevo, y no se pase de los 500 pts totales");

                    System.out.print("HP: ");
                    HP = sc.nextInt();


                    System.out.print("DEF: ");
                    DEF = sc.nextInt();


                    System.out.print("MP: ");
                    MP = sc.nextInt();


                    System.out.print("DMG: ");
                    DMG = sc.nextInt();

                }


































































                if (contador_peaso > 5) {
                    System.out.println("System: illo' que pesao' ereh' mi arrrma' ");
                    System.out.println("System: pon'  loh numeritoh' ya y au");

                }
                if (contador_peaso > 10) {
                    System.out.println("System: TUUUUUU, ereh' un menah quillo ");
                    System.out.println("System: Como sigah' tocando loh' cojoneh' te mando a volah' como a Carrero Blanco");
                }
            }
        }
    }
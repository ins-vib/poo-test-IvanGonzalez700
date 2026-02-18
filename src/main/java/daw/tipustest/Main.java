package daw.tipustest;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

        public static void main(String[] args) {

        ArrayList<Pregunta> preguntesTest = inicialitzarPreguntes();
        Test test = new Test(preguntesTest);
        mostrarMenu(test);

        }

        public static ArrayList<Pregunta> inicialitzarPreguntes() {
        ArrayList<Pregunta> preguntes = new ArrayList<>();
        
        preguntes.add(new Pregunta("Qui va pintar el Guernica",
                new String[]{"Velàzquez", "Goya", "Picasso"}, 2));
        preguntes.add(new Pregunta("Qui va escriure Alicia al país de les meravelles",
                new String[]{"Grimm", "Stevenson", "Carrol"}, 2));
        preguntes.add(new Pregunta("Quina és la magnitud que relaciona espai i temps",
                new String[]{"velocitat", "temperatura", "pes"}, 0));
        preguntes.add(new Pregunta("Si el radi d'una circumferència és 4, el seu diàmetre és",
                new String[]{"4", "8", "12", "14"}, 1));
        preguntes.add(new Pregunta("Quants segons té 1 hora",
                new String[]{"420", "760", "3600"}, 2));
        preguntes.add(new Pregunta("Quin no és un llenguatge de programació",
                new String[]{"java", "php", "samsung"}, 2));
        preguntes.add(new Pregunta("Dins un termòmetre hi trobem",
                new String[]{"aigua", "aigua amb gas", "mercuri"}, 2));
        preguntes.add(new Pregunta("L'Acropolis es troba a",
                new String[]{"Atenes", "Roma", "París"}, 0));
        preguntes.add(new Pregunta("L'element químic amb símbol Fe és ",
                new String[]{"Estronci", "Ferro", "Feril·li"}, 1));
        preguntes.add(new Pregunta("La capital d'Estats Units és",
                new String[]{"Georgetown", "New York", "Washington"}, 2));
        
        return preguntes;
        }

        public static void mostrarMenu(Test test) {
        
                Scanner teclat = new Scanner(System.in);

                int opcio = 6;

                while (opcio != 5) {
                System.out.println(test.getEnunciatPreguntaActual());
                System.out.println("Tria una opció: (1)Endarrera - (2) Respondre - (3) Endavant - (4) Finalitzar ");
                test.getRespostesPreguntaActual();
                opcio = teclat.nextInt();
                System.out.println("Has escollit: "+ opcio);


                switch (opcio) {
                case 1:
                        test.anarEndarrera();
                        break;
                case 2:
                        System.out.println("Tecleja el numero de resposta");
                        test.respondre(teclat.nextInt());
                        break;
                case 3:
                        test.anarEndavant();
                        break;
                case 4:
                        System.out.println("La teva puntuacio es: " + test.solucionarTest());
                        opcio = 5;
                        break;
                }       
        }
        teclat.close();
        }
}
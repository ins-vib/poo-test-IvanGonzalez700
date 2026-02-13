package daw.tipustest;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        
        ArrayList<Pregunta> preguntes = inicialitzarPreguntes();
        
        
        Test test1 = new Test(preguntes);

        mostrarMenu();
        
        
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

    public static void mostrarMenu() {
        
        Scanner teclat = new Scanner(System.in);
        int opcio;
        
        while (opcio != -1) {
                System.out.println("\nMenu");
                System.out.println("1. Anar endavant");
                System.out.println("2. Anar endarrera");
                System.out.println("3. Respondre");
                System.out.println("4. Finalitzar");

                System.out.print("\nTria una opció: ");
                opcio = teclat.nextInt();
                
                switch (opcio) {
                case 1:
                Test.anarEndavant();
                mostrarMenu();
                break;
                case 2:
                Test.anarEndarrera();
                mostrarMenu();
                break;
                case 3:
                Test.respondre(opcio);
                mostrarMenu();
                break;
                case 4:
                System.out.println("Puntuacio: " + Test.solucionarTest());
                opcio = -1;
                break;
                
                default:
                System.out.println("Opció no vàlida");
                mostrarMenu();
                break;
                }
        } 
}
}

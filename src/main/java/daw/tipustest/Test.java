package daw.tipustest;

import java.util.ArrayList;

public class Test {
    
    ArrayList<Pregunta> preguntes = new ArrayList<>();
    ArrayList<Integer> respostes = new ArrayList<>();
    int numPregunta;

    public Test(ArrayList<Pregunta> preguntes) {
        this.preguntes = preguntes;
        this.numPregunta = 0;
    }

    public String getEnunciatPreguntaActual(){
        String enunciat = "Pregunta " + (numPregunta + 1) + ": " + preguntes.get(numPregunta).getEnunciat();
        return enunciat;
    }

    public void getRespostesPreguntaActual(){
        String[] respostes = preguntes.get(numPregunta).getRespostes();
        
        String[] respostesFormatejades = new String[respostes.length];
        for (int i = 0; i < respostes.length; i++) {
            System.out.println(respostesFormatejades[i] = (i + 1) + ". " + respostes[i]);
        }
    }

    public int getNumeroPregunta(){
        return numPregunta;
    }

    public void respondre(int resposta){
        respostes.add(resposta);
        numPregunta++;
    }

    public boolean anarEndavant(){

        if (numPregunta + 1 < preguntes.size()) {
            numPregunta++;
            return true;
        } else {
            System.out.println("No hi ha mes preguntes");
            return false;
        }
    }

    public boolean anarEndarrera(){
        
    if (numPregunta > 0) {
            numPregunta--;
            return true;
        } else {
            System.out.println("No pots anar enrere");
            return false;
        }
    }

    public double solucionarTest(){
        
        double puntuacio = 0;

        for (int i = 0; i < respostes.size(); i++) {
            if (respostes.get(i) == preguntes.get(i).getCorrecta()+1) {
                puntuacio = puntuacio + 10 / preguntes.size();
            }
        }

        return puntuacio;
    }
}


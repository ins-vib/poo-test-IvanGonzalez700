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
        return preguntes.get(numPregunta).getEnunciat();
    }

    public String[] getRespostesPreguntaActual(){
        return preguntes.get(numPregunta).getRespostes();
    }

    public int getNumeroPregunta(){
        return numPregunta;
    }

    public void respondre(int resposta){
        respostes.add(resposta);
    }

    public boolean anarEndavant(){
        numPregunta++;
    if (numPregunta < preguntes.size()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean anarEndarrera(){
        numPregunta--;
    if (numPregunta >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public double solucionarTest(){
        double puntuacio = 0;
        for (int i = 0; i < respostes.size(); i++) {
            if (respostes.get(i) == preguntes.get(i).getCorrecta()) {
                puntuacio++;
            }
        }
        return puntuacio;
    }
}


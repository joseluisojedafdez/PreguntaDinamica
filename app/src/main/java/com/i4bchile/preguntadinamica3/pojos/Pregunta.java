package com.i4bchile.preguntadinamica3.pojos;

import java.util.ArrayList;

public class Pregunta {

    //categoria + dificultad + preguntas + alternativas + respuesta correcta
    private String categoria;
    private String dificultad;
    private String pregunta;
    private String correcta;
    private ArrayList<String> incorrectas;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    public ArrayList<String> getIncorrectas() {
        return incorrectas;
    }

    public void setIncorrectas(ArrayList<String> incorrectas) {
        this.incorrectas = incorrectas;
    }

    @Override
    public String toString() {
        return "PreguntaLista{" +
                "categoria='" + categoria + '\'' +
                ", dificultad='" + dificultad + '\'' +
                ", pregunta='" + pregunta + '\'' +
                ", correcta='" + correcta + '\'' +
                ", incorrectas=" + incorrectas +
                '}';
    }
}

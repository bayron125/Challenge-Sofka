package modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private final List<Pregunta>preguntas;

    public Categoria(){
        this.preguntas = new ArrayList<>();
    }

    public void agregarPregunta(Pregunta p){
        this.preguntas.add(p);
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }
}

package modelo;

import java.util.*;

public class Pregunta {

    private final String pregunta;
    private final List<Respuesta> respuestas;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        respuestas = new ArrayList<>();
    }

    public Pregunta(String pregunta, List<Respuesta> respuestas) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
    }

    public void agregarRespuesta(Respuesta respuesta) {
        this.respuestas.add(respuesta);
    }

    public String getPregunta() {
        return pregunta;
    }

    public List<Respuesta> getRespuestas() {

       //  Collections.shuffle(respuestas);

        return this.respuestas;
    }
}

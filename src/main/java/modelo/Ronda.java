package modelo;

import java.util.Random;

public class Ronda {

    private final Pregunta pregunta;
    private final int puntos;
    private static int ultPuntos=200;

    public Ronda(Categoria categoria) {
        this.pregunta = categoria.getPreguntas().get(new Random().nextInt(categoria.getPreguntas().size())) ;
        puntos = ultPuntos;
        ultPuntos=ultPuntos*2;
    }

    public Pregunta getPregunta(){
        return this.pregunta;
    }

    public int getPuntos(){
        return puntos;
    }

    public static void reiniciarPuntos(){
        ultPuntos=200;
    }
}

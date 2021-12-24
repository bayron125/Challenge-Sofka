package util;

import modelo.Categoria;
import modelo.Pregunta;
import modelo.Respuesta;
import repositorio.BancoDePreguntas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreguntasPorDefecto {
    public static BancoDePreguntas generarPreguntas() {
        BancoDePreguntas bp = new BancoDePreguntas();
        Categoria categoria = new Categoria();
        Pregunta pregunta;


        List<Respuesta> respuestas = new ArrayList<>();
        Scanner x = new Scanner(System.in);

        pregunta = new Pregunta("¿Cual es la capital de Colombia?",respuestas);

        respuestas.add(new Respuesta("Bogota",true));
        respuestas.add(new Respuesta("Medellin"));
        respuestas.add(new Respuesta("Cali"));
        respuestas.add(new Respuesta("Pasto"));

        categoria.agregarPregunta(pregunta);
        bp.agregar(categoria);

        respuestas = new ArrayList<>();

        pregunta = new Pregunta("¿Cuál es el lugar más frío de la tierra?",respuestas );

        respuestas.add(new Respuesta("La Patagonia"));
        respuestas.add(new Respuesta("Antartida",true));
        respuestas.add(new Respuesta("Polo norte"));
        respuestas.add(new Respuesta("Pasto"));

        categoria.agregarPregunta(pregunta);
        bp.agregar(categoria);



        categoria.agregarPregunta(pregunta);

        bp.agregar(categoria);
        return bp;
    }
}

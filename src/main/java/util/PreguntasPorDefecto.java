package util;

import modelo.Categoria;
import modelo.Pregunta;
import modelo.Respuesta;
import repositorio.BancoDePreguntas;

import java.util.ArrayList;
import java.util.List;

/**Esta es una clase provisional en la cual se crean y asignan las preguntas con sus respectivas respuestas
 */
public class PreguntasPorDefecto {
    public static BancoDePreguntas generarPreguntas() {
        BancoDePreguntas bp = new BancoDePreguntas();
        List<Respuesta> respuestas = new ArrayList<>();
        Categoria categoria = new Categoria();

        Pregunta pregunta;

        //categoria 1

        pregunta = new Pregunta("¿Cual es la capital de Colombia?", respuestas);
        respuestas.add(new Respuesta("Bogota", true));
        respuestas.add(new Respuesta("Medellin"));
        respuestas.add(new Respuesta("Cali"));
        respuestas.add(new Respuesta("Pasto"));

        categoria.agregarPregunta(pregunta);


        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es el lugar más frío de la tierra?", respuestas);
        respuestas.add(new Respuesta("La Patagonia"));
        respuestas.add(new Respuesta("Antartida", true));
        respuestas.add(new Respuesta("Polo norte"));
        respuestas.add(new Respuesta("Pasto"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cuántos minutos tiene una hora?", respuestas);
        respuestas.add(new Respuesta("24"));
        respuestas.add(new Respuesta("30"));
        respuestas.add(new Respuesta("60", true));
        respuestas.add(new Respuesta("90"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cada cuántos años tenemos un año bisiesto?", respuestas);
        respuestas.add(new Respuesta("4", true));
        respuestas.add(new Respuesta("5"));
        respuestas.add(new Respuesta("6"));
        respuestas.add(new Respuesta("3"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Qué es un siglo?", respuestas);
        respuestas.add(new Respuesta("100 dias"));
        respuestas.add(new Respuesta("10 años"));
        respuestas.add(new Respuesta("100 años", true));
        respuestas.add(new Respuesta("1000 años"));

        categoria.agregarPregunta(pregunta);
        bp.agregar(categoria);


        //categoria 2
        categoria = new Categoria();
        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Quién fue Cleopatra?",respuestas);
        respuestas.add(new Respuesta("Libertadora de roma"));
        respuestas.add(new Respuesta("Primera emperatriz China"));
        respuestas.add(new Respuesta("Primera mujer en votar"));
        respuestas.add(new Respuesta(" última faraona de Egipto",true));

        categoria.agregarPregunta(pregunta);

        respuestas= new ArrayList<>();
        pregunta = new Pregunta("¿Qué planeta es el más cercano al Sol?",respuestas);
        respuestas.add(new Respuesta("proxima b"));
        respuestas.add(new Respuesta("venus"));
        respuestas.add(new Respuesta("saturno"));
        respuestas.add(new Respuesta("mercurio",true));

        categoria.agregarPregunta(pregunta);

        respuestas= new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es la montaña más alta en la actualidad?",respuestas);
        respuestas.add(new Respuesta("K2"));
        respuestas.add(new Respuesta("Cho oyu"));
        respuestas.add(new Respuesta("Everest",true));
        respuestas.add(new Respuesta("Manaslu"));

        categoria.agregarPregunta(pregunta);

        respuestas= new ArrayList<>();
        pregunta = new Pregunta(" Si alguien de España habla español, alguien de Portugal portugués y alguien de Francia francés. ¿Qué habla alguien de Brasil?",respuestas);
        respuestas.add(new Respuesta("brasileño"));
        respuestas.add(new Respuesta("mandarin"));
        respuestas.add(new Respuesta("portugues",true));
        respuestas.add(new Respuesta("catalan"));

        categoria.agregarPregunta(pregunta);

        respuestas= new ArrayList<>();
        pregunta = new Pregunta("¿En qué ciudad se encuentra la Torre Eiffel?",respuestas);
        respuestas.add(new Respuesta("paris",true));
        respuestas.add(new Respuesta("roma"));
        respuestas.add(new Respuesta("moscu"));
        respuestas.add(new Respuesta("new york"));

        categoria.agregarPregunta(pregunta);
        bp.agregar(categoria);

        //categoria3
        categoria = new Categoria();
        respuestas= new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es el nombre del río más largo del mundo?",respuestas);
        respuestas.add(new Respuesta("Rio Plata"));
        respuestas.add(new Respuesta("Río Nilo"));
        respuestas.add(new Respuesta("Río Amazonas",true));
        respuestas.add(new Respuesta("Río Danubio"));

        categoria.agregarPregunta(pregunta);

        respuestas= new ArrayList<>();
        pregunta = new Pregunta("¿Quién es el padre del psicoanálisis?",respuestas);
        respuestas.add(new Respuesta("Sigmund Freud",true));
        respuestas.add(new Respuesta(" Carl Gustav Jung"));
        respuestas.add(new Respuesta("Skinner"));
        respuestas.add(new Respuesta("Nicolas Maquiavelo"));

        categoria.agregarPregunta(pregunta);

        respuestas= new ArrayList<>();
        pregunta = new Pregunta(" ¿Cuál es el océano más grande del mundo?",respuestas);
        respuestas.add(new Respuesta("Ocean Antartico"));
        respuestas.add(new Respuesta("Océano Índico"));
        respuestas.add(new Respuesta("Océano Pacífico",true));
        respuestas.add(new Respuesta("Océano Atlántico"));

        categoria.agregarPregunta(pregunta);

        respuestas= new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es el país más grande del mundo?",respuestas);
        respuestas.add(new Respuesta("China"));
        respuestas.add(new Respuesta("Rusia",true));
        respuestas.add(new Respuesta("India"));
        respuestas.add(new Respuesta("Brasil"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta(" ¿Cuál es el país que tiene forma de bota?",respuestas);
        respuestas.add(new Respuesta("España"));
        respuestas.add(new Respuesta(" Honduras"));
        respuestas.add(new Respuesta("Francia"));
        respuestas.add(new Respuesta("Italia",true));

        categoria.agregarPregunta(pregunta);
        bp.agregar(categoria);

        //categoria 4
        categoria= new Categoria();
        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es el país más poblado de la tierra?",respuestas);
        respuestas.add(new Respuesta("Estados Unidos"));
        respuestas.add(new Respuesta("China",true));
        respuestas.add(new Respuesta("Rusia"));
        respuestas.add(new Respuesta("India"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es la ciudad de los rascacielos?",respuestas);
        respuestas.add(new Respuesta("Tokio"));
        respuestas.add(new Respuesta("New York",true));
        respuestas.add(new Respuesta("Hong Kong"));
        respuestas.add(new Respuesta("Berlin"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿En qué país se encuentra ubicada la Casa Rosada?",respuestas);
        respuestas.add(new Respuesta("Argentina",true));
        respuestas.add(new Respuesta("Chile"));
        respuestas.add(new Respuesta("Mexico"));
        respuestas.add(new Respuesta("Perú"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es la capital de Nicaragua?",respuestas);
        respuestas.add(new Respuesta("Santiago"));
        respuestas.add(new Respuesta("Quito"));
        respuestas.add(new Respuesta("Brasilia"));
        respuestas.add(new Respuesta("Managua",true));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿En qué país está ubicada la ciudad de Medellín?",respuestas);
        respuestas.add(new Respuesta("Colombia",true));
        respuestas.add(new Respuesta("Venezuela"));
        respuestas.add(new Respuesta("Perú"));
        respuestas.add(new Respuesta("Chile"));

        categoria.agregarPregunta(pregunta);
        bp.agregar(categoria);

        //categoria 5
        categoria = new Categoria();
        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es la ciudad italiana conocida como “la novia del mar”?",respuestas);
        respuestas.add(new Respuesta("Roma"));
        respuestas.add(new Respuesta("Florencia"));
        respuestas.add(new Respuesta("Venecia",true));
        respuestas.add(new Respuesta("Merida"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es la capital de Pakistán?",respuestas);
        respuestas.add(new Respuesta("Bagdag"));
        respuestas.add(new Respuesta("Islamabad",true));
        respuestas.add(new Respuesta("Marrakech"));
        respuestas.add(new Respuesta("Bankoc"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cuál es la cascada más alta del mundo?",respuestas);
        respuestas.add(new Respuesta("Cataratas de Iguazú"));
        respuestas.add(new Respuesta("El Salto del Ángel",true));
        respuestas.add(new Respuesta("Cataratas del Niáraga"));
        respuestas.add(new Respuesta("El salto del Nilo"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta(" ¿Cuál es la segunda montaña más alta del mundo?",respuestas);
        respuestas.add(new Respuesta("K2",true));
        respuestas.add(new Respuesta("M1"));
        respuestas.add(new Respuesta("Monte everest"));
        respuestas.add(new Respuesta("K3"));

        categoria.agregarPregunta(pregunta);

        respuestas = new ArrayList<>();
        pregunta = new Pregunta("¿Cuándo terminó la II Guerra Mundial?",respuestas);
        respuestas.add(new Respuesta("1945",true));
        respuestas.add(new Respuesta("1947"));
        respuestas.add(new Respuesta("1943"));
        respuestas.add(new Respuesta("1949"));

        categoria.agregarPregunta(pregunta);
        bp.agregar(categoria);
        return bp;
    }
}

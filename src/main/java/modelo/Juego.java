package modelo;

import repositorio.BancoDePreguntas;
import repositorio.HistoricoJugadores;
import util.PreguntasPorDefecto;

import java.sql.SQLException;
import java.util.Scanner;

public class Juego {
    private  Jugador jugador;
    private BancoDePreguntas categorias;
    private int acumulado;


    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void iniciar() throws SQLException {
        HistoricoJugadores historico = new HistoricoJugadores();
        int ind=1;
        if(categorias==null){
            categorias = PreguntasPorDefecto.generarPreguntas();
        }
        preguntas:
        for(Categoria c: categorias.listar()){
            Ronda ronda = new Ronda(c);
            Pregunta p = ronda.getPregunta();

            System.out.println("pregunta " + (ind++) + " por " + ronda.getPuntos() + " puntos");
            System.out.println(p.getPregunta());
            for(int i=0; i<p.getRespuestas().size(); i++){
                System.out.println(i +". "+p.getRespuestas().get(i).getRespuesta());
            }

            if(!(p.getRespuestas().get(registrarDato()).isCorrecta())){
                acumulado = 0;
                System.out.println("respuesta incorrecta, su puntaje es de " +acumulado);
                break;
            }
            acumulado+= ronda.getPuntos();
            System.out.println("tu respuesta es correcta");
            System.out.println("Puntos acumulados: " +acumulado);
            System.out.println("""
                    Desea continuar a la siguiente ronda
                    1. Si
                    2. No""");
            int continuar = 0;
            while(continuar != 1){
                continuar=registrarDato();
                if(continuar==1){
                    continue;
                }
                if(continuar == 2){
                    break preguntas;
                }
                System.out.println("valor ingresado invalido");
            }

        }
        jugador.setPuntos(acumulado);
        historico.agregar(jugador);
        Ronda.reiniciarPuntos();
        System.out.println("finaliza quiz");

    }

    private int registrarDato(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void configurarJuego(BancoDePreguntas bp){
        this.categorias = bp;
    }
}

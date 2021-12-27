package modelo;

import repositorio.BancoDePreguntas;
import repositorio.HistoricoJugadores;
import util.PreguntasPorDefecto;

import java.util.Scanner;

public class Juego {
    private  Jugador jugador;
    private BancoDePreguntas bp;
    private int acumulado;


    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void iniciar() {
        HistoricoJugadores historico = new HistoricoJugadores();
        int ind=1;
        if(bp ==null){
            bp = PreguntasPorDefecto.generarPreguntas();
        }

        trivia:
        for(Categoria c: bp.listar()){
            Ronda ronda = new Ronda(c);
            Pregunta p = ronda.getPregunta();
            int continuar = 0;

            System.out.println("pregunta " + (ind) + " por " + ronda.getPuntos() + " puntos");
            System.out.println(p.getPregunta());
            for(int i=0; i<p.getRespuestas().size(); i++){
                System.out.println((i+1) +". "+p.getRespuestas().get(i).getRespuesta());
            }

            if(!(p.getRespuestas().get((registrarDato()-1)).isCorrecta())){
                acumulado = 0;
                System.out.println("respuesta incorrecta, su puntaje es de " +acumulado);
                break;
            }
            acumulado+= ronda.getPuntos();
            System.out.println("tu respuesta es correcta");
            System.out.println("Puntos acumulados: " +acumulado);

            while(continuar != 1 && ind++ < bp.listar().size() ){

                System.out.println("""
                    Desea continuar a la siguiente ronda
                    1. Si
                    2. No""");

                continuar=registrarDato();
                if(continuar==1){
                    continue;
                }
                if(continuar == 2){
                    break trivia;
                }
                System.out.println("valor ingresado invalido");
            }
        }
        jugador.setPuntos(acumulado);
        historico.agregar(jugador);
        Ronda.reiniciarPuntos();
        System.out.println("finaliza la trivia, tus datos han sido registrados");
    }

    private int registrarDato() {
        Scanner scanner = new Scanner(System.in);
        try{
            return Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Debe indicar la opción con un valor numérico");
            return registrarDato();
        }
    }

    public void configurarJuego (BancoDePreguntas bp){
            this.bp = bp;
        }
}

package ejemplo;

import modelo.*;
import repositorio.HistoricoJugadores;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static util.InyectorPreguntas.ingresarPreguntas;

public class EjemploTrivia {

    public static void main(String[] args) throws SQLException, InterruptedException {
       boolean finalizar=false;
       Juego juego = new Juego();

        System.out.println("Bienvenido al juego");
        TimeUnit.MILLISECONDS.sleep(1000);

       while (!finalizar) {

           Scanner scanner = new Scanner(System.in);

           int opcion;

           System.out.println("""
                   Opciones:
                   1. Iniciar juego
                   2. Ingresar preguntas
                   3. Ver historial de juego
                   4. Salir""");

           opcion = Integer.parseInt(scanner.nextLine());
           if (opcion == 1) {
               System.out.println("Ingrese nombre de jugador:");
               juego.setJugador(new Jugador(scanner.nextLine()));
               juego.iniciar();
           }
           if (opcion == 2) {
               juego.configurarJuego(ingresarPreguntas());
           }
           if(opcion ==3){
               HistoricoJugadores historico = new HistoricoJugadores();
               System.out.println(historico.listar());
           }
           if(opcion == 4){
               finalizar=true;
           }

       }
    }


}
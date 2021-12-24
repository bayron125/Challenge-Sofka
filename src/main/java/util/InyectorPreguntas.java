package util;

import modelo.Categoria;
import modelo.Pregunta;
import modelo.Respuesta;
import repositorio.BancoDePreguntas;

import java.util.Scanner;

public class InyectorPreguntas {
    private static final Scanner scanner = new Scanner(System.in);

    public static BancoDePreguntas ingresarPreguntas (){
        int cantidadPreguntas=0;
        BancoDePreguntas preguntas = new BancoDePreguntas();
        /**en esta linea se encuentra definido el minimo de preguntas que permite registrar*/
        while(cantidadPreguntas<25){
            System.out.println("Ingrese cantidad total de preguntas a registrar:");
            cantidadPreguntas= Integer.parseInt(scanner.nextLine());
            if(cantidadPreguntas<5){
                System.out.println("la cantidad de preguntas no debe ser inferior a 25");
            }
        }
        for(int i = 0; i<5; i++){
            Categoria categoria= new Categoria();
            preguntas.agregar(categoria);
            for(int j = 0; j<cantidadPreguntas/5; j++) {
                System.out.println("Ingrese pregunta numero "
                        + (j+1) + " de la categoria " + (i + 1));
                Pregunta pregunta = new Pregunta(scanner.nextLine());
                categoria.agregarPregunta(pregunta);
                for (int k = 0; k < 4; k++) {
                    int correcta=0;
                    System.out.println("ingresa la respuesta " + (k+1));
                    Respuesta respuesta=new Respuesta(scanner.nextLine());
                    pregunta.agregarRespuesta(respuesta);

                    while(correcta!=1 && correcta!=2){

                        System.out.println("ingrese '1' si es correcta '2' si es falso");
                        correcta= Integer.parseInt(scanner.nextLine());
                        if(correcta==1){
                            respuesta.setCorrecta(true);
                            continue;
                        }if(correcta==2){
                            respuesta.setCorrecta(false);
                            continue;
                        }
                        System.out.println("Opcion errada, verifique su respuesta.");
                    }
                }
            }
        }

        return preguntas;
    }
}

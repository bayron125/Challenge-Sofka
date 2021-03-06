package modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Jugador {
    private Long id;
    private final String nombre;
    private  int puntos;
    private final Date fechaDeRegistro;

    public Jugador(String nombre){
        this.fechaDeRegistro = new Date();
        this.nombre = nombre;}

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }


    public int getPuntos() {
        return puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        DateFormat df=new SimpleDateFormat("d MMM yy HH:mm");

        return id + " | " + nombre + " | "+ df.format(fechaDeRegistro) +" | puntos:" + puntos + "\n" ;
    }
}

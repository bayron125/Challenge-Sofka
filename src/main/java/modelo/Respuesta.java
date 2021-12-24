package modelo;

public class Respuesta {
    private final String valor;
    private boolean correcta;

    public Respuesta(String valor) {
        this.valor = valor;
        correcta=false;
    }

    public Respuesta(String respuesta, boolean correcta) {
        this(respuesta);
        this.correcta = correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }

    public String getRespuesta() {
        return this.valor;
    }

    public boolean isCorrecta() {
        return correcta;
    }
}

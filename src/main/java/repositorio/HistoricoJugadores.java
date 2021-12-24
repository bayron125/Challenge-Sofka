package repositorio;

import modelo.Jugador;
import util.ConexionBaseDeDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HistoricoJugadores implements IRepisotorio<Jugador> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDeDatos.getIntance();
    }

    @Override
    public Jugador porId(int id) {
        Jugador resultado = null;
        try (PreparedStatement stmt = getConnection().
                prepareStatement("SELECT * FROM jugadores WHERE id= ?")) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    resultado = crearJugador(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public List<Jugador> listar() {
        List<Jugador> jugadores = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM jugadores ")) {
            while (rs.next()) {
                Jugador p = crearJugador(rs);
                jugadores.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jugadores;
    }

    @Override
    public void agregar(Jugador jugador) throws SQLException {
        String sql;
        if (jugador.getId() != null && jugador.getId() > 0) {
            sql = "UPDATE jugadores SET nombre=?, precio=? WHERE id=?";
        } else {

            sql = "INSERT INTO jugadores(nombre, puntos, fecha_registro) VALUES(?,?,?)";
        }
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, jugador.getNombre());
            stmt.setLong(2, jugador.getPuntos());
            stmt.setDate(3, new Date(jugador.getFechaDeRegistro().getTime()));
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }


    private Jugador crearJugador(ResultSet rs) throws SQLException {
        Jugador p = new Jugador(rs.getString("nombre"));
        p.setId(rs.getLong("id"));
        p.setPuntos(rs.getInt("puntos"));

        return p;
    }
}

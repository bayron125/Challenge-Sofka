package repositorio;

import java.sql.SQLException;
import java.util.List;

public interface IRepisotorio<T> {
    T porId(int id);

    List<T> listar();

    void agregar (T t) throws SQLException;
}

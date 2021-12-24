package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    private static final String url = "jdbc:mysql://udmlwpkpykvt5bql:TQk1UMzTotWYfImUR2TL@bnrifyrxxno5ulibzeyn-mysql.services.clever-cloud.com:3306/bnrifyrxxno5ulibzeyn";
    private static final String username = "udmlwpkpykvt5bql";
    private static final String password = "TQk1UMzTotWYfImUR2TL";
    private static Connection connection;

    public static Connection getIntance() throws SQLException {
        if( connection == null) {
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}

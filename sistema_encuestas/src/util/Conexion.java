package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Erik
 */
public class Conexion
{
    private static final String BASE = "db_encuestas";
    private static final String CONTOLADOR = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BASE + "?serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CLAVE = "1234";
    
    private Connection _conexion = null;

    static 
    {
        try
        {
            Class.forName( CONTOLADOR );
        }
        catch ( ClassNotFoundException e )
        {
            System.out.println("Error al cargar controlador");
            e.printStackTrace();
        }
    }
     
    /**
     * @return
     */
    public Connection conectar()
    {
                
        try
        {
            _conexion = DriverManager.getConnection( URL, USUARIO, CLAVE);
            
            System.out.println("Conección OK");
        }

        catch ( SQLException e )
        {
            System.out.println("Error en la conexón");
            e.printStackTrace();
        }
        
        return _conexion;
    }

}

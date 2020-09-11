package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
    private static final String CONTOLADOR = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/schema_ejemplo_java?serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CLAVE = "1234";

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
     
    public Connection conectar()
    {
        Connection conexion = null;
        
        try
        {
            conexion = DriverManager.getConnection( URL, USUARIO, CLAVE);
            
            System.out.println("Conección OK");
        }

        catch ( SQLException e )
        {
            System.out.println("Error en la conexón");
            e.printStackTrace();
        }
        
        return conexion;
    }

}

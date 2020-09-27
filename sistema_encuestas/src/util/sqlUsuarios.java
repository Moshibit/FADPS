/**
 * Created: 11 sep 2020
 */
package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

import data.UserDTO;

/**
 * @author Erik
 */
public class sqlUsuarios
{
    
    Conexion miconexion = new Conexion();
    
    Connection cn = null;
    Statement stm = null;
    ResultSet rs = null;
    
    
    public boolean registrar( UserDTO usr)
    {
        String sql = "INSERT INTO usuario (nombreUsuario, password, email, "
                + "lastSession) VALUES(?, ?, ?, ?)";
        
        try
        {
            ps = conexion.prepareStatement( sql );
            
            ps.setString(1, usr.getNombreUsuario() );
            ps.setString(2, usr.getPassword() );
            ps.setString(3, usr.getemail() );
            
            ps.execute();
            return true;
            
        }
        catch ( SQLException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
}

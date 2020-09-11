package test;

import java.sql.*;

import util.Conexion;


public class Tesconecion
{

    public static void main( String[] args )
    {
        Conexion miconexion = new Conexion();
        
        Connection cn = null;
        Statement stm = null;
        ResultSet rs = null;
        
        try
        {
            cn = miconexion.conectar();
            stm = cn.createStatement();
            rs = stm.executeQuery( "SELECT * FROM usuario" );
            
            while(rs.next()) 
            {
                int idUsr = rs.getInt( 1 );
                String usuario = rs.getString( 2 );
                
                System.out.println(idUsr + " - " + usuario);
            }
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                if(rs != null)
                {
                    rs.close();
                }
                
                if(stm != null)
                {
                    stm.close();
                }
                
                if(cn != null)
                {
                    cn.close();
                }
            }
            catch ( Exception e2 )
            {
                e2.printStackTrace();
            }
        }
        
        
    }

}

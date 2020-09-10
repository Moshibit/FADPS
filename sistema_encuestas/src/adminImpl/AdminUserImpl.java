/**
 * Created: 9 sep 2020
 */
package adminImpl;

import java.util.Map;
import java.util.TreeMap;

import admin.AdminUserInterface;
import data.UserDTO;

/**
 * @author UAML
 */
public class AdminUserImpl implements AdminUserInterface
{
    
    private Map<Integer, UserDTO> _usersMap = new TreeMap<Integer, UserDTO>();
    private int idGenerator = 1;

    /**
     * @see admin.AdminUserInterface#actualizar(int, data.UserDTO)
     */
    @Override
    public boolean actualizar( int id, UserDTO user )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @see admin.AdminUserInterface#agregarUsuario(data.UserDTO)
     */
    @Override
    public boolean agregarUsuario( UserDTO user )
    {
        // TODO: FALTA HACER UNA VALIDACION SU IMPLEMNTACION ES MUY BURDA
        
        _usersMap.put( idGenerator, user );
        idGenerator += 1;
        
        return true;
    }

    /**
     * @see admin.AdminUserInterface#eliminarUsuario(int, java.lang.String)
     */
    @Override
    public boolean eliminarUsuario( int id, String key )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @see admin.AdminUserInterface#getUser(int)
     */
    @Override
    public UserDTO getUser( int id )
    {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see admin.AdminUserInterface#mostrarUsuario(int)
     */
    @Override
    public void mostrarUsuario( int id )
    {
        // TODO Auto-generated method stub

    }

}

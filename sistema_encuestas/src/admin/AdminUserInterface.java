/**
 * Created: 9 sep 2020
 */
package admin;

import data.UserDTO;

/**
 * @author Erik
 * 
 * Este es la interfac del sistema. Son los metodos sin implementar.
 * Aqui se dice que hace el sistema pero no se dice como.
 * El como se hace se programa en la impelemtación
 */
public interface AdminUserInterface
{

    public boolean actualizar( int id, UserDTO user );

    public boolean agregarUsuario( UserDTO user );

    public boolean eliminarUsuario( int id, String key );

    public UserDTO getUser( int id );

    public void mostrarUsuario( int id );

}

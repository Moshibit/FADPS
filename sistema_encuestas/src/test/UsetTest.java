/**
 * Created: 9 sep 2020
 */
package test;

import data.UserDTO;

/**
 * @author Erik
 */
public class UsetTest
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        // probamos crear instancias con los constructores

        UserDTO myUsuario1 = new UserDTO( 1, "pato01", "wxyz", "un@correo.com", "0l" );

        // Test de metodos tostring y show con la instancia myUsuario1

        System.out.println( myUsuario1.toString() );
        myUsuario1.show();

    }

}

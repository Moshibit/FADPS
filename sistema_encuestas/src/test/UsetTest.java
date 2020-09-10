/**
 * Created: 9 sep 2020
 */
package test;

import static data.GeneroEnum.FEMENINO;
import static data.GeneroEnum.MASCULINO;

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

        UserDTO myUsuarioVacio = new UserDTO();
        UserDTO myUsuario1 = new UserDTO( "María", "Pérez", "Parra", FEMENINO,
                "maria@correoficticio.com" );

        // probamos los setter y getters con la instancias myUsuarioVacio

        myUsuarioVacio.setNombre( "Juan Miguel" );
        myUsuarioVacio.setPaterno( "González" );
        myUsuarioVacio.setMaterno( "Peralta" );
        myUsuarioVacio.setGenero( MASCULINO );
        myUsuarioVacio.setEmail( "juan@correoficticio.com" );

        System.out.println( myUsuarioVacio.getNombre() );
        System.out.println( myUsuarioVacio.getPaterno() );
        System.out.println( myUsuarioVacio.getMaterno() );
        System.out.println( myUsuarioVacio.getGenero() );
        System.out.println( myUsuarioVacio.getEmail() );

        // Test de metodos tostring y show con la instancia myUsuario1

        System.out.println( myUsuario1.toString() );
        myUsuario1.show();

    }

}

/**
 * Created: 9 sep 2020
 */
package util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Erik
 * 
 * Aquideben ir métodos staticos publicos que puedan ser de utilidad
 */
public class Util
{
    /**
     * este metodo es un solo un ejemplo. lo que hace es recibir po teclado 
     * un correo, si el correo no es valido no deja pedir hasta que se mete un correo valido
     * quizás se tenga que modificar lo tome solo como ejemplo
     * 
     * Su escencia es verificar correo electrónicos validos por medio de una
     * expresion regular. 
     * 
     * @param sc
     * @return
     */
    public static String scanEmail( Scanner sc )
    {
        String str;
        String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/="
                + "?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        boolean validEmail = false;
        Pattern myPattern = Pattern.compile( regex );
        Matcher myMatcher;

        System.out.println( "<- Ingresa el e-mail: " );

        do
        {
            str = sc.nextLine();

            myMatcher = myPattern.matcher( str );

            if ( myMatcher.find() )
            {
                validEmail = true;
            }
            else
            {
                System.out.println( ">> e-mail inválido, intenta de nuevo." );
            }

        }
        while ( !(validEmail) );

        return str;
    }
}

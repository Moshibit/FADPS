/**
 * Created: 27 sep 2020
 */
package data;

/**
 * @author Erik
 */
public enum Escolaridad
{
    PRIMARIA, SECUNDARIA, BACHILLERATO, SUPERIOR;

    public String getValue()
    {
        switch ( this )
        {
            case PRIMARIA:
                return "Primaria";
            case SECUNDARIA:
                return "Secundaria";
            case BACHILLERATO:
                return "Bachillerato";
            case SUPERIOR:
                return "Superior";
            default:
                return "No asignado";
        }
    }

}

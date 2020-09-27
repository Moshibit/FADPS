/**
 * Created: 27 sep 2020
 */
package data;

/**
 * @author Erik
 */
public enum Ingresos
{
    BAJO, MEDIO, ALTO;

    public String getValue()
    {
        switch ( this )
        {
            case BAJO:
                return "Bajo";
            case MEDIO:
                return "Medio";
            case ALTO:
                return "ALto";
            default:
                return "No asignado";
        }

    }

}

/**
 * Created: 27 sep 2020
 */
package data;

/**
 * @author Erik
 */
public enum EstadoCivil
{
    SOLTERO, CASADO, DIVORSIADO, VIUDO;

    /**
     * @return
     */
    public String getValue()
    {
        switch ( this )
        {
            case SOLTERO:
                return "Soltero";
            case CASADO:
                return "Casado";
            case DIVORSIADO:
                return "Divorsiado";
            case VIUDO:
                return "Vuido";
            default:
                return "No asignado";
        }
    }

}

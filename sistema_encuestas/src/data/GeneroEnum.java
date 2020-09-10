/**
 * Created: 9 sep 2020
 */
package data;

/**
 * @author Erik
 */
public enum GeneroEnum
{
    FEMENINO,
    MASCULINO;
    
    /**
     * @return
     */
    public String getValue() 
    {
        switch ( this )  
        {
            case FEMENINO: return "Femenino";
            case MASCULINO: return "Masculino";
            default: return "No asignado";
        }
    }
}

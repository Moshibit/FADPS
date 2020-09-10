/**
 * Created: 9 sep 2020
 */
package data;

/**
 * @author Erik
 */
public class UserDTO
{

    // *** Atributos ***********************************************************

    private String _nombre; // nombre o nombres del usuario

    private String _paterno; // apellido paterno

    private String _materno; // apellido materno

    private GeneroEnum _genero;

    private String _email;

    // *** Constructores *******************************************************

    /**
     * 
     */
    public UserDTO()
    {}

    /**
     * @param nombre
     * @param paterno
     * @param materno
     * @param email
     */
    public UserDTO( String nombre, String paterno, String materno,
            GeneroEnum genero, String email )
    {
        super();
        _nombre = nombre;
        _paterno = paterno;
        _materno = materno;
        _genero = genero;
        _email = email;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return _email;
    }

    /**
     * @return the genero
     */
    public GeneroEnum getGenero()
    {
        return _genero;
    }

    /**
     * @return the materno
     */
    public String getMaterno()
    {
        return _materno;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return _nombre;
    }

    /**
     * @return the paterno
     */
    public String getPaterno()
    {
        return _paterno;
    }

    /**
     * @param email the email to set
     */
    public void setEmail( String email )
    {
        _email = email;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero( GeneroEnum genero )
    {
        _genero = genero;
    }

    /**
     * @param materno the materno to set
     */
    public void setMaterno( String materno )
    {
        _materno = materno;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre( String nombre )
    {
        _nombre = nombre;
    }

    /**
     * @param paterno the paterno to set
     */
    public void setPaterno( String paterno )
    {
        _paterno = paterno;
    }

    // *** Metodos *************************************************************

    /**
     * muestra en consla los atributos del objeto
     */
    public void show()
    {
        System.out.println( toString() );
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "UserDTO [_nombre=" + _nombre + ", _paterno=" + _paterno
                + ", _materno=" + _materno + ", _genero=" + _genero
                + ", _email=" + _email + "]";
    }

}

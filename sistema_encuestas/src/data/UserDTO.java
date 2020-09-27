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

    // Web -Estos son los que se ocupan en el registro-

    private int _id;

    private String _nombreUsuario;

    private String _pasword;

    private String _email;

    private String _lastSeassion;

    // Datos personales

    private String _nombre; // o nombres

    private String _paterno;

    private String _materno;

    private String _telefono;

    // Datos socioeconomicos

    private int _edad;

    private GeneroEnum _genero;

    private Escolaridad _escolaridad;

    private String _cuidad;

    private String _nacionalidad;

    private Escolaridad _escolariad;

    private String _ocupacion;

    private Ingresos _ingresos; // 100a1000, 1000a8000, +8000

    private int _personas_en_casa;

    /*
     * private String _nombre; // nombre o nombres del usuario private String
     * _paterno; // apellido paterno private String _materno; // apellido
     * materno private GeneroEnum _genero;
     */

    // *** Constructores *******************************************************

    /**
     * @param id
     * @param nombreUsuario
     * @param pasword
     * @param email
     * @param lastSeassion
     */
    public UserDTO( int id, String nombreUsuario, String pasword, String email,
            String lastSeassion )
    {
        super();
        _id = id;
        _nombreUsuario = nombreUsuario;
        _pasword = pasword;
        _email = email;
        _lastSeassion = lastSeassion;
    }

    // *** Seters y Getters ****************************************************

    /**
     * @return the cuidad
     */
    public String getCuidad()
    {
        return _cuidad;
    }

    /**
     * @return the edad
     */
    public int getEdad()
    {
        return _edad;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return _email;
    }

    /**
     * @return the escolariad
     */
    public Escolaridad getEscolariad()
    {
        return _escolariad;
    }

    /**
     * @return the escolaridad
     */
    public Escolaridad getEscolaridad()
    {
        return _escolaridad;
    }

    /**
     * @return the genero
     */
    public GeneroEnum getGenero()
    {
        return _genero;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return _id;
    }

    /**
     * @return the ingresos
     */
    public Ingresos getIngresos()
    {
        return _ingresos;
    }

    /**
     * @return the lastSeassion
     */
    public String getLastSeassion()
    {
        return _lastSeassion;
    }

    /**
     * @return the materno
     */
    public String getMaterno()
    {
        return _materno;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad()
    {
        return _nacionalidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return _nombre;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario()
    {
        return _nombreUsuario;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion()
    {
        return _ocupacion;
    }

    /**
     * @return the pasword
     */
    public String getPasword()
    {
        return _pasword;
    }

    /**
     * @return the paterno
     */
    public String getPaterno()
    {
        return _paterno;
    }

    /**
     * @return the personas_en_casa
     */
    public int getPersonas_en_casa()
    {
        return _personas_en_casa;
    }

    /**
     * @return the telefono
     */
    public String getTelefono()
    {
        return _telefono;
    }

    /**
     * @param cuidad the cuidad to set
     */
    public void setCuidad( String cuidad )
    {
        _cuidad = cuidad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad( int edad )
    {
        _edad = edad;
    }

    /**
     * @param email the email to set
     */
    public void setEmail( String email )
    {
        _email = email;
    }

    /**
     * @param escolariad the escolariad to set
     */
    public void setEscolariad( Escolaridad escolariad )
    {
        _escolariad = escolariad;
    }

    /**
     * @param escolaridad the escolaridad to set
     */
    public void setEscolaridad( Escolaridad escolaridad )
    {
        _escolaridad = escolaridad;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero( GeneroEnum genero )
    {
        _genero = genero;
    }

    /**
     * @param id the id to set
     */
    public void setId( int id )
    {
        _id = id;
    }

    /**
     * @param ingresos the ingresos to set
     */
    public void setIngresos( Ingresos ingresos )
    {
        _ingresos = ingresos;
    }

    /**
     * @param lastSeassion the lastSeassion to set
     */
    public void setLastSeassion( String lastSeassion )
    {
        _lastSeassion = lastSeassion;
    }

    /**
     * @param materno the materno to set
     */
    public void setMaterno( String materno )
    {
        _materno = materno;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad( String nacionalidad )
    {
        _nacionalidad = nacionalidad;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre( String nombre )
    {
        _nombre = nombre;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario( String nombreUsuario )
    {
        _nombreUsuario = nombreUsuario;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion( String ocupacion )
    {
        _ocupacion = ocupacion;
    }

    /**
     * @param pasword the pasword to set
     */
    public void setPasword( String pasword )
    {
        _pasword = pasword;
    }

    /**
     * @param paterno the paterno to set
     */
    public void setPaterno( String paterno )
    {
        _paterno = paterno;
    }

    /**
     * @param personas_en_casa the personas_en_casa to set
     */
    public void setPersonas_en_casa( int personas_en_casa )
    {
        _personas_en_casa = personas_en_casa;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono( String telefono )
    {
        _telefono = telefono;
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
        return "UserDTO [_id=" + _id + ", _nombreUsuario=" + _nombreUsuario
                + ", _pasword=" + _pasword + ", _email=" + _email
                + ", _lastSeassion=" + _lastSeassion + "]";
    }

}

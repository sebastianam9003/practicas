package tahures;

/**
 * Clase Cartas - Define que es una carta con 3 propiedades (Nombre, Palo y valor).
 * 
 * @author (Sebastián Asunción Montero) 
 * @version (2.0)
 * @date (28/09/2019)
 */
public class Cartas
{
    // Description of properties
    private String Nombre;  
    private String Palo;
    private int Valor;

    /**
     * Constructor for objects of class Cartas
     */
    public Cartas()
    {
        // initialise instance variables
        this.Nombre = "";
        this.Palo = "";
        this.Valor = 0;
    }

    /**
     * Description method.
     */
    public String toString()
    {
        // Devuelve una cadena con Nombre + literal + Palo
        return Nombre + " de " + Palo;
    }
    
    /**
     * Description method getter / setter.
     */
    public String getNombre()
    {
        return Nombre;
    }
    public String getPalo()
    {
        return Palo;
    }
    public int getValor()
    {
        return Valor;
    }
   
    public void setNombre(String _nombre)
    {
        this.Nombre = _nombre;
    }
    public void setPalo(String _palo)
    {
        this.Palo = _palo;
    }
    public void setValor(int _valor)
    {
        this.Valor = _valor;
    }
}



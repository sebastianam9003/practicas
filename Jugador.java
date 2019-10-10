package tahures;

/**
 * Clase Jugador define que cartas tiene un jugador.
 * 
 * @author (Sebastián Asunción Montero) 
 * @version (2.0)
 * @date (28/09/2019)
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Jugador
{
    // Define properties 
    private String Nombre;
    private ArrayList<Cartas> cartas;

    /**
     * Constructor de la clase Jugador
     */
    public Jugador(String _nombre)
    {
        this.Nombre = _nombre;
        this.cartas = new ArrayList<Cartas>();
    }

    /**
     * Definición de Metodos
     */
    public void darCarta(Cartas naipes)
    {
        cartas.add(naipes);
    }
    public Cartas retirar(int indice)
    {
        return cartas.remove(indice);
        //return cartas;
    }
    public String juego()
    {
        Iterator<Cartas> cartasIterator = cartas.iterator();
        String elemento = "[";

        while(cartasIterator.hasNext())
        {
            if (elemento.equals("["))
                {
                    elemento = elemento + cartasIterator.next();
                } else {
                        elemento = elemento + ", " +cartasIterator.next();
                       }
        }
        return elemento + "]";
    }
    
    /**
     * Define metodos getter / setter
     */
    public String getNombre()
    {
        return Nombre;
        
    }
    public void setNombre(String _nombre)
    {
        this.Nombre = _nombre;
    }
}


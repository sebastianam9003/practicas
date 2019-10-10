package tahures;
/**
 * Abstract class Baraja 
 * Defición de la clase abstracta Baraja.  Tiene un arraylist de Cartas.
 * 
 * @author: Sebastián Asunción Montero.
 * Versión: 2.0
 * Date: 30/09/2019
 */

import java.util.List;
import java.util.*;

public abstract class Baraja
{
    // Description of properties
    protected ArrayList<Cartas> cartas;
    
    /*
     * Constructor de la clase Baraja.
     */
    public Baraja()
    {
        this.cartas = new ArrayList<Cartas>();
    }
    
    /**
     * Definición de Metodos.
     */
    public void barajar()
    {
        Collections.shuffle(cartas);
    }
    
    public ArrayList<Cartas> repartir()
    {
        ArrayList<Cartas> cartaRepartida = new ArrayList<Cartas>();
        cartaRepartida.add(this.cartas.get(0));
        this.cartas.remove(0);
        return cartaRepartida;
    }
    
    public abstract void reiniciar();
}


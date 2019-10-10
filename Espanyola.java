package tahures;

/**
 * Write a description of class Espanyola here.
 * 
 * @author (Sebastián Asunción Montero) 
 * @version (2.0 - 30/09/2019)
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Espanyola extends Baraja
{
    // Description of properties
    private final int NUMERO_CARTAS = 40;

    /**
     * Constructor for objects of class Espanyola
     */
    public Espanyola()
    {
        super();
        reiniciar();
    }

    /**
     * Description method.
    */
    public void reiniciar()
    {
        //Miramos si nuestra Baraja esta llena.  Si es el caso, elimino las cartas.
        if (cartas != null)
            {
                cartas.clear();
            }
        
        //Defino los valores de la Baraja Espanyola.
        String Nombre[] = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
        String Palo[] = {"Espadas", "Bastos", "Oros", "Copas"};
        
        
        
        for (int cuentaPalo = 0; cuentaPalo < Palo.length; cuentaPalo++)
        {
            for (int cuentaNombre = 0; cuentaNombre < Nombre.length; cuentaNombre++)
            {
                 Cartas aux = new Cartas();
                 aux.setNombre(Nombre[cuentaNombre]);
                 aux.setPalo(Palo[cuentaPalo]);
                 aux.setValor(0);
                 cartas.add(aux);
            }
        }

    }
}


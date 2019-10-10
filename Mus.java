package tahures;

/**
 * Write a description of class MUS here.
 * 
 * @author (Sebastián Asunción Montero) 
 * @version (2.0 - 06/10/2019)
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Mus
{
    // Description of properties
    private Espanyola cartas;
    private ArrayList<Jugador> jugadores;

    /**
     * Constructor for objects of class Mus
     */
    public Mus()
    {
        this.cartas = new Espanyola();
        this.jugadores = new ArrayList<Jugador>();
    }

    /**
     * Description method.
    */
    public void addjugador(Jugador persona)
    {
        this.jugadores.add(persona);
    }
}


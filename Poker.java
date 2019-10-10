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

public class Poker
{
    // Description of properties
    private Francesa cartas;
    private ArrayList<Jugador> jugadores;

    /**
     * Constructor for objects of class Poker
     */
    public Poker()
    {
        this.cartas = new Francesa();
        this.jugadores = new ArrayList<Jugador>();
        System.out.println("Atención --> Hay menos de 3 jugadores de Poker.");
    }
    public Poker(ArrayList<Jugador> persona)
    {
        this.cartas = new Francesa();
        this.jugadores = new ArrayList<Jugador>();
        
        if (persona.size() < 3)
        {
            System.out.println("Atención --> Hay menos de 3 jugadores de Poker.");
            System.out.println("El número de jugadores son: " + persona.size());
        } else {
                for(int x=0;x<persona.size();x++)
                {
                  jugadores.add(persona.get(x));  
                }
               } 
        
    }

    /**
     * Description method.
    */
    public void addjugador(Jugador persona)
    {
        this.jugadores.add(persona);
    }
    
    public int getNjugadores()
    {
    	return jugadores.size();
    }
}


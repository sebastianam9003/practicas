/**
 * Consola con metodo main para jugar al Poker con 4 jugadores.
 * Ejercicio 4 - PLA2.   Sebastián Asunción Montero
 */

package tahures;

import java.util.Scanner;
import java.util.ArrayList;

public class MainPoker {
	public static ArrayList<Jugador> crearjugadores(int limite)
	{
		//Segun el parametro pasado crearemos n jugadores y pediremos sus nombre
		String[] listajugadores = new String[limite];
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Se solicitara el nombre de los jugadores.");
		int i = 0;
		for(int z=0; z<limite; z++)
		{
			i++;
			System.out.println("Introduccir el jugador Nº. " + i);
			listajugadores[z] = entrada.nextLine();
		}
		
		//for(int z=0; z<limite; z++)
		//{
		//	System.out.println("jugador Nº. " + z + " - " + listajugadores[z]);
		//}
		
		ArrayList<Jugador> apostadores = new ArrayList<Jugador>();
		
		Jugador jugador1 = new Jugador(listajugadores[0]);
						   apostadores.add(jugador1);
		Jugador jugador2 = new Jugador(listajugadores[1]);
						   apostadores.add(jugador2);
		Jugador jugador3 = new Jugador(listajugadores[2]);
						   apostadores.add(jugador3);
		if (limite == 4) {Jugador jugador4 = new Jugador(listajugadores[3]);
		   				   apostadores.add(jugador4);}
		if (limite == 5) {Jugador jugador5 = new Jugador(listajugadores[4]);
						   apostadores.add(jugador5);
		System.out.println("Jugador 5 es: " + jugador5.getNombre());}
		return apostadores;
	}
	
	
	public static void main(String[] args) {
		//Definición de los parametros básicos.
		Scanner entrada = new Scanner(System.in);
		
		int njugadores = 0;
		boolean salir = false;
		
		
		System.out.println("PRUEBA DE CREAR UNA BARAJA PARA JUGAR A POKER.\n");

		do{
			System.out.println("Introduzca el número de jugadores (entre 3 a 5): ");
			njugadores = entrada.nextInt();
			if (njugadores < 3 || njugadores > 5)
			{
				System.out.println("Error al introduccir el numero de jugadores.");
			} else {
					salir = true;
					}
		  }while(!salir);
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores = crearjugadores(njugadores);
		
		//Creamos la baraja de Poker y asociamos el arraylist de jugadores
		System.out.println("Creamos la baraja de Poker con sus jugadores (atención si hay menos de 3 jugadores)\n");
		Poker naipes = new Poker(jugadores);
		System.out.println("Creada la Baraja.");
		
		//Se creo en la clase Poker un getter para conocer el numero de jugadores de la baraja Poker.
		System.out.println("N. Jugadores de la baraja: " + naipes.getNjugadores());
		
	}

}

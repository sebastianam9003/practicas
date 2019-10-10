/**
 * Consola con metodo main para jugar al Mus con 4 jugadores.
 * Ejercicio 4 - PLA2.   Sebastián Asunción Montero
 */

package tahures;
import java.util.Scanner;


public class MainMus {

	public static void main(String[] args) {
		//Definición de los parametros básicos.
		Scanner entrada = new Scanner(System.in);
		String[] listajugadores = new String[4];
		
		System.out.println("PRUEBA DE CREAR UNA BARAJA PARA JUGAR A MUS.\n");
		System.out.println("Preparamos la baraja de Mus. ");
		
		//Definición de la baraja para Mus
		Mus naipes = new Mus();
		System.out.println("Creada la baraja de Mus. \n");
		
		//Creamos los 4 jugadores de Mus
		int i = 0;
		for(int z=0; z<4; z++)
		{
			i++;
			System.out.println("Introduccir el jugador Nº. " + i);
			listajugadores[z] = entrada.nextLine();
		}
		Jugador jugador1 = new Jugador(listajugadores[0]);
		Jugador jugador2 = new Jugador(listajugadores[1]);
		Jugador jugador3 = new Jugador(listajugadores[2]);
		Jugador jugador4 = new Jugador(listajugadores[3]);
		
		//Añadimos los jugadores a la baraja de Mus.
		naipes.addjugador(jugador1);
		naipes.addjugador(jugador2);
		naipes.addjugador(jugador3);
		naipes.addjugador(jugador4);

		System.out.println("Se añadieron los 4 jugadores a la baraja de Mus.");
		
		
		
	}

}

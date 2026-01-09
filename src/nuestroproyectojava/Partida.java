
package nuestroproyectojava;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Diccionario;
import modelo.Jugador;
import vista.Consola;

/**
 *
 * @author claudiaescuderomontoro
 */
public class Partida {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Consola consola = new Consola();
    private Diccionario dict = new Diccionario();
    
    public void registrarJugadores() { //se cambia de jugadores
        int cantidad = consola.pideInt("¿Cuántos jugadores sois?");
        for (int i = 0; i < cantidad; i++) {
            String nombre = consola.pideString("Nombre del jugador" + (i + 1));
            jugadores.add(new Jugador(nombre));
        }
    }
    
    public void jugarRonda(){ //en cada ronda, se mantienen los jugadores, pero no los roles
        int nImpostores = consola.pideInt("¿Cuántos impostores habrá?");
        String palabraSecreta = dict.obtenerPalabraAleatoria();
        
        Collections.shuffle(jugadores); //utilizamos este método par barajear
        /*for (int i = jugadores.size() - 1; i > 0; i--) {
            int j = azar.nextInt(i + 1);
            Jugador temp = jugadores.get(i);
            jugadores.set(i, jugadores.get(j));
            jugadores.set(j, temp);
    }   */
        jugadores.get(0).setRol("Arbitro");
        //los siguientes N son los impostores
        for (int i = 1; i <= nImpostores; i++) {
            jugadores.get(i).setRol("IMPOSTOR");
        }
        //el resto son civiles
        // El resto son Civiles
        for (int i = nImpostores + 1; i < jugadores.size(); i++) {
            jugadores.get(i).setRol("CIVIL");
        }
    }
    
}

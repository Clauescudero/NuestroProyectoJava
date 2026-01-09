
package modelo;

import java.util.Random; //se importa para sacar una palabra aleatoria del dic

/**
 *
 * @author claudiaescuderomontoro
 */
public class Diccionario {
    //creamos un array de Strings con las palabras del juego
    private String [] palabras = {"", "", };
    
    public String obtenerPalabraAleatoria(){
        return palabras[new Random().nextInt(palabras.length)];
    }
            
    
}

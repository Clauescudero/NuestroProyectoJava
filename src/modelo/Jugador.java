/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author claudiaescuderomontoro
 */
public class Jugador {
    private String nombre;
    private String rol; //Impostor, Civil o Árbitro
    
    public Jugador(String nombre){
        this.nombre = nombre;
        this.rol = null; 
        /* 
        El rol se asigna y va cambiado de estado. 
        Por defecto se pondrá null, que sería igual que no    
        ponerlo en el constructor
        */
        
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

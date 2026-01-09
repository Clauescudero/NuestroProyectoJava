
package vista;

import java.util.Scanner;

/**
 *
 * @author claudiaescuderomontoro
 */
public class Consola {
    private Scanner teclado  = new Scanner(System.in);
    
    public String pideString(String mensaje){
        System.out.print(mensaje + ": ");
        return teclado.nextLine();
    }
    
    public int pideInt(String mensaje){
        System.out.println(mensaje);
        return teclado.nextInt();
    }
    
    public void pausa(){
        System.out.println("\n Pulsa ENTER para continuar...");
        teclado.nextLine(); //coge el intro pulsado
    }
    //limpiar pantalla ?? visual = añadir mogollón de espacios
}

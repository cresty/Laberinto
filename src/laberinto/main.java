/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class main {
    
    public static void main(String[] args) {
    
        JuegoDelLaberinto main = new JuegoDelLaberinto();
        Laberinto lab = main.crearLaberinto1();
        Robot r1 = new Robot("cresty", lab.getInicial() );
        Robot r2 = new Robot("DarKWolF", lab.getInicial());
        while(true)
        {
            System.out.println("Turno de: "+r1.nombre);
            r1.Comportamiento();
            for (int i=0;i<r1.comportamiento.getTurnos();i++)
                r1.mover();
            System.out.println("Turno de: "+r2.nombre);
            r2.Comportamiento();
            for (int i=0;i<r2.comportamiento.getTurnos();i++)
                r2.mover();
        }
    
    }
    
}

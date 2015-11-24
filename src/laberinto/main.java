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
        Laberinto lab = main.crearLaberintoAbiertoCerrado();
        Laberinto fun = main.crearLaberintoUltimate();
        Robot r1 = new Robot("cresty", lab.getInicial() );
        Robot r2 = new Robot("DarKWolF", lab.getInicial());
        Robot r3 = new Robot("Earendur", fun.getInicial());
        boolean win = true;
        boolean win2 = false;
        while(!win)
        {
            if (!win)
            {
                if ((r1.comportamiento.getClass() != laberinto.DeadBehaviour.class))
                    System.out.println("Turno de: "+r1.nombre);
                r1.Comportamiento();
                for (int i=0;i<r1.comportamiento.getTurnos();i++)
                {
                    r1.mover();
                    win = r1.winStatus();
                }
            }
            if (!win)
            {
                if (r2.comportamiento.getClass() != laberinto.DeadBehaviour.class)
                    System.out.println("Turno de: "+r2.nombre);
                r2.Comportamiento();
                for (int i=0;i<r2.comportamiento.getTurnos();i++)
                {
                    r2.mover();
                    win = r2.winStatus();
                }
            }
        }
        while(!win2)
        {
            if (!win2)
            {
                if ((r3.comportamiento.getClass() != laberinto.DeadBehaviour.class))
                    System.out.println("Turno de: "+r3.nombre);
                r3.Comportamiento();
                for (int i=0;i<r3.comportamiento.getTurnos();i++)
                {
                    r3.mover();
                    win2 = r3.winStatus();
                }
            }
        }
    }
}

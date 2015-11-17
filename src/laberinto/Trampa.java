/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class Trampa implements LugarDelMapa {
    
    boolean activa;
    public Trampa () 
    {
        activa = true;
    }
    @Override
    public void Entrar(Robot robot) 
    {
        if (activa)
        {
            System.out.println("Encuentras una Trampa. "+robot.nombre+" pierde 1 punto de vida.");
            robot.getHit();
            this.activa = false;
        }
        else
            System.out.println("Aqui habia una trampa pero ya esta desactivada.");
    }
    
}

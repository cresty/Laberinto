/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class ParedLlave implements LugarDelMapa{
    boolean active = true;
    public void Entrar(Robot robot) 
    {
        if (active)
        {
            robot.addKey();
            this.active = false;
            System.out.println("Encuentras una Pared con una llave Colgada, tienes "+robot.llave+" llaves.");
        }
        else
            System.out.println("Ya has cogido la llave de esta pared.");
    }
}

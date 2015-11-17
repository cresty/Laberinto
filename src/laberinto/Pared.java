/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class Pared implements LugarDelMapa {
    boolean hasKey;
    public Pared (boolean key) 
    {
        hasKey = key;
    }
    @Override
    public void Entrar(Robot robot) 
    {
        if (hasKey)
        {
            robot.addKey();
            this.hasKey = false;
            System.out.println("Encuentras una Pared con una llave Colgada, tienes "+robot.llave+" llaves.");
        }
        else
            System.out.println("Encuentras una Pared.");
    }
    
}

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
    public Pared () {}
    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Encuentras una Pared.");
    }
    
}

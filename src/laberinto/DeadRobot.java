/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class DeadRobot extends Robot{
    
    public DeadRobot()
    {
        comportamiento = new DeadBehaviour();
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class HabitacionOscura extends Habitacion{
    
    public HabitacionOscura(int numHabitacion) {
        super(numHabitacion);
    }
    
    public LugarDelMapa obtenerLado()
    {
        int randomNum = (int)(Math.random() * 4);
        return lados[randomNum];
    }
    
    public void Entrar(Robot robot)
    {
        System.out.println("Estas en una Habitacion Oscura!!! No ves hacia donde te diriges!!!!");
    }
    
}

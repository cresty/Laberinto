/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class DeadBehaviour implements Behaviour{
    private int turnos;
    private String humor;
    
    @Override
    public void mode ()
    {
        turnos = 0;
    }
    
    @Override
    public void respuesta()
    {
        humor = "El personaje esta muerto.";
    }
    @Override
    public String getHumor()
    {
        return humor;
    }
    @Override
    public int getTurnos()
    {
        return turnos;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class HurtBehaviour implements Behaviour{
    private int turnos;
    private String humor;
    
    @Override
    public void mode ()
    {
        turnos = 1;
    }
    
    @Override
    public void respuesta()
    {
        humor = "El personaje esta herido y debilitado.";
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

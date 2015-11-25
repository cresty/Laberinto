/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class NormalBehaviour implements Behaviour{
    private int turnos;
    private String humor;
    
    @Override
    public void mode ()
    {
        turnos = 2;
    }
    
    @Override
    public void respuesta()
    {
        humor = "El personaje esta saludable.";
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

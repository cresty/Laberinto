/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author Apuestas
 */
public class WinBehaviour implements Behaviour{
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
        humor = "El personaje HA GANADO!!!.";
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

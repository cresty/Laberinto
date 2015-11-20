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
public class HabitacionCongelada extends Habitacion{

    public HabitacionCongelada(int numHabitacion) {
        super(numHabitacion);
    }
    
    public LugarDelMapa obtenerLado()
    {
        int randomNum = (int)(Math.random() * 4);
        return lados[randomNum];
    }
    
    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Estas en una Habitacion Congelada!!! Te Resbalas!!!!");
    }
}

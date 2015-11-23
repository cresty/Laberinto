/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import static laberinto.Habitacion.NUMLADOS;

/**
 *
 * @author Apuestas
 */
public class HabitacionCongelada extends Habitacion{

    public HabitacionCongelada(int numHabitacion, LugarDelMapa pasaje1) {
        super(numHabitacion);
        pasaje = pasaje1;
    }
    
    LugarDelMapa pasaje;
    
    public LugarDelMapa obtenerLado()
    {
        //int randomNum = (int)(Math.random() * 4);
        return pasaje;
    }
    
    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Estas en una Habitacion Congelada!!! Te Resbalas!!!!");
        lados[0].Entrar(robot);
    }
}

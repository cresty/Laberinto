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

    int lado;
    
    public HabitacionCongelada(int numHabitacion, int l) {
        super(numHabitacion);
        lado = l;
    }
    
    public LugarDelMapa obtenerLado()
    {
        return lados[lado];
    }
    
    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Estas en una Habitacion Congelada!!! Te Resbalas!!!!");
        lados[lado].Entrar(robot);
        
    }
}

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
public class HabitacionWin extends Habitacion{

    public HabitacionWin(int numHabitacion) {
        super(numHabitacion);
    }
    
    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Esta es la habitacion ganadora!!");
        robot.comportamiento = new WinBehaviour();
    }
    
}

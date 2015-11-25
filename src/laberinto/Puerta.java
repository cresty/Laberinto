/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class Puerta implements LugarDelMapa {
    private Habitacion habitacion;
    private boolean estaAbierta;
    
    public Puerta(Habitacion hab, boolean abierta)
    {
        habitacion = hab;
        estaAbierta = abierta;
    }
    @Override
    public void Entrar(Robot robot) 
    {
        if (estaAbierta)
        {
            System.out.println("El robot "+robot.nombre+" ha pasado de la habitacion "+robot.room.obtenerNumero()+" a la habitacion "+habitacion.obtenerNumero());
            robot.changeRoom(habitacion);
        }
        else
        {
            if (robot.llave == 0)
                System.out.println("La puerta esta cerrada. No tienes llaves");
            else
            {
                System.out.println("Has abierto la puerta");
                robot.substractKey();
                this.estaAbierta = true;
                Entrar(robot);
            }
        }
    }
    
}

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
    private Habitacion habitacion1;
    private Habitacion habitacion2;
    private boolean estaAbierta;
    
    public Puerta(Habitacion hab1, Habitacion hab2, boolean abierta)
    {
        habitacion1 = hab1;
        habitacion2 = hab2;
        estaAbierta = abierta;
    }
    @Override
    public void Entrar(Robot robot) 
    {
        if (estaAbierta)
        {
            System.out.println("El robot "+robot.nombre+" ha pasado de la habitacion "+habitacion1.obtenerNumero()+" a la habitacion "+habitacion2.obtenerNumero());
            robot.changeRoom(habitacion2);
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

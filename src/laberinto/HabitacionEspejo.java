/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class HabitacionEspejo extends Habitacion{
    
    public HabitacionEspejo(int numHabitacion) {
        super(numHabitacion);
    }
    
    @Override
    public int obtenerDireccion(Direccion dir)
    {
        switch(dir)
        {
            case NORTE: return 1;
            case SUR: return 0;
            case ESTE: return 3;
            case OESTE: return 2;
            default:
                break;
        }
        return 0;
    }
    
    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Estas en la Habitacion de los Espejos!! Te cuesta orientarte =/");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class Laberinto {
// ....
    private final LugarDelMapa room[] = new Habitacion[100];
    public final void anadirHabitacion(Habitacion habitacion) 
    {
        room[habitacion.obtenerNumero()] = habitacion;
    }
    public final Habitacion numeroDeHabitacion(int numero) 
    {
        return (Habitacion)room[numero];
    }
    public final Habitacion getInicial()
    {
        return (Habitacion)room[1];
    }
    
}

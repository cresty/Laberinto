/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class Habitacion implements LugarDelMapa 
{
    public static final int NUMLADOS = 4;
    private int numeroHabitacion;
    private final LugarDelMapa lados[] = new LugarDelMapa[NUMLADOS];
    public Habitacion(int numHabitacion) 
    {
        numeroHabitacion = numHabitacion;
    }
    
    public final int obtenerNumero()
    {
        return numeroHabitacion;
    }
    
    public final LugarDelMapa obtenerLado(int a)
    {
        //int a = obtenerDireccion(direccion);
        return lados[a];
    }
    public final void establecerLado(Direccion direccion, LugarDelMapa lugarDelMapa) 
    {
        int a = obtenerDireccion(direccion);
        lados[a] = lugarDelMapa;
    }
    
    public final int obtenerDireccion(Direccion dir)
    {
        switch(dir)
        {
            case NORTE: return 0;
            case SUR: return 1;
            case ESTE: return 2;
            case OESTE: return 3;
            default:
                break;
        }
        return 0;
    }

    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Estas en la Habitacion "+numeroHabitacion);
    }
    
    
}

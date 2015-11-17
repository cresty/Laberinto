/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author cresty
 */
public class JuegoDelLaberinto {
    
    public Habitacion fabricarHabitacion(int n) 
    {
        return new Habitacion(n);
    }
    
    public Pared fabricarPared(boolean key)
    {
        return new Pared(key);
    }
    
    public Trampa fabricarTrampa()
    {
        return new Trampa();
    }
    
    public Puerta fabricarPuerta(Habitacion h1, Habitacion h2, boolean estaAbierta) 
    {
        return new Puerta(h1, h2, estaAbierta);
    }
    
    public Laberinto fabricarLaberinto() 
    {
        return new Laberinto();
    }
    
    public final Laberinto crearLaberinto1() 
    {
        Laberinto unLaberinto = fabricarLaberinto();
        Habitacion h1 = fabricarHabitacion(1);
        Habitacion h2 = fabricarHabitacion(2);
        Habitacion h3 = fabricarHabitacion(3);
        Habitacion h4 = fabricarHabitacion(4);
        Habitacion h5 = fabricarHabitacion(5);
        Habitacion h6 = fabricarHabitacion(6);
        Habitacion h7 = fabricarHabitacion(7);
        Habitacion h8 = fabricarHabitacion(8);
        Habitacion h9 = fabricarHabitacion(9);
        unLaberinto.anadirHabitacion(h1);
        unLaberinto.anadirHabitacion(h2);
        unLaberinto.anadirHabitacion(h3);
        unLaberinto.anadirHabitacion(h4);
        unLaberinto.anadirHabitacion(h5);
        unLaberinto.anadirHabitacion(h6);
        unLaberinto.anadirHabitacion(h7);
        unLaberinto.anadirHabitacion(h8);
        unLaberinto.anadirHabitacion(h9);
        Puerta puerta12 = fabricarPuerta(h1, h2, true);
        Puerta puerta25 = fabricarPuerta(h2, h5, true);
        Puerta puerta36 = fabricarPuerta(h3, h6, true);
        Puerta puerta56 = fabricarPuerta(h5, h6, true);
        Puerta puerta58 = fabricarPuerta(h5, h8, true);
        Puerta puerta69 = fabricarPuerta(h6, h9, true);
        Puerta puerta78 = fabricarPuerta(h7, h8, true);
        
        h1.establecerLado(Direccion.NORTE, fabricarTrampa());
        h1.establecerLado(Direccion.SUR, fabricarPared(true));
        h1.establecerLado(Direccion.ESTE, puerta12);
        h1.establecerLado(Direccion.OESTE, fabricarPared(false));
        
        h2.establecerLado(Direccion.NORTE, puerta25);
        h2.establecerLado(Direccion.SUR, fabricarTrampa());
        h2.establecerLado(Direccion.ESTE, fabricarTrampa());
        h2.establecerLado(Direccion.OESTE, puerta12);
        
        h3.establecerLado(Direccion.NORTE, puerta36);
        h3.establecerLado(Direccion.SUR, fabricarPared(false));
        h3.establecerLado(Direccion.ESTE, fabricarPared(false));
        h3.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h4.establecerLado(Direccion.NORTE, fabricarTrampa());
        h4.establecerLado(Direccion.SUR, fabricarTrampa());
        h4.establecerLado(Direccion.ESTE, fabricarTrampa());
        h4.establecerLado(Direccion.OESTE, fabricarPared(true));

        h5.establecerLado(Direccion.NORTE, puerta58);
        h5.establecerLado(Direccion.SUR, puerta25);
        h5.establecerLado(Direccion.ESTE, puerta56);
        h5.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h6.establecerLado(Direccion.NORTE, puerta69);
        h6.establecerLado(Direccion.SUR, puerta36);
        h6.establecerLado(Direccion.ESTE, fabricarTrampa());
        h6.establecerLado(Direccion.OESTE, puerta56);
        
        h7.establecerLado(Direccion.NORTE, fabricarPared(false));
        h7.establecerLado(Direccion.SUR, fabricarPared(false));
        h7.establecerLado(Direccion.ESTE, puerta78);
        h7.establecerLado(Direccion.OESTE, fabricarPared(true));
        
        h8.establecerLado(Direccion.NORTE, fabricarPared(false));
        h8.establecerLado(Direccion.SUR, puerta58);
        h8.establecerLado(Direccion.ESTE, fabricarTrampa());
        h8.establecerLado(Direccion.OESTE, puerta78);
        
        h9.establecerLado(Direccion.NORTE, fabricarPared(false));
        h9.establecerLado(Direccion.SUR, puerta69);
        h9.establecerLado(Direccion.ESTE, fabricarPared(false));
        h9.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        return unLaberinto;
    }
    
    public final Laberinto crearLaberinto2()
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        return unLaberinto;
    }

}

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
    
    public Habitacion fabricarHabitacion(int n, boolean win) 
    {
        return new Habitacion(n, win);
    }
    
    public Pared fabricarPared(int key)
    {
        if (key == 0)
            return new Pared(false);
        if (key == 1)
            return new Pared(true);
        else
            return null;
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
        Habitacion h1 = fabricarHabitacion(1,false);
        Habitacion h2 = fabricarHabitacion(2,false);
        Habitacion h3 = fabricarHabitacion(3,false);
        Habitacion h4 = fabricarHabitacion(4,true);
        Habitacion h5 = fabricarHabitacion(5,false);
        Habitacion h6 = fabricarHabitacion(6,false);
        Habitacion h7 = fabricarHabitacion(7,false);
        Habitacion h8 = fabricarHabitacion(8,false);
        Habitacion h9 = fabricarHabitacion(9,false);
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
        Puerta puerta21 = fabricarPuerta(h2, h1, true);
        Puerta puerta25 = fabricarPuerta(h2, h5, true);
        Puerta puerta52 = fabricarPuerta(h5, h2, true);
        Puerta puerta36 = fabricarPuerta(h3, h6, true);
        Puerta puerta63 = fabricarPuerta(h6, h3, true);
        Puerta puerta56 = fabricarPuerta(h5, h6, true);
        Puerta puerta65 = fabricarPuerta(h6, h5, true);
        Puerta puerta58 = fabricarPuerta(h5, h8, true);
        Puerta puerta85 = fabricarPuerta(h8, h5, true);
        Puerta puerta78 = fabricarPuerta(h7, h8, true);
        Puerta puerta87 = fabricarPuerta(h8, h7, true);
        Puerta puerta74 = fabricarPuerta(h7, h4, false);
        Puerta puerta47 = fabricarPuerta(h4, h7, false);
        Puerta puerta89 = fabricarPuerta(h8, h9, true);
        Puerta puerta98 = fabricarPuerta(h9, h8, true);
        
        h1.establecerLado(Direccion.NORTE, fabricarPared(0));
        h1.establecerLado(Direccion.SUR, fabricarPared(0));
        h1.establecerLado(Direccion.ESTE, puerta12);
        h1.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h2.establecerLado(Direccion.NORTE, puerta25);
        h2.establecerLado(Direccion.SUR, fabricarTrampa());
        h2.establecerLado(Direccion.ESTE, fabricarPared(0));
        h2.establecerLado(Direccion.OESTE, puerta21);
        
        h3.establecerLado(Direccion.NORTE, puerta36);
        h3.establecerLado(Direccion.SUR, fabricarPared(1));
        h3.establecerLado(Direccion.ESTE, fabricarTrampa());
        h3.establecerLado(Direccion.OESTE, fabricarPared(0));
        
        h4.establecerLado(Direccion.NORTE, puerta47);
        h4.establecerLado(Direccion.SUR, fabricarPared(0));
        h4.establecerLado(Direccion.ESTE, fabricarPared(0));
        h4.establecerLado(Direccion.OESTE, fabricarPared(0));

        h5.establecerLado(Direccion.NORTE, puerta58);
        h5.establecerLado(Direccion.SUR, puerta52);
        h5.establecerLado(Direccion.ESTE, puerta56);
        h5.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h6.establecerLado(Direccion.NORTE, fabricarTrampa());
        h6.establecerLado(Direccion.SUR, puerta63);
        h6.establecerLado(Direccion.ESTE, fabricarPared(0));
        h6.establecerLado(Direccion.OESTE, puerta65);
        
        h7.establecerLado(Direccion.NORTE, fabricarPared(0));
        h7.establecerLado(Direccion.SUR, puerta74);
        h7.establecerLado(Direccion.ESTE, puerta78);
        h7.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h8.establecerLado(Direccion.NORTE, fabricarTrampa());
        h8.establecerLado(Direccion.SUR, puerta85);
        h8.establecerLado(Direccion.ESTE, puerta89);
        h8.establecerLado(Direccion.OESTE, puerta87);
        
        h9.establecerLado(Direccion.NORTE, fabricarPared(0));
        h9.establecerLado(Direccion.SUR, fabricarPared(0));
        h9.establecerLado(Direccion.ESTE, fabricarPared(0));
        h9.establecerLado(Direccion.OESTE,puerta98);
        
        return unLaberinto;
    }
    
    public final Laberinto crearLaberinto2()
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        return unLaberinto;
    }

}

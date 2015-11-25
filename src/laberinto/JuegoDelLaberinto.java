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
    
    public Habitacion fabricarHabitacionWin(int n) 
    {
        return new HabitacionWin(n);
    }
    
    public Habitacion fabricarHabitacionCongelada(int n, int m) 
    {
        return new HabitacionCongelada(n,m);
    }
    
    public Habitacion fabricarHabitacionOscura(int n) 
    {
        return new HabitacionOscura(n);
    }
    
    public Habitacion fabricarHabitacionEspejo(int n) 
    {
        return new HabitacionEspejo(n);
    }
    
    public Pared fabricarPared()
    {
            return new Pared();
    }
    
    public ParedLlave fabricarParedConLlave()
    {
        return new ParedLlave();
    }
    
    public Trampa fabricarTrampa()
    {
        return new Trampa();
    }
    
    public Puerta fabricarPuerta(Habitacion h, boolean estaAbierta) 
    {
        return new Puerta(h, estaAbierta);
    }
    
    public Laberinto fabricarLaberinto() 
    {
        return new Laberinto();
    }
    
    public final Laberinto crearLaberintoUltimate()
    {
        Laberinto ultimate = fabricarLaberinto();
        
        Habitacion h1 = fabricarHabitacion(1);
        Habitacion h20 = fabricarHabitacionCongelada(2,0);
        Habitacion h21 = fabricarHabitacionCongelada(2,1);
        Habitacion h22 = fabricarHabitacionCongelada(2,2);
        Habitacion h23 = fabricarHabitacionCongelada(2,3);
        Habitacion h3 = fabricarHabitacionEspejo(3);      
        Habitacion h4 = fabricarHabitacion(4);
        Habitacion h5 = fabricarHabitacion(5);
        Habitacion h6 = fabricarHabitacionOscura(6);
        Habitacion h7 = fabricarHabitacion(7);
        Habitacion h80 = fabricarHabitacionCongelada(8,0);
        Habitacion h81 = fabricarHabitacionCongelada(8,1);
        Habitacion h82 = fabricarHabitacionCongelada(8,2);
        Habitacion h83 = fabricarHabitacionCongelada(8,3);
        Habitacion h90 = fabricarHabitacionCongelada(9,0);
        Habitacion h91 = fabricarHabitacionCongelada(9,1);
        Habitacion h92 = fabricarHabitacionCongelada(9,2);
        Habitacion h93 = fabricarHabitacionCongelada(9,3);
        Habitacion h10 = fabricarHabitacionOscura(10);
        Habitacion h11 = fabricarHabitacionWin(11);
        Habitacion h12 = fabricarHabitacionEspejo(12);
        Habitacion h13 = fabricarHabitacion(13);
        Habitacion h14 = fabricarHabitacionEspejo(14);
        Habitacion h15 = fabricarHabitacionOscura(15);
        Habitacion h16 = fabricarHabitacion(16);
        
        ultimate.anadirHabitacion(h1);
        ultimate.anadirHabitacion(h20);
        ultimate.anadirHabitacion(h21);
        ultimate.anadirHabitacion(h22);
        ultimate.anadirHabitacion(h23);
        ultimate.anadirHabitacion(h3);
        ultimate.anadirHabitacion(h4);
        ultimate.anadirHabitacion(h5);
        ultimate.anadirHabitacion(h6);
        ultimate.anadirHabitacion(h7);
        ultimate.anadirHabitacion(h80);
        ultimate.anadirHabitacion(h81);
        ultimate.anadirHabitacion(h82);
        ultimate.anadirHabitacion(h83);
        ultimate.anadirHabitacion(h90);
        ultimate.anadirHabitacion(h91);
        ultimate.anadirHabitacion(h92);
        ultimate.anadirHabitacion(h93);
        ultimate.anadirHabitacion(h10);
        ultimate.anadirHabitacion(h11);
        ultimate.anadirHabitacion(h12);
        ultimate.anadirHabitacion(h13);
        ultimate.anadirHabitacion(h14);
        ultimate.anadirHabitacion(h15);
        ultimate.anadirHabitacion(h16);
        
        Puerta puerta1 = fabricarPuerta(h1, true);
        Puerta puerta20 = fabricarPuerta(h20,true);
        Puerta puerta21 = fabricarPuerta(h21,true);
        Puerta puerta22 = fabricarPuerta(h22,true);
        Puerta puerta23 = fabricarPuerta(h23,true);
        Puerta puerta3 = fabricarPuerta(h3,true);
        Puerta puerta4 = fabricarPuerta(h4,true);
        Puerta puerta5 = fabricarPuerta(h5,true);
        Puerta puerta6 = fabricarPuerta(h6,true);
        Puerta puerta7 = fabricarPuerta(h7,true);
        Puerta puerta80 = fabricarPuerta(h80,true);
        Puerta puerta81 = fabricarPuerta(h81,true);
        Puerta puerta82 = fabricarPuerta(h82,true);
        Puerta puerta83 = fabricarPuerta(h83,true);
        Puerta puerta90 = fabricarPuerta(h90,true);
        Puerta puerta91 = fabricarPuerta(h91,true);
        Puerta puerta92 = fabricarPuerta(h92,true);
        Puerta puerta93 = fabricarPuerta(h93,true);
        Puerta puerta10 = fabricarPuerta(h10,true);
        Puerta puerta11 = fabricarPuerta(h11,false);
        Puerta puerta12 = fabricarPuerta(h12,true);
        Puerta puerta13 = fabricarPuerta(h13,true);
        Puerta puerta14 = fabricarPuerta(h14,true);
        Puerta puerta15 = fabricarPuerta(h15,true);
        Puerta puerta16 = fabricarPuerta(h16,true);
        
        h1.establecerLado(Direccion.NORTE, puerta5);
        h1.establecerLado(Direccion.SUR, puerta13);
        h1.establecerLado(Direccion.ESTE, puerta22);
        h1.establecerLado(Direccion.OESTE, puerta14);
        
        h20.establecerLado(Direccion.NORTE, puerta6);
        h21.establecerLado(Direccion.SUR, puerta14);
        h22.establecerLado(Direccion.ESTE, puerta3);
        h23.establecerLado(Direccion.OESTE, puerta1);
        
        h3.establecerLado(Direccion.NORTE, puerta7);
        h3.establecerLado(Direccion.SUR, puerta15);
        h3.establecerLado(Direccion.ESTE, puerta4);
        h3.establecerLado(Direccion.OESTE, puerta23);
        
        h4.establecerLado(Direccion.NORTE, puerta80);
        h4.establecerLado(Direccion.SUR, fabricarParedConLlave());
        h4.establecerLado(Direccion.ESTE, puerta1);
        h4.establecerLado(Direccion.OESTE, puerta3);
        
        h5.establecerLado(Direccion.NORTE, puerta90);
        h5.establecerLado(Direccion.SUR, puerta1);
        h5.establecerLado(Direccion.ESTE, puerta6);
        h5.establecerLado(Direccion.OESTE, puerta83);
        
        h6.establecerLado(Direccion.NORTE, puerta10);
        h6.establecerLado(Direccion.SUR, puerta21);
        h6.establecerLado(Direccion.ESTE, puerta7);
        h6.establecerLado(Direccion.OESTE, puerta5);
        
        h7.establecerLado(Direccion.NORTE, puerta11);
        h7.establecerLado(Direccion.SUR, puerta3);
        h7.establecerLado(Direccion.ESTE, puerta82);
        h7.establecerLado(Direccion.OESTE, puerta6);
        
        h80.establecerLado(Direccion.NORTE, puerta12);
        h81.establecerLado(Direccion.SUR, puerta4);
        h82.establecerLado(Direccion.ESTE, puerta5);
        h83.establecerLado(Direccion.OESTE, puerta7);
        
        h90.establecerLado(Direccion.NORTE, puerta13);
        h91.establecerLado(Direccion.SUR, puerta5);
        h92.establecerLado(Direccion.ESTE, puerta10);
        h93.establecerLado(Direccion.OESTE, puerta12);
        
        h10.establecerLado(Direccion.NORTE, puerta14);
        h10.establecerLado(Direccion.SUR, puerta6);
        h10.establecerLado(Direccion.ESTE, puerta11);
        h10.establecerLado(Direccion.OESTE, puerta93);
        
        h12.establecerLado(Direccion.NORTE, puerta16);
        h12.establecerLado(Direccion.SUR, puerta81);
        h12.establecerLado(Direccion.ESTE, puerta92);
        h12.establecerLado(Direccion.OESTE, puerta11);
        
        h13.establecerLado(Direccion.NORTE, puerta1);
        h13.establecerLado(Direccion.SUR, puerta91);
        h13.establecerLado(Direccion.ESTE, puerta14);
        h13.establecerLado(Direccion.OESTE, puerta16);
        
        h14.establecerLado(Direccion.NORTE, puerta20);
        h14.establecerLado(Direccion.SUR, puerta10);
        h14.establecerLado(Direccion.ESTE, puerta15);
        h14.establecerLado(Direccion.OESTE, puerta13);
        
        h15.establecerLado(Direccion.NORTE, puerta3);
        h15.establecerLado(Direccion.SUR, puerta11);
        h15.establecerLado(Direccion.ESTE, puerta16);
        h15.establecerLado(Direccion.OESTE, puerta14);
        
        h16.establecerLado(Direccion.NORTE, fabricarPared());
        h16.establecerLado(Direccion.SUR, puerta12);
        h16.establecerLado(Direccion.ESTE, puerta13);
        h16.establecerLado(Direccion.OESTE, puerta15);
        
        return ultimate;
    }
    
    public final Laberinto crearLaberintoAbiertoCerrado() 
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        Habitacion h1 = fabricarHabitacion(1);
        Habitacion h2 = fabricarHabitacion(2);
        Habitacion h3 = fabricarHabitacion(3);      
        Habitacion h4 = fabricarHabitacionWin(4);
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
        
        Puerta puerta1 = fabricarPuerta(h1, true);
        Puerta puerta2 = fabricarPuerta(h2, true);
        Puerta puerta3 = fabricarPuerta(h3, true);
        Puerta puerta4 = fabricarPuerta(h4, false);
        Puerta puerta5 = fabricarPuerta(h5, true);
        Puerta puerta6 = fabricarPuerta(h6, true);
        Puerta puerta7 = fabricarPuerta(h7, true);
        Puerta puerta8 = fabricarPuerta(h8, true);
        Puerta puerta9 = fabricarPuerta(h9, true);
        
        h1.establecerLado(Direccion.NORTE, fabricarPared());
        h1.establecerLado(Direccion.SUR, fabricarPared());
        h1.establecerLado(Direccion.ESTE, puerta2);
        h1.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h2.establecerLado(Direccion.NORTE, puerta5);
        h2.establecerLado(Direccion.SUR, fabricarTrampa());
        h2.establecerLado(Direccion.ESTE, fabricarTrampa());
        h2.establecerLado(Direccion.OESTE, puerta1);
        
        h3.establecerLado(Direccion.NORTE, puerta6);
        h3.establecerLado(Direccion.SUR, fabricarParedConLlave());
        h3.establecerLado(Direccion.ESTE, fabricarTrampa());
        h3.establecerLado(Direccion.OESTE, fabricarPared());
        
        h4.establecerLado(Direccion.NORTE, puerta7);
        h4.establecerLado(Direccion.SUR, fabricarTrampa());
        h4.establecerLado(Direccion.ESTE, fabricarPared());
        h4.establecerLado(Direccion.OESTE, fabricarTrampa());

        h5.establecerLado(Direccion.NORTE, puerta8);
        h5.establecerLado(Direccion.SUR, puerta2);
        h5.establecerLado(Direccion.ESTE, puerta6);
        h5.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h6.establecerLado(Direccion.NORTE, fabricarTrampa());
        h6.establecerLado(Direccion.SUR, puerta3);
        h6.establecerLado(Direccion.ESTE, fabricarTrampa());
        h6.establecerLado(Direccion.OESTE, puerta5);
        
        h7.establecerLado(Direccion.NORTE, fabricarTrampa());
        h7.establecerLado(Direccion.SUR, puerta4);
        h7.establecerLado(Direccion.ESTE, puerta8);
        h7.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h8.establecerLado(Direccion.NORTE, fabricarTrampa());
        h8.establecerLado(Direccion.SUR, puerta5);
        h8.establecerLado(Direccion.ESTE, puerta9);
        h8.establecerLado(Direccion.OESTE, puerta7);
        
        h9.establecerLado(Direccion.NORTE, fabricarTrampa());
        h9.establecerLado(Direccion.SUR, fabricarPared());
        h9.establecerLado(Direccion.ESTE, fabricarTrampa());
        h9.establecerLado(Direccion.OESTE,puerta8);
        
        return unLaberinto;
    }
    
    public final Laberinto crearLaberinto2()
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        return unLaberinto;
    }

}

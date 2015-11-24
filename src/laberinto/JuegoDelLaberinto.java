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
    
    public Puerta fabricarPuerta(Habitacion h1, Habitacion h2, boolean estaAbierta) 
    {
        return new Puerta(h1, h2, estaAbierta);
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
        
        Puerta puerta12 = fabricarPuerta(h1, h22, true);
        Puerta puerta15 = fabricarPuerta(h1, h5, true);
        Puerta puerta113 = fabricarPuerta(h1, h13, true);
        Puerta puerta14 = fabricarPuerta(h1, h4, true);
        
        Puerta puerta21 = fabricarPuerta(h23, h1, true);
        Puerta puerta26 = fabricarPuerta(h20, h6, true);
        Puerta puerta23 = fabricarPuerta(h22, h3, true);
        Puerta puerta214 = fabricarPuerta(h21, h14, true);
        
        Puerta puerta32 = fabricarPuerta(h3, h23, true);
        Puerta puerta37 = fabricarPuerta(h3, h7, true);
        Puerta puerta34 = fabricarPuerta(h3, h4, true);
        Puerta puerta315 = fabricarPuerta(h3, h15, true);
        
        Puerta puerta48 = fabricarPuerta(h4, h80, true);
        Puerta puerta43 = fabricarPuerta(h4, h3, true);
        Puerta puerta41 = fabricarPuerta(h4, h1, true);
        
        Puerta puerta58 = fabricarPuerta(h5, h83, true);
        Puerta puerta56 = fabricarPuerta(h5, h6, true);
        Puerta puerta59 = fabricarPuerta(h5, h90, true);
        Puerta puerta51 = fabricarPuerta(h5, h1, true);
        
        Puerta puerta610 = fabricarPuerta(h6, h10, true);
        Puerta puerta65 = fabricarPuerta(h6, h5, true);
        Puerta puerta62 = fabricarPuerta(h6, h21, true);
        Puerta puerta67 = fabricarPuerta(h6, h7, true);
        
        Puerta puerta73 = fabricarPuerta(h7, h3, true);
        Puerta puerta76 = fabricarPuerta(h7, h6, true);
        Puerta puerta78 = fabricarPuerta(h7, h82, true);
        Puerta puerta711 = fabricarPuerta(h7, h11, false);
        
        Puerta puerta84 = fabricarPuerta(h81, h4, true);
        Puerta puerta85 = fabricarPuerta(h82, h5, true);
        Puerta puerta87 = fabricarPuerta(h83, h7, true);
        Puerta puerta812 = fabricarPuerta(h80, h12, true);
        
        Puerta puerta95 = fabricarPuerta(h91, h5, true);
        Puerta puerta910 = fabricarPuerta(h92, h10, true);
        Puerta puerta912 = fabricarPuerta(h93, h12, true);
        Puerta puerta913 = fabricarPuerta(h90, h13, true);
        
        Puerta puerta106 = fabricarPuerta(h10, h6, true);
        Puerta puerta109 = fabricarPuerta(h10, h93, true);
        Puerta puerta1011 = fabricarPuerta(h10, h11, false);
        Puerta puerta1014 = fabricarPuerta(h10, h14, true);
        
        Puerta puerta128 = fabricarPuerta(h12, h81, true);
        Puerta puerta129 = fabricarPuerta(h12, h92, true);
        Puerta puerta1211 = fabricarPuerta(h12, h11, false);
        Puerta puerta1216 = fabricarPuerta(h12, h16, true);
        
        Puerta puerta131 = fabricarPuerta(h13, h1, true);
        Puerta puerta139 = fabricarPuerta(h13, h91, true);
        Puerta puerta1314 = fabricarPuerta(h13, h14, true);
        Puerta puerta1316 = fabricarPuerta(h13, h16, true);
        
        Puerta puerta142 = fabricarPuerta(h14, h20, true);
        Puerta puerta1410 = fabricarPuerta(h14, h10, true);
        Puerta puerta1413 = fabricarPuerta(h14, h13, true);
        Puerta puerta1415 = fabricarPuerta(h14, h15, true);
        
        Puerta puerta153 = fabricarPuerta(h15, h3, true);
        Puerta puerta1511 = fabricarPuerta(h15, h11, false);
        Puerta puerta1514 = fabricarPuerta(h15, h14, true);
        Puerta puerta1516 = fabricarPuerta(h15, h16, true);
        
        Puerta puerta1612 = fabricarPuerta(h16, h12, true);
        Puerta puerta1613 = fabricarPuerta(h16, h13, true);
        Puerta puerta1615 = fabricarPuerta(h16, h15, true);
        
        h1.establecerLado(Direccion.NORTE, puerta15);
        h1.establecerLado(Direccion.SUR, puerta113);
        h1.establecerLado(Direccion.ESTE, puerta12);
        h1.establecerLado(Direccion.OESTE, puerta14);
        
        h20.establecerLado(Direccion.NORTE, puerta26);
        h21.establecerLado(Direccion.SUR, puerta214);
        h22.establecerLado(Direccion.ESTE, puerta23);
        h23.establecerLado(Direccion.OESTE, puerta21);
        
        h3.establecerLado(Direccion.NORTE, puerta37);
        h3.establecerLado(Direccion.SUR, puerta315);
        h3.establecerLado(Direccion.ESTE, puerta34);
        h3.establecerLado(Direccion.OESTE, puerta32);
        
        h4.establecerLado(Direccion.NORTE, puerta48);
        h4.establecerLado(Direccion.SUR, fabricarParedConLlave());
        h4.establecerLado(Direccion.ESTE, puerta41);
        h4.establecerLado(Direccion.OESTE, puerta43);
        
        h5.establecerLado(Direccion.NORTE, puerta59);
        h5.establecerLado(Direccion.SUR, puerta51);
        h5.establecerLado(Direccion.ESTE, puerta56);
        h5.establecerLado(Direccion.OESTE, puerta58);
        
        h6.establecerLado(Direccion.NORTE, puerta610);
        h6.establecerLado(Direccion.SUR, puerta62);
        h6.establecerLado(Direccion.ESTE, puerta67);
        h6.establecerLado(Direccion.OESTE, puerta65);
        
        h7.establecerLado(Direccion.NORTE, puerta711);
        h7.establecerLado(Direccion.SUR, puerta73);
        h7.establecerLado(Direccion.ESTE, puerta78);
        h7.establecerLado(Direccion.OESTE, puerta76);
        
        h80.establecerLado(Direccion.NORTE, puerta812);
        h81.establecerLado(Direccion.SUR, puerta84);
        h82.establecerLado(Direccion.ESTE, puerta85);
        h83.establecerLado(Direccion.OESTE, puerta87);
        
        h90.establecerLado(Direccion.NORTE, puerta913);
        h91.establecerLado(Direccion.SUR, puerta95);
        h92.establecerLado(Direccion.ESTE, puerta910);
        h93.establecerLado(Direccion.OESTE, puerta912);
        
        h10.establecerLado(Direccion.NORTE, puerta1014);
        h10.establecerLado(Direccion.SUR, puerta106);
        h10.establecerLado(Direccion.ESTE, puerta1011);
        h10.establecerLado(Direccion.OESTE, puerta109);
        
        h12.establecerLado(Direccion.NORTE, puerta1216);
        h12.establecerLado(Direccion.SUR, puerta128);
        h12.establecerLado(Direccion.ESTE, puerta129);
        h12.establecerLado(Direccion.OESTE, puerta1211);
        
        h13.establecerLado(Direccion.NORTE, puerta131);
        h13.establecerLado(Direccion.SUR, puerta139);
        h13.establecerLado(Direccion.ESTE, puerta1314);
        h13.establecerLado(Direccion.OESTE, puerta1316);
        
        h14.establecerLado(Direccion.NORTE, puerta142);
        h14.establecerLado(Direccion.SUR, puerta1410);
        h14.establecerLado(Direccion.ESTE, puerta1415);
        h14.establecerLado(Direccion.OESTE, puerta1413);
        
        h15.establecerLado(Direccion.NORTE, puerta153);
        h15.establecerLado(Direccion.SUR, puerta1511);
        h15.establecerLado(Direccion.ESTE, puerta1516);
        h15.establecerLado(Direccion.OESTE, puerta1514);
        
        h16.establecerLado(Direccion.NORTE, fabricarPared());
        h16.establecerLado(Direccion.SUR, puerta1612);
        h16.establecerLado(Direccion.ESTE, puerta1613);
        h16.establecerLado(Direccion.OESTE, puerta1615);
        
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
        Puerta puerta47 = fabricarPuerta(h4, h7, true);
        Puerta puerta89 = fabricarPuerta(h8, h9, true);
        Puerta puerta98 = fabricarPuerta(h9, h8, true);
        
        h1.establecerLado(Direccion.NORTE, fabricarPared());
        h1.establecerLado(Direccion.SUR, fabricarPared());
        h1.establecerLado(Direccion.ESTE, puerta12);
        h1.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h2.establecerLado(Direccion.NORTE, puerta25);
        h2.establecerLado(Direccion.SUR, fabricarTrampa());
        h2.establecerLado(Direccion.ESTE, fabricarPared());
        h2.establecerLado(Direccion.OESTE, puerta21);
        
        h3.establecerLado(Direccion.NORTE, puerta36);
        h3.establecerLado(Direccion.SUR, fabricarParedConLlave());
        h3.establecerLado(Direccion.ESTE, fabricarTrampa());
        h3.establecerLado(Direccion.OESTE, fabricarPared());
        
        h4.establecerLado(Direccion.NORTE, puerta47);
        h4.establecerLado(Direccion.SUR, fabricarPared());
        h4.establecerLado(Direccion.ESTE, fabricarPared());
        h4.establecerLado(Direccion.OESTE, fabricarPared());

        h5.establecerLado(Direccion.NORTE, puerta58);
        h5.establecerLado(Direccion.SUR, puerta52);
        h5.establecerLado(Direccion.ESTE, puerta56);
        h5.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h6.establecerLado(Direccion.NORTE, fabricarTrampa());
        h6.establecerLado(Direccion.SUR, puerta63);
        h6.establecerLado(Direccion.ESTE, fabricarPared());
        h6.establecerLado(Direccion.OESTE, puerta65);
        
        h7.establecerLado(Direccion.NORTE, fabricarPared());
        h7.establecerLado(Direccion.SUR, puerta74);
        h7.establecerLado(Direccion.ESTE, puerta78);
        h7.establecerLado(Direccion.OESTE, fabricarTrampa());
        
        h8.establecerLado(Direccion.NORTE, fabricarTrampa());
        h8.establecerLado(Direccion.SUR, puerta85);
        h8.establecerLado(Direccion.ESTE, puerta89);
        h8.establecerLado(Direccion.OESTE, puerta87);
        
        h9.establecerLado(Direccion.NORTE, fabricarPared());
        h9.establecerLado(Direccion.SUR, fabricarPared());
        h9.establecerLado(Direccion.ESTE, fabricarPared());
        h9.establecerLado(Direccion.OESTE,puerta98);
        
        return unLaberinto;
    }
    
    public final Laberinto crearLaberinto2()
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        return unLaberinto;
    }

}

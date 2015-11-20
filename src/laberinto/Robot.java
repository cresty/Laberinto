/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import java.util.Scanner;

/**
 *
 * @author cresty
 */
public class Robot {

    Behaviour comportamiento;
    Habitacion room;
    String nombre;
    final int hpmax=10;
    int hp=hpmax;
    int llave=0;
    
    public Robot(){}
    
    public Robot(String name, Habitacion hab)
    {
        nombre = name;
        comportamiento = new NormalBehaviour();
        room = hab;
    }
    
    public void Comportamiento()
    {
        comportamiento.mode();
    }
    
    public void addKey()
    {
        llave++;
    }
    
    public void substractKey()
    {
        llave--;
    }
    
    public void Humor()
    {
        comportamiento.respuesta();
    }
    
    public void changeRoom(Habitacion hab)
    {
        room = hab;
        room.Entrar(this);
    }
    
    public Habitacion getRoom()
    {
        return room;
    }
    
    public void showRoom()
    {
        System.out.println("El robot "+nombre+" se encuentra en la habitacion "+room.obtenerNumero());
    }
    
    public void showHP()
    {
        System.out.println("El robot "+nombre+" tiene "+hp+" puntos de vida");
        System.out.println("");
        if (comportamiento.getClass() == laberinto.HurtBehaviour.class)
            System.out.println("CUIDADO "+nombre+" esta herido!!");
        if (comportamiento.getClass() == laberinto.DeadBehaviour.class)
            System.out.println(nombre+" Ha Muerto.");
    }
    
    public void showStatus()
    {
        
    }
    
    public void updateStatus()
    {
        if (comportamiento.getClass() == laberinto.WinBehaviour.class)
            return;
        if (hp <= hpmax/2 &&  hp >=1)
            comportamiento = new HurtBehaviour();
        if (hp<1)
            comportamiento = new DeadBehaviour();
    }
    
    public void getHit()
    {
        hp--;
    }
    
    public boolean winStatus()
    {
        if (comportamiento.getClass() == laberinto.WinBehaviour.class)
        {
            //this.comportamiento = new WinBehaviour();
            System.out.println("El robot "+nombre+" HA GANADO!!!");
            return true;
        }
        else
            return false;
    }
    
    public void mover()
    {
        
        updateStatus();
        //Comportamiento();
            showHP();
            System.out.println("");
            showRoom();
            System.out.println("");
            if (hp != 0)
            {
                System.out.println("Seleccione hacia donde desea mover el robot "+nombre);
                System.out.println("1. Norte");
                System.out.println("2. Sur");
                System.out.println("3. Este");
                System.out.println("4. Oeste");
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                a--;
                LugarDelMapa lado = room.obtenerLado(a);
                lado.Entrar(this);
                updateStatus();
                //Comportamiento();
            }
            if (hp == 0)
                showHP();
    }
   
}

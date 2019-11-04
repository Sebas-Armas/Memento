/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_memento;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombreJuego = "Juego 1";
        String nombrePersonaje = "Sebastián Armas";
        int hp = 100;
        int indice = 0;
        
	Juego juego = new Juego(nombreJuego, nombrePersonaje, hp, 1);

	Caretaker caretaker = new Caretaker();
	Originator originator = new Originator();

	juego = new Juego(nombreJuego, nombrePersonaje, hp, 2);
	originator.setEstado(juego);

        hp = hp -20;
	juego = new Juego(nombreJuego, nombrePersonaje, hp, 3);
	originator.setEstado(juego);

	caretaker.addMemento(originator.guardar()); //Primer Punto de guardado
        sc.nextLine();
        
        hp = hp -30;
	juego = new Juego(nombreJuego, nombrePersonaje, hp, 4);
	originator.setEstado(juego);
        
        
	caretaker.addMemento(originator.guardar()); //Segundo Punto de guardado
        sc.nextLine();

        hp = hp -40;
	juego = new Juego(nombreJuego, nombrePersonaje, hp, 5);
	originator.setEstado(juego);
        
	caretaker.addMemento(originator.guardar()); //tercer Punto de guardado
        sc.nextLine();

	hp = 0;
        juego = new Juego(nombreJuego, nombrePersonaje, hp, 6);
        System.out.println("Fin del Juego");
        System.out.println(juego);
        System.out.println("¿Que punto desea cargar?");
        caretaker.mostrarEstados();
        indice = (sc.nextInt()) - 1;
        
        
	originator.restaurar(caretaker.restaurar(indice));
	juego = originator.getEstado();
        
        System.out.println("Se ha reestablecido al punto N." + (indice +1));
        System.out.println("Datos Carguados:");
	System.out.println(juego);
        
        System.out.println("Puntos:");
        caretaker.mostrarEstados();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_memento;

/**
 *
 * @author User
 */
public class Juego {
    private String nombre;
    private String personaje;
    private int hp;
    private int checkpoint;

    public Juego (String nombre, String personaje, int hp, int checkpoint){
        this.nombre = nombre;
        this.personaje = personaje;
        this.hp = hp;
        this.checkpoint = checkpoint;
    }
    
    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public int getCheckpoint() {
	return checkpoint;
    }

    public void setCheckpoint(int checkpoint) {
	this.checkpoint = checkpoint;
    }

    public String getNombre() {
    	return nombre;
    }

    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }

    @Override
    public String toString() {
	return "nombre= " + nombre + " checkpoint= " + checkpoint
                + " Nombre del Personaje= " + personaje + " Puntos de Vida= " + hp;
    }
}

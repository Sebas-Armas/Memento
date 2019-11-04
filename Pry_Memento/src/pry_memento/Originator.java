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
public class Originator {
    private Juego estado;

    public void setEstado(Juego estado) {
	this.estado = estado;
    }

    public Juego getEstado() {
	return estado;
    }

    public Memento guardar() {
        System.out.println("Se ha guardado la partida");
        System.out.println("Datos Guardados:");
        System.out.println(estado);
	return new Memento(estado);
    }

    public void restaurar(Memento m) {
	this.estado = m.getEstado();
    }
}

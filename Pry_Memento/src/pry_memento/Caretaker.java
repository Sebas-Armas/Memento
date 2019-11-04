/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_memento;

import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
	mementos.add(m);
    }

    public Memento getMemento(int index) {
    	return mementos.get(index);
    }
    
    public Memento restaurar(int index) {
    	for (int i = mementos.size()-1; i>index;i--){
            mementos.remove(i);
        }
        return mementos.get(index);
    }
    
    public void mostrarEstados(){
        for (int i = 0; i< mementoSize() ; i++){
            System.out.println((i+1) + ") " + mementos.get(i).getEstado());
        }
    }
    
    public int mementoSize(){
        return mementos.size();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author OscarIvan
 *Modificaciones: Grupo 2
 */
public class NodoDoble <E> extends NodoSimple  {
    
    public NodoDoble(E valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	Nodo Anterior;

    
    public Nodo getAnterior(){
        return Anterior;
    }
    
    public void setAnterior(Nodo nodo){
        this.Anterior = nodo;
    }
    
}

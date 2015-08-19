/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author OscarIvan
 * Modificaciones: Grupo 2
 */
public class NodoCircular <E> extends NodoDoble <E> {
    
    public NodoCircular(E valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	boolean esCabeza;
    
    public void setEsCabeza(boolean esCabeza){
        this.esCabeza = esCabeza;
    }
    
    public boolean EsCabeza(){
        return esCabeza;
    }
    
}

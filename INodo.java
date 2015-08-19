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
public interface INodo <E> extends Comparable<E>{
    
    
    public void setSiguiente(Nodo nodo);
    public Nodo getSiguiente();    
    public E getValor();
}

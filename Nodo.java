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
public abstract class Nodo <E>{
    E Valor;
    Nodo Siguiente;           
    
    public abstract void setSiguiente(Nodo nodo);
    public abstract Nodo getSiguiente();
    public abstract E getValor();
    public abstract String toString();
    
}

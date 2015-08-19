/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author OscarIvan
 */
public class NodoSimple <E> extends Nodo <E> implements INodo <E>{
    
    public NodoSimple(E valor){
        this.Valor = valor;
    }
    
    @Override
    public void setSiguiente(Nodo nodo){
        this.Siguiente = nodo;
    }
    
    @Override
    public Nodo getSiguiente(){
        return Siguiente;
    }
    
    @Override
    public E getValor(){
        return Valor;
    }
   public  String toString(){
   
       return Valor.toString();
   }

}

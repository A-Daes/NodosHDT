import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author OscarIvan
 *
 */
public class Cola {
    Nodo Cabeza;
    Nodo Actual;
    boolean isEmpty;
    public Cola(){
        Cabeza = null;
        isEmpty = true;
    }
    
    public void Enqueue(Nodo nodoNuevo)
    {
        if (isEmpty){
            Cabeza= nodoNuevo;
            isEmpty = false;
            return;
        }
        Actual.setSiguiente(nodoNuevo);
        Actual = nodoNuevo;
    }
    
    public Nodo Dequeue(){
        if (isEmpty)
            return null;
        Nodo NodoDequeue = Cabeza;
        Cabeza = Cabeza.getSiguiente();
        if (Cabeza == null)
            isEmpty = true;
        return Cabeza;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Nodo NodoActual =Cabeza;        
        while (NodoActual != null)
        {
            sb.append(NodoActual.getValor());
            NodoActual = NodoActual.getSiguiente();
        }
        return sb.toString();
    
    }
    
            
}

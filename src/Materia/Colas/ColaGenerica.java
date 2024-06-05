package Materia.Colas;

import java.util.NoSuchElementException;
import Materia.Models.NodoGenerico;

public class ColaGenerica <T>{
    private NodoGenerico<T> first;
    private NodoGenerico<T> last;
    private int tamano;

    public ColaGenerica() {
        this.first = null;
        this.last = null;
    }
    
    public void addNode(T data){
        NodoGenerico<T> nuevoNode= new NodoGenerico<>(data);
        if(isEmpty()){
            first= nuevoNode;
            last= nuevoNode;

        }else {
            last.next= nuevoNode;
            last= nuevoNode;
        }
        tamano++;
    }

    public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La colaesta vacia");
            
        }
        T value = first.data;
        first=first.next;
        
        if (first==null) {
            last=null;
            
        }
        tamano--;
        return value;
        
    }
    
    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esat vacia"); 
        }
        return first.data;
        
    }
    
    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return tamano;
    }
    
    
}

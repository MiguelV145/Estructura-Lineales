package Materia.Colas;

import java.util.NoSuchElementException;
import Materia.Models.Node;

public class Cola {

    private Node first;
    private Node last;

    public Cola (){
        this.first=null;
        this.last=null;

    }


    //Metodo para agregar un Node a la cola
    public void addNode(int value){
        Node nuevoNode = new Node(value);
        if(isEmpty()){
            first= nuevoNode;
            last= nuevoNode;

        }else{
            last.next= nuevoNode;
            last=nuevoNode;
        }
    }

    public int remove(){
        if (isEmpty()){
            throw new NoSuchElementException("La cola esat vacia ");
        }
        int value =first.value;
        first= first.next;
        if(first==null){
            last= null;
        }
        return value;
    }

    public int peek(){
        if (isEmpty()){
            throw new NoSuchElementException("La cola esat vacia ");
        }
        return first.value;

    }
    public boolean isEmpty(){
        return first== null;   
    }
}

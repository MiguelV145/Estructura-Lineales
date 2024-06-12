package Materia.ListasEnlazadas;

import Materia.Models.Node;

public class ListaEnlazada {

    public Node head;
    int size=0;
    //Constructor
    public ListaEnlazada(){



    }
    //Metodo de agregar nodods a la lista
    public void addNode(int value){
        if(head ==null){
            head= new Node(value);
            //hasta aqui llega el metodo
            size++; // incrementamos el tamaño
            return;
        }

        Node current= head;
        //recorre toda la listaa
        while (current.next != null) {
            current=current.next;
        }
        //este seria el ultimo nodo una creacion de Nodo
        current.next=new Node(value);
        size++; // incrementamos el tamaño
        
    }
    
    /// Creamos el metodo para eliminar por valor
    public void deleteNOde(int value){
        if(head==null){
            return;// no hay elementos no hace nada
        }
        if(head.value == value){
            //PASA AL SIGUEITE NODO
            head = head.next;
            size--; // decrementamos el tamaño
            return;
        }
        
        //PASA NODO A NODO PARA ELIMINAR EL ELEMENTO BUSCADO
        Node current= head;
        
        while (current.next != null) {
            if(current.next.value == value){
                current.next= current.next.next;
                size--; // decrementamos el tamaño
                return;
            }
            current=current.next;
        }
    }

    public int size(){
        return size;
    }
    

    public void print(){
        if (head == null) {
            System.out.println("Lista vacia");
            return;            
        }

        Node current =head;
        //imprime nuestras lista, pilas y colas
        while (current.next != null) {
            System.out.println("Node --> "+ current.value);
            current= current.next;
            
        }
        System.out.println("Node --> "+ current.value);
        System.out.println("Fin de la lista");

    }
}

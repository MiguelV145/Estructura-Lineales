package Ejercicio_03_linkedLists;

import Materia.Models.*;;

public class LinkedListEjr {
    private Node head;
    
    public LinkedListEjr() {
    }


 

        public void addNode2(int value){
            if(head== null){
                head=new Node(value);
                return;
            }
    
            Node current =head;
            while (current.next !=null) {
                current=current.next;
            }
    
            current.next=new Node(value);
        }
    
        public int getByPoss(int posicion){
            if (head == null) {
                throw new IllegalArgumentException("La lista está vacía");
            }
    
            Node punteroPrincipal = head;
            Node punteroReferencia = head;
    
            // Mover el puntero de referencia 'posicion' nodos adelante
            for (int i = 0; i < posicion+1; i++) {
                if (punteroReferencia == null) {
                    throw new IllegalArgumentException("La posición es mayor que la longitud de la lista");
                }
                punteroReferencia = punteroReferencia.next;
            }
    
            // Mover ambos punteros hasta que el puntero de referencia alcance el final
            while (punteroReferencia != null) {
                punteroPrincipal = punteroPrincipal.next;
                punteroReferencia = punteroReferencia.next;
            }
    
            return punteroPrincipal.value;
           
        
    
        }
    }

 
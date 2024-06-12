package Materia.ListasEnlazadas;

import Materia.Models.NodoGenerico;
public class ListaEnlazadasGenerica<T> {
    public NodoGenerico<T> head;
    private int t; // tamaño de la lista

    // Constructor
      public ListaEnlazadasGenerica() {
    }


    // Método para agregar nodos a la lista
    public void addNode(T data) {
        if (head == null) {
            head = new NodoGenerico<>(data);
            t++; // incrementamos el tamaño
            return;
        }

        NodoGenerico<T> current = head;
        // recorremos toda la lista
        while (current.next!= null) {
            current = current.next;
        }
        // creamos un nuevo nodo y lo agregamos al final
        current.next = new NodoGenerico<>(data);
        t++; // incrementamos el tamaño
    }

  
    // Método para eliminar un nodo por valor
    public void deleteNode(T data) {
        if (head == null) {
            return; // no hay elementos en la lista
        }
        if (head.data.equals(data)) {
            // eliminamos el nodo cabeza
            head = head.next;
            t--; // decrementamos el tamaño
            return;
        }

        NodoGenerico<T> current = head;
        // recorremos la lista hasta encontrar el nodo a eliminar
        while (current.next!= null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                t--; // decrementamos el tamaño
                return;
            }
            current = current.next;
        }
    }

    // Método para obtener el tamaño de la lista
    public int size() {
        return t;
    }

    // Método para imprimir la lista
    public void print() {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }

        NodoGenerico<T> current = head;
        // imprimimos la lista
        while (current!= null) {
            System.out.println("Node --> " + current.data);
            current = current.next;
        }
        System.out.println("Fin de la lista");
    }
}


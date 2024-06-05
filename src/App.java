import Materia.Colas.Cola;
import Materia.Colas.ColaGenerica;
import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pila pila= new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);


        System.out.println("Elemeto en la cima de la pila es: "+pila.peek());
        System.out.println("Retirar elemento eliminado de la pila es: "+pila.pop());
        System.out.println("Elemeto en la cima de la pila es: "+pila.peek());


        System.out.println();

        //Implementacionde pila generica

        PilaGenerica<Pantalla> pilasPantallas= new PilaGenerica<>();
        pilasPantallas.push(new Pantalla("Home Page", "/home"));
        pilasPantallas.push(new Pantalla("Menu Page", "/home/menu"));
        pilasPantallas.push(new Pantalla("Settings Page", "/home/menu/settings"));


        System.out.println("Estoy en la pantalla \n\t  -->"+ pilasPantallas.peek().getNombre());
        System.out.println("Destruir pantalla  \n\t  -->"+ pilasPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla  \n\t  -->"+ pilasPantallas.peek().getNombre());
        pilasPantallas.push(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla  \n\t  -->"+ pilasPantallas.peek().getNombre());


        Cola queue= new Cola();
        //AÑADIR ELEMENTOS
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);
        //Mostrar el elemento en el frente
        System.out.println("Elemento en el frente: " +queue.peek());//deberia darme 10
        //Retirar elementos
        System.out.println("Elemento retirado: "+ queue.remove());//dar 10
        System.out.println("Elemetos en el frente: "+queue.peek());//dar 10

        System.out.println("Elemento retirado: "+queue.remove());//10
        System.out.println("Elemetos en el frente: "+queue.peek());


        //Verificar si la cola esta vacia
        System.out.println("¿Cola vacía ? "+(queue.isEmpty() ? "Si":"No") );

        //Implimentacion  de la cola generica tipo pantalla
        ColaGenerica<Pantalla> queuGenerica= new ColaGenerica<>();

        queuGenerica.addNode(new Pantalla("Home Page", "/home"));
        queuGenerica.addNode(new Pantalla("Menu Page", "/home/menu"));
        queuGenerica.addNode(new Pantalla("Settings Page", "/home/menu/settings"));

        System.out.println("La cola tiene "+queuGenerica.size()+" Elementos");

        //Impresion
        System.out.println("Estoy en la pantalla \t "+queuGenerica.peek().getNombre());
        System.out.println("Pantalla destruida \t "+queuGenerica.remove().getNombre());
        queuGenerica.addNode(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla \t "+queuGenerica.peek().getNombre());
        System.out.println("Pnatalla destruida \t "+ queuGenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla \t "+queuGenerica.peek().getNombre());
        System.out.println("Pnatalla destruida \t "+ queuGenerica.remove().getNombre());


        System.out.println("La cola tiene "+queuGenerica.size()+" Elementos");


    }
}

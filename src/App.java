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




    }
}

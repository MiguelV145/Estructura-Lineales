package Ejercicio_01_sing;

import Materia.Pilas.PilaGenerica;

public class SignValidator {

    public boolean isValid (String s){
        PilaGenerica <Character> caracter= new PilaGenerica<>();
        for (char x: s.toCharArray()){
            if (x == '(' || x == '{' || x == '[') {
                caracter.push(x);

            }  else if (x== ')' || x == '}' || x == ']') {
                if (caracter.isEmpty()) {
                    return false;
                }
                char top = caracter.pop();
                if ((x == ')' && top != '(') || 
                    (x == '}' && top != '{') || 
                    (x == ']' && top != '[')) {
                    return false;

                }
            }
        }
           
        return caracter.isEmpty();
    }

}

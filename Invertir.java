package invertir;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Invertir {
    
    public static void main(String[] args) {
        
        Queue<String> cola = new LinkedList<>();
        Stack<String> pila = new Stack<>();
        
        for (int i = 0; i < args.length; i++) {
            String cadena = args[i];            
            for (int j = 0; j < cadena.length(); j++) pila.push(String.valueOf(cadena.charAt(j)));                        
                String inversa = "";
            while(pila.isEmpty() == false){                
                String c = pila.pop();
                inversa = inversa + c;                
            }
            cola.add(inversa);                        
        }        
        for (String s : cola) System.out.println(s);        
        
    }
    
}

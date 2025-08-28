/*2. Comparaciones y búsquedas 
Dadas dos palabras ingresadas por teclado: 
• Verificar si son iguales  
• Verificar cuál es mayor alfabéticamente  
• Ver si una contiene a la otra  
Ingresar un texto y una palabra: 
• Indicar si la palabra aparece en el texto  
• Mostrar la última posición donde aparece */
import java.util.Scanner;

public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //creacion scanner
    Scanner input=new Scanner(System.in);
    
    //solicitar palabra 1 
    System.out.println("Ingrese la primera palabra: ");
    String wordOne = input.nextLine().trim();
     
    //solicitar palabra 2
    System.out.println("Ingrese la segunda palabra: ");
    String wordTwo = input.nextLine().trim();
         
    //comparar si son iguales (sensible a mayus e insensible a mayus)
        System.out.println("¿Son iguales (sensible a mayúsculas)? " + wordOne.equals(wordTwo));
        System.out.println("¿Son iguales (ignorando mayúsculas)? " + wordOne.equalsIgnoreCase(wordTwo));
    
    if (wordOne.compareTo(wordTwo)<0){
        System.out.println("La segunda palabra es mayor alfabeticamente.");    
    }else if (wordOne.compareTo(wordTwo)>0){
        System.out.println("La primera palabra es mayor alfabeticamente.");
    }
    
    //verificar si uno contiene a dos
    if (wordOne.contains(wordTwo)){
        System.out.println("La primera contiene a la segunda.");
    }
    //verificar si dos contiene a uno
    if (wordTwo.contains(wordOne)){
        System.out.println("La segunda contiene a la primera.");
    }
    
    //--------------------------------------------------------------------
    //solicitar texto
        System.out.println("Ingresar texto: ");
    String text = input.nextLine().trim();
    //solicitar palabra
        System.out.print("Ingresar palabra: ");
    String word = input.next().trim();
    //mostrar la ultima posicion donde aparece
    
    if (text.contains(word)){
        System.out.println("La palabra aparece en el texto.");
        int lastIndex = text.lastIndexOf(word.charAt(word.length()-1));
        System.out.println("La ultima posicion donde aparece es: "+lastIndex);
    }
    
  }//MAIN
  
}

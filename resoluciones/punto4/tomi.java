import java.util.Scanner;
import java.util.HashSet;
/*4. Operaciones entre conjuntos
Dado un grupo de cursos representados por HashSet<String>:
Curso A: {"Ana", "Juan", "Pedro"}
Curso B: {"Pedro", "Lucía", "Ana"}
Realizar con métodos de Set:
• Unión (todos los alumnos sin repetir).
• Intersección (quiénes están en ambos).
• Diferencia (quiénes están solo en A).*/

public class Tp9HashSet4 {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
        
    HashSet<String> cursoA = new HashSet<>();
    HashSet<String> cursoB = new HashSet<>();
    String nameInput;
    do{
        System.out.println("Ingrese nombre del curso A. (Para finalizar ingrese fin)");
        nameInput=input.nextLine();
        if(!nameInput.equalsIgnoreCase("fin")){
        cursoA.add(nameInput);
        }
    } while (!nameInput.equalsIgnoreCase("fin"));
    do{
        System.out.println("Ingrese nombre del curso B. (Para finalizar ingrese fin)");
        nameInput=input.nextLine();
        if(!nameInput.equalsIgnoreCase("fin")){
                cursoB.add(nameInput);
        }
    } while (!nameInput.equalsIgnoreCase("fin"));
    
    System.out.println("-Lista de alumnos del curso A-");
    for(String alumnosA : cursoA){
        System.out.println(alumnosA);
    }
    
    System.out.println("-Lista de alumnos del curso B-");
    for(String alumnosB : cursoB)
        System.out.println(alumnosB);
    }
    
    
    }

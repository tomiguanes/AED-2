import java.util.Scanner;
import java.util.HashMap;

public class punto1 {
/*Ejercicio 1: Creación y manipulación básica
• Crear un programa en Java que:
• Declare un HashMap<String, Integer> para almacenar nombres de alumnos y sus edades.
• Agregue al menos 5 alumnos con sus edades.
• Muestre todos los alumnos con sus edades.
• Actualice la edad de uno de los alumnos.
• Elimine un alumno del HashMap.
• Verifique si un alumno específico está en el HashMap.
• Muestre la cantidad total de alumnos almacenados.*/
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> alumnoEdad = new HashMap<String, Integer>();
        System.out.println("-Carga de alumnos(con edad)-");
        String nameInput;
        Integer ageInput;
        do{
            System.out.print("Ingrese nombre (para finalizar ingrese FIN): ");
            nameInput=input.next();
            if (!nameInput.equalsIgnoreCase("fin")){
                System.out.print("Ingrese edad del alumno: ");
                ageInput=input.nextInt();
            alumnoEdad.put(nameInput, ageInput);
            }
            
        }while (!nameInput.equalsIgnoreCase("fin"));
        
        
        System.out.println(alumnoEdad);
        System.out.println("actualizando edad de tom..");
        alumnoEdad.put(nameInput,25);
        
        System.out.println(alumnoEdad);
        
        alumnoEdad.remove(nameInput);
        
        System.out.println(alumnoEdad);
        
        System.out.println(alumnoEdad.containsKey("tomas"));
        


    }
    
}

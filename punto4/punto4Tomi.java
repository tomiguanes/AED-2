/*
 PUNTO 4: Validaciones Ingresar una contraseña: • Verificar si empieza con mayúscula • Verificar si termina en un número
 */
import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese contraseña: ");
        String passInput = input.nextLine();
        System.out.println("Contraseña ingresada: "+(passInput));   
        
        if (Character.isUpperCase(passInput.charAt(0))){
            System.out.println("Comienza con mayuscula.");
            }
        else{
            System.out.println("No comienza con mayuscula.");
            }
        
        if (Character.isDigit(passInput.charAt(passInput.length()-1))){
            System.out.println("Termina con numero.");
        }else{
            System.out.println("No termina con numero.");
        }
        
    }
    
}


//----PUNTO UNO TP 7----
import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creacion scanner
    Scanner input=new Scanner(System.in);
    //solicitar nombre
        System.out.print("Ingresar nombre: ");
    String nameInput = input.nextLine();
        String name = nameInput.trim();
        String nameOp= name.replaceAll("\\s+", "");
        System.out.println("Hola "+name);    
        //mostrar cantidad de caracteres
        int cantChar = nameOp.length();
        System.out.println("Tu nombre tiene "+cantChar+" letras.");
        //mostrar la ultima letra
        char last = nameOp.charAt(cantChar-1);
        System.out.println("Ultimo caracter: "+last);
        //mostrar la primera letra
        char first = nameOp.charAt(0);
        System.out.println("Primer caracter: "+first);
        //convertir todo a mayuscula
        String nameMayus = name.toUpperCase();
        System.out.println("Nombre en mayuscula: "+nameMayus);
        //convertir todo a minuscula
        String nameMinus = name.toLowerCase();
        System.out.println("Nombre en minuscula: "+nameMinus);
    }
    
}

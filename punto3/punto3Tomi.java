/*
3. Subcadenas y reemplazos
Ingresar un correo electrónico:
• Extraer el nombre de usuario (parte antes de @)
• Reemplazar el dominio por "instituto.edu"
Ingresar una frase y:
• Dividirla en palabras
• Mostrar cuántas palabras tiene.
 */

import java.util.Scanner;

public class NewMain1 {

    public static void main(String[] args) {
    //creacion scanner
    Scanner input=new Scanner(System.in);           //declaracion del objeto Scanner
    
        System.out.println("Ingrese mail: ");       
        String mailInput = input.nextLine().trim(); //cargamos el input sin espacios a los extremos(trim) en la clase String
        //aca faltarian las validaciones correspondientes
        
        int at = mailInput.indexOf('@');            //cargamos el indice del arroba en variable at
        String usuario = mailInput.substring(0, at);   //desde 0 al arroba cargamos el usuario 
        String dominio = mailInput.substring(at + 1);  //desde el caracter siguiente al arroba cargamos el dominio
        String mailModificado = mailInput.replaceAll(dominio, "instituto.edu");
        System.out.println("Mail ingresado: "+(mailInput));
        System.out.println("Usuario: "+(usuario));
        System.out.println("Dominio: "+(dominio));
        System.out.println("Mail modificado: "+(mailModificado));
    
    
    }
       
    
    
    
}


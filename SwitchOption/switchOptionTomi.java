import java.util.Scanner;

public class switchOption {
    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MENÚ OPCIONES =====");
            System.out.println("1. Operaciones básicas.");
            System.out.println("2. Comparaciones y búsquedas.");
            System.out.println("3. Subcadenas y reemplazos.");
            System.out.println("4. Subcadenas y reemplazos.");
            System.out.println("0. Salir");
            System.out.print("Elegí una opción: ");
            opcion = input.nextInt();
            input.nextLine(); // limpiar buffer

            switch (opcion) {
                 case 1:
                       operacionesBasicas(input);
                        break;
                case 2:
                       comparacionesYBusquedas(input);
                        break;
                case 3:
                       subcadenasYReemplazos(input);
                        break;
                case 4:
                       validaciones(input);
                       break;
                default:
                        System.out.println("Numero invalido, pruebe nuevamente.");
                        break;
            }
        } while (opcion != 0);

        input.close();
    }

    public static void operacionesBasicas(Scanner input){
    //creacion scanner
    input=new Scanner(System.in);
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
    
    public static void comparacionesYBusquedas (Scanner input){
    //creacion scanner
    input=new Scanner(System.in);
    
    //solicitar palabra 1 
    System.out.print("Ingrese la primera palabra: ");
    String wordOne = input.nextLine().trim();
     
    //solicitar palabra 2
    System.out.print("Ingrese la segunda palabra: ");
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
        System.out.print("Ingresar texto: ");
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
    }//comparacionesybusquedas
    
    public static void subcadenasYReemplazos(Scanner input){
        input=new Scanner(System.in);           //declaracion del objeto Scanner
    
        System.out.print("Ingrese mail: ");       
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
    
    public static void validaciones(Scanner input) {
        input = new Scanner(System.in);
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

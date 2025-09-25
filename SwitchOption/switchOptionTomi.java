import java.util.Scanner;

public class SwitchOption {
    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("===== MENÚ OPCIONES =====");
            System.out.println("1. Operaciones básicas.");
            System.out.println("2. Comparaciones y búsquedas.");
            System.out.println("3. Subcadenas y reemplazos.");
            System.out.println("4. Validaciones.");
            System.out.println("5. Manipulacion avanzada.");
            System.out.println("0. Salir");
            System.out.print("Elegí una opción: ");
            option = input.nextInt();
            input.nextLine(); // limpiar buffer

            switch (option) {
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
                case 5:
                       manipulacionAvanzada(input);
                       break;
                case 0:
                        break;
                default:
                        System.out.println("Numero invalido, pruebe nuevamente.");
                        break;
            }
        } while (option != 0);

        input.close();
    }

    public static void operacionesBasicas(Scanner input){

    //solicitar nombre
    String nameInput;   
    do {
        System.out.print("Ingresar nombre: ");
        nameInput = input.nextLine().trim();
        if (nameInput.isEmpty()){
            System.out.println("El nombre no puede estar vacio.");
        }
    } while (nameInput.isEmpty());
        String name= nameInput.replaceAll("\\s+", "");
        System.out.println("Hola "+name);    
        //mostrar cantidad de caracteres
        int cantChar = name.length();
        System.out.println("Tu nombre tiene "+cantChar+" letras.");
        //mostrar la ultima letra
        char last = name.charAt(cantChar-1);
        System.out.println("Ultimo caracter: "+last);
        //mostrar la primera letra
        char first = name.charAt(0);
        System.out.println("Primer caracter: "+first);
        //convertir todo a mayuscula
        String nameMayus = name.toUpperCase();
        System.out.println("Nombre en mayuscula: "+nameMayus);
        //convertir todo a minuscula
        String nameMinus = name.toLowerCase();
        System.out.println("Nombre en minuscula: "+nameMinus);
    }
    
    public static void comparacionesYBusquedas (Scanner input){
//solicitar palabra 1 
    String wordOne;
    do {
        System.out.print("Ingrese la primera palabra: ");
        wordOne = input.nextLine().trim();
        if (wordOne.isEmpty()){
            System.out.println("La palabra no puede estar vacia.");
        }
    } while (wordOne.isEmpty());
    
    //solicitar palabra 2
    String wordTwo;
    do {System.out.print("Ingrese la segunda palabra: ");
        wordTwo = input.nextLine().trim();
        if (wordTwo.isEmpty()){
            System.out.println("La palabra no puede estar vacia.");
        }
    } while (wordTwo.isEmpty());     
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
    String text;
    
    do {
        System.out.print("Ingresar texto: ");
        text = input.nextLine().trim();
        if (text.isEmpty()){
            System.out.println("El texto no puede estar vacio.");
        }
    } while (text.isEmpty());

    //solicitar palabra
    String word;
    do {
        System.out.print("Ingresar palabra: ");
        word = input.nextLine().trim();
        if (word.isEmpty()){
            System.out.println("La palabra no puede estar vacia.");
        }
    } while (word.isEmpty());

    //mostrar la ultima posicion donde aparece
    
    if (text.contains(word)){
        System.out.println("La palabra aparece en el texto.");
        int lastIndex = text.lastIndexOf(word);
        System.out.println("La ultima posicion donde aparece es: "+lastIndex);
    }else {
        System.out.println("La palabra no aparece en el texto. ");
    }
    
   }//comparacionesybusquedas
    
    public static void subcadenasYReemplazos(Scanner input){
        String mailInput,user="",domain="";
        boolean valid;
       
        do {
            System.out.print("Ingrese mail: ");       
            mailInput = input.nextLine().trim(); //cargamos el input sin espacios a los extremos(trim) en la clase String
            valid=true;
            if (mailInput.isEmpty()){
                System.out.println("El mail no puede estar vacio.");
                valid=false;
            }
            else if (!mailInput.contains("@")){
                    System.out.println("El mail debe contener @");
                    valid=false;
            }else {
                int at = mailInput.indexOf("@");            //cargamos el indice del arroba en variable at
                user = mailInput.substring(0, at).trim(); 
                domain = mailInput.substring(at + 1).trim();
                if (user.isEmpty()){
                    System.out.println("El usuario no puede estar vacio.");
                    valid=false;
                }
                if (domain.isEmpty()){
                    System.out.println("El dominio no puede estar vacio.");
                    valid=false;
                }
            }
        }while(!valid);

        //desde el caracter siguiente al arroba cargamos el dominio
        String mailModificado = user + "@instituto.edu";
        System.out.println("Mail ingresado: "+(mailInput));
        System.out.println("Usuario: "+(user));
        System.out.println("Dominio: "+(domain));
        System.out.println("Mail modificado: "+(mailModificado));
    
        //dividir frase y contar palabras
        String phrase;
        do {
            System.out.print("Ingrese una frase: ");
            phrase = input.nextLine();
            if (phrase.isEmpty()){
            System.out.println("La frase no puede estar vacia.");
        }
        }while(phrase.isEmpty());
        String[] palabras = phrase.trim().split("\\s+");
        System.out.println("Palabras: " + java.util.Arrays.toString(palabras));
        System.out.println("Cantidad de palabras: " + palabras.length);
    }//subcadenasYReemplazos
    
    public static void validaciones(Scanner input) {
        String passInput;
        boolean valid, startsWithUpper, endsWithDigit;
        
        do{
        System.out.print("Ingrese contraseña: ");
        passInput = input.nextLine().trim();
        valid=true;
        if (passInput.isEmpty()){
            System.out.println("La contrasena no puede estar vacia.");
            valid=false;
        }else {
            startsWithUpper=Character.isUpperCase(passInput.charAt(0));
            if(!startsWithUpper){
                System.out.println("Debe comenzar con mayuscula.");
                valid=false;
            }
            endsWithDigit=Character.isDigit(passInput.charAt(passInput.length()-1));
            if (!endsWithDigit){
                System.out.println("Debe terminar con numero.");
                valid=false;
            }
        }
        }while(!valid);
        System.out.println("Contrasena valida ingresada: " +passInput);
        }
    
    
    public static void manipulacionAvanzada (Scanner input){
        String phrase;
        do {
        System.out.print("Ingrese una frase: ");
        phrase = input.nextLine().trim();
        if (phrase.isEmpty()){
            System.out.println("La frase no puede estar vacia.");
        }
        }while(phrase.isEmpty());
        String phraseWithoutVocals = phrase.replaceAll("[aeiouáéíóúüAEIOUÁÉÍÓÚÜ]", "*");
            
        System.out.println("Frase (trim): " + phrase);
        System.out.println("Frase con vocales reemplazadas: " + phraseWithoutVocals);
        
        
        System.out.print("Ingrese una lista de nombres separados por comas (ej: Ana, Juan, Pedro, Maria): ");
            String nameList = input.nextLine();
            String[] nombresInput = nameList.split(",");
                
                for (int i=0; i<nombresInput.length; i++){
                    String limpio = nombresInput[i].trim(); // elimina espacios extras
                    System.out.println(limpio.toUpperCase());
            }
        }
}

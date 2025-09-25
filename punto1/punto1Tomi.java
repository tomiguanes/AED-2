
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

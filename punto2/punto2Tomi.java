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

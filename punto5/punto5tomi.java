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

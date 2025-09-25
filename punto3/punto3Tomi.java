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

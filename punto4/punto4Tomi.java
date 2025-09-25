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

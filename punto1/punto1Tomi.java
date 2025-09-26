    public static void usoBasico(Scanner input){
    ArrayList<String> names = new ArrayList<>();
    String nameInput;
    for (int i=0; i<5; i++){
        do {
        System.out.print("Ingrese nombre "+(i+1)+": ");
        nameInput=input.nextLine().trim();
        if (nameInput.isEmpty()){
            System.out.println("El nombre no puede estar vacio.");
        }
    }while (nameInput.isEmpty());
        names.add(nameInput);   
    }//FOR
    
    for (int i=0; i<names.size();i++){
        System.out.println(names.get(i));
    }
    
    String nameSearch;
    do {
        System.out.println("Ingrese nombre para buscar en la lista: ");
        nameSearch=input.nextLine().trim();
        if (nameSearch.isEmpty()){
            System.out.println("El nombre no puede estar vacio.");
        }
    }while(nameSearch.isEmpty());
    boolean nameExists;
    nameExists = names.contains(nameSearch);
    System.out.println("¿El nombre " + nameSearch + " esta en la lista? " + nameExists + ".");
    }
    
}

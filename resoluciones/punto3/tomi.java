
package com.mycompany.tp9hashset;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;

public class Tp9HashSet3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        HashSet<String> mail = new HashSet<String>();
        
        System.out.println("--CARGA DE MAILS--");
        System.out.println("(para finalizar ingrese ''fin'')");
        
        String mailInput;
        //solicitud, validacion y carga
        do {
            System.out.print("Ingrese el mail: ");
            mailInput = input.nextLine().trim();
            if (!mailInput.equalsIgnoreCase("FIN")) {
                boolean agregado = mail.add(mailInput);
                if (!agregado) {
                    System.out.println("El valor ya estaba en el conjunto, no se agregó.");
                }
            }
        } while (!mailInput.equalsIgnoreCase("FIN"));
        System.out.println("Salida exitosa.");
        System.out.println("Lista de mails cargados:");
        
        //mostrar mails
        for (String mailValid : mail) {
            System.out.println(mailValid);
        }
  
        HashSet<Integer> randomNum = new HashSet<Integer>();
        Random num = new Random();
        //genera y almacena 10 numeros random del 1 al 20
        while(randomNum.size()<10){
            int n=num.nextInt(20)+1;
            randomNum.add(n);
        }
        //mostrar
        System.out.println(randomNum);
        
        //verificar si esta el 7
        int searched=7;
        boolean numSearch=randomNum.contains(searched);
        if (numSearch){
            System.out.println("El numero "+(searched)+" esta presente.");
        }else
            System.out.println("El numero "+(searched)+" no esta presente.");
        //eliminar pares
        randomNum.removeIf(n -> n % 2 == 0);
        //mostrar sin pares
        System.out.println(randomNum);  
    }
    
}

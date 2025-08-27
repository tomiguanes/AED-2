package com.mycompany.parcialjava;

import java.util.Scanner;

public class ParcialJava {
    
    
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
        int[] notas=crearArreglo(input);
        
        int opcion;
        cargarArreglo(notas,input);
       
        
        do{
        
        opcion=pedirOpcion(input);
        
        realizarOpcion(opcion, notas);
        
        }while (opcion!=7);
        
        input.close();
    
    }//MAIN

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int[] crearArreglo(Scanner input){
        int length;
        System.out.println("Indicar la cantidad de notas: ");
        length = input.nextInt();
        int[] notas = new int [length];
        return (notas);
    }
    
    
    
    
    public static void cargarArreglo (int[] notas,Scanner input){
        System.out.println("Cargue las notas de a una: ");
        for (int i=0; i<notas.length; i++){
            System.out.println("Ingrese valor "+(i+1)+":");
            notas[i]=input.nextInt();
        }
        System.out.println("Notas cargadas satisfactoriamente.");
    }//cargarArreglo
    
    
    
    
    public static void mostrarMenu(){
        System.out.println("--------------------------");
        System.out.println("<SISTEMA GESTIÓN DE NOTAS>");
        System.out.println("--------------------------");
        System.out.println(" <SELECCIONE UNA OPCION>");
        System.out.println("1- Ver todas las notas.");
        System.out.println("2- Ver la mínima nota.");
        System.out.println("3- Ver cantidad de desaprobados.");
        System.out.println("4- Ver promedio de nota de los aprobados-");
        System.out.println("5- Ver las notas pares.");
        System.out.println("6- Ver si todos aprobaron");
        System.out.println("7- Salir.");
        System.out.println("--------------------------");
}//mostrarMenu
    
    
    
    
    public static int pedirOpcion(Scanner input){
        int opcion;
        mostrarMenu();
        
        opcion=input.nextInt();
            while (opcion < 1 || opcion > 7){
            System.out.println("Valor ingresado incorrecto. Intente nuevamente.");
            opcion=input.nextInt();
            } 
         return (opcion);
    }//pedirOpcion2
    
    
    
    
    public static void realizarOpcion(int opcion, int[]notas){
        switch (opcion){
            
            case 1: 
                    mostrarArreglo(notas);
                    break;
                 
            case 2: 
                    System.out.println("La nota mas baja es: "+minimaNota(notas,notas.length-1));
                    break;
                    
            case 3:
                    System.out.println("Cantidad de desaprobados: "+desaprobados(notas)+".");
                    break;
                    
            case 4: 
                    System.out.println("El promedio de los aprobados es: "+promedioAprobados(notas));
                    break;
                    
            case 5: 
                    mostrarPares(notas,notas.length-1);
                    break;
                    
            case 6: 
                    System.out.println(todosDesaprobaron(notas.length,desaprobados(notas)));
                    break;
            case 7: System.out.println("--SALIDA EXITOSA--");
                       
        }//switch
    }//realizarOpcion
    
    
    

    public static void mostrarArreglo (int[] notas){
        for (int i=0; i<notas.length; i++){
            System.out.println("Nota "+(i+1)+" = "+notas[i]);
        }//for
    }//mostrarArreglo
    
   
    
    
    public static int minimaNota (int[] notas, int index){
        //C.B: primer valor, lo tomo como el menor
        if (index==0) 
            return notas[index];
        //C.R: utilizo algoritmo auxiliar con llamada recursiva, llega al primer valor y luego compara con el siguiente quedándose siempre con el menor
        else {
            return menor(minimaNota(notas, index-1),notas[index]);
        }
    }//minimaNota
    
    public static int menor (int n1, int n2){
        if (n1<=n2)
            return n1;
        else
            return n2;
    }
    
   
    

    public static int desaprobados (int []notas){
        int cont=0;
        for (int i=0; i<notas.length; i++){
            if (notas[i]<60){
                cont++;
            }
        }
        return cont;
    }//desaprobado

   
    

    public static double promedioAprobados (int[]notas){
        int sum=0;
        int cont=0;
        for (int i=0; i<notas.length; i++){
            if (notas[i]>=60){
                sum=sum+notas[i];
                cont++;
            }
        }
        return (sum/cont);
    }//promedioAprobados
    
   
    

    public static void mostrarPares(int[] notas, int index){
        //C.B: index=0, verifico esPar(notas[index]) y muestro
        if (index==0){
            if (esPar(notas[index])){
                System.out.println(notas[index]);
            }
        }//C.R: verifico esPar y muestro, luego llamada recursiva
        else{
            if (esPar(notas[index])){
                System.out.println(notas[index]);
            }
            mostrarPares(notas,index-1);
        }
    }//mostrarPares
    
    public static boolean esPar(int n){
        return (n % 2 == 0);
    }//esPar
    
  
    
    
    public static Boolean todosDesaprobaron(int total, int desaprobados){
        return (total==desaprobados);
    }//todosDesaprobaron
    
    
}//class

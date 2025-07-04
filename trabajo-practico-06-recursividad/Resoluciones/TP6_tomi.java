/*TRABAJO PRACTICO NUMERO 6: ARREGLOS Y RECURSIVIDAD. RESUELTO HASTA: PUNTO 5*/

import java.util.Scanner; 

public class TP6_tomi {
    
    public static void main(String[] args) {
        //Creo "input" de tipo Scanner para que el usuario ingrese longitud del array 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del arreglo: ");
        int length = input.nextInt(); //toma longitud del array por teclado
        int[] arreglo = new int[length]; //declaracion y creacion del array
        
        cargar(arreglo,input); 

        System.out.println("Mostrar arreglo en orden inverso:");
        mostrarInverso(arreglo,arreglo.length-1);

        System.out.println("Mostrar arreglo en orden:");
        mostrarArreglo(arreglo,arreglo.length-1);

        int suma = sumaArreglo(arreglo, arreglo.length - 1); //creo variable suma y le asigno el valor que devuelve el metodo sumaArreglo
        System.out.println("\n\nSuma total del arreglo: " + suma);

        System.out.print("Ingrese un número para buscar en el arreglo: ");
        int num = input.nextInt();
        boolean esta = contiene(arreglo, arreglo.length - 1, num);
        System.out.println("¿El número está presente? " + esta);

        invertir(arreglo,arreglo.length-1); 
        System.out.println("Arreglo invertido:");
        mostrarArreglo(arreglo, arreglo.length - 1);

        input.close();
    }
    
  
  //Metodo para cargar los valores del array
public static void cargar (int[]arreglo, Scanner input){
    for (int i=0; i<arreglo.length; i++){
        System.out.print("Ingrese el valor en la pos. "+i+": ");
        arreglo[i]=input.nextInt();
    }
}  
  //Metodo para mostrar los elementos del array en orden inverso
public static void mostrarInverso (int[]arreglo, int index){
    //Caso base: el arreglo tiene longitud 1
    if (index==0){
        System.out.println(arreglo[index]);
    }
    //Caso recursivo: imprimo el ultimo valor del arreglo, luego llamo y disminuyo en 1.
    else {
        System.out.println(arreglo[index]);
        mostrarInverso(arreglo, index-1);
    }
}

  //Metodo para mostrar los elementos del array en orden, es decir simplemente mostrar el array
public static void mostrarArreglo (int[]arreglo, int index){
    //Caso base: el arreglo tiene longitud 1
    if (index==0){
        System.out.println(arreglo[index]);
    }
    //Caso recursivo: imprimo el ultimo valor del arreglo, luego llamo y disminuyo en 1.
    else {
        mostrarArreglo(arreglo, index-1);
        System.out.println(arreglo[index]);
    }
}
  
  //Metodo recursivo que devuelve la suma total de los elementos del array
public static int sumaArreglo (int[]arreglo, int index){
    //caso base:el arreglo tiene longitud 1
    if (index==0){
        return(arreglo[index]);
    }
    //caso recursivo: disminuyo hasta llegar al corte, y voy sumando
    else{
        return(arreglo[index]+sumaArreglo(arreglo,index-1));
    }
}

  //Metodo recursivo que determina si un numero dado esta presente en el array
public static boolean contiene(int[]arreglo, int index, int num){
   //caso base: el arreglo tiene longitud 1, luego evaluo condicion
   if (index==0){
       return arreglo[index]==num;
   }
   //caso recursivo: 
   else {
       return arreglo[index]==num || contiene(arreglo,index-1,num);
   }
}

 // Metodo recursivo que invierte los elementos del array
public static void invertir(int[] arreglo, int index) {
    //C.B: el arreglo tiene longitud 1
    if (index == 0) {
        return;
    } 
    /*C.R: recorremos el arreglo (index-1) calculando el índice opuesto al actual y solo intercambia si aún no se cruzaron.*/ 
    else {
        int opuesto = arreglo.length - 1 - index;
        //verifico que index sea mayor al opuesto para no realizar doble inversion y devolver el arreglo original
        if (index > opuesto) {
            int aux = arreglo[index];
            arreglo[index] = arreglo[opuesto];
            arreglo[opuesto] = aux;
        }

        invertir(arreglo, index - 1); // llamada recursiva
    }
}


 

}



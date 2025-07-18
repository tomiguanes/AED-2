import java.util.Scanner;

public class EjerciciosParcial {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Indicar la cantidad de notas: ");
    int length;
        length = input.nextInt();
    
        int[] notas = new int [length];
    
        cargarArreglo(notas);
    
        
        
        
    }
    

    
    
    
    public static void cargarArreglo (int[] notas){
        Scanner input = new Scanner(System.in); 
        System.out.println("Cargue las notas de a una: ");
        for (int i=0; i<notas.length; i++){
            System.out.println("Ingrese valor "+(i+1)+":");
            notas[i]=input.nextInt();
        }
        system.out.println('Notas cargadas satisfactoriamente.');
    }//cargarArreglo
   
    public static void mostrarArreglo (int[] notas){
        for (int i=0; i<notas.length; i++){
            println('Nota '+(i+1)+' = '+notas[i]);
        }
    }//mostrarArreglo
    
    public static int minimaNota (int[] notas, int index){
        //C.B: primer valor, lo tomo como el menor
        if (index==0) 
            return;
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
        int cont;
        for (int i=0; i<notas.length; i++){
            if (notas<60)
                cont++;
        }
        return cont;
    }//desaprobado

    public static double promedioAprobados (int[]notas){
        int sum;
        int cont;
        for (int i=0; i<notas.length; i++){
            if (notas[i]>=60){
                sum=sum+notas[i];
                cont++;
            }
            return (suma/cont)
        }
    }//promedioAprobados
    
    public static void mostrarPares(int[] notas, int index){
        //C.B: index=0, verifico esPar(notas[index]) y muestro
        if (index==0){
            if (esPar(notas[inex])){
                println(notas[index]);
            }
        }//C.R: verifico esPar y muestro, luego llamada recursiva
        else{
            if (esPar(notas[index])){
                println(notas[index]);
            }
            mostrarPares(notas,index-1);
        }
    }//mostrarPares
    
    public static Boolean esPar (int n){
        return (n mod 2==0);
    }//esPar
    
    public static Boolean todosDesaprobaron(int total, int desaprobados){
        return (total==desaprobados);
    }//todosDesaprobaron
    
    
}//class

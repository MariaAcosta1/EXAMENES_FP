
package examen2_25550705;

import java.util.Scanner;

public class EXAMEN2_25550705 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor,opcion;
        do{
        System.out.println("Introduce un valor: ");
        valor = input.nextInt();
        System.out.println("Presiona 1 para elegir números primos.");
        System.out.println("Presiona 2 para elegir números NO primos.");
        System.out.println("Presiona 0 para finalizar o otro número para continuar.");
        opcion = input.nextInt();
        System.out.println();
        
        switch(opcion){
            case 1: 
            for(int z = 1; z <= valor; z++){
            System.out.print(z);
            for(int j = 1; j <= z; j++){
            System.out.print("*");
            }
            System.out.println();
        for (int i = 2; i < valor; i++) {
        int residuo = valor % i;
        if(residuo == 0);{        
           }
        }
        }
            break;
            case 2:
            for(int z = 1; z <= valor; z++){
            System.out.print(z);
            for(int j = 1; j <= z; j++){
            System.out.print("*");
            }
            System.out.println();
        for (int i = 2; i < valor; i++){
        int residuo = valor % i;
        if(residuo >= 1);{      
        }
        }
        }
            break;
        }       
        System.out.println();
        }while(opcion != 0);
        System.out.println("Finalizacion del programa!");
    }
    
}


package pkg25550507_exam1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double total, natación, ciclismo, carrera;
        
        System.out.print("Natación: ");
        natación = input.nextDouble();
        System.out.print("Ciclismo: ");
        ciclismo = input.nextDouble();
        System.out.print("Ciclismo: ");
        carrera = input.nextDouble();
        
        total = natación + ciclismo + carrera;
                
        System.out.print("El tiempo total es: ");
        System.out.println(total);
        System.out.println();
        
        if(total <= 120.0)
            System.out.println("Calificación: Excelente!");
        else if(total <= 150.0)
            System.out.println("Calificación: Buena!");
        else
            System.out.println("Calisifación: Regular");
    }
    
}

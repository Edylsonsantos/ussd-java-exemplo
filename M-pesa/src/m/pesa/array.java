



package m.pesa;

import java.util.Scanner;


public class array {
    
    public static void main(String [] args){
        
        int ind;
        
        double[] vetor = new double[10];
        
        Scanner scanner  = new Scanner(System.in);
        
        for(ind = 1; ind < 10; ind++){
            
            System.out.println("Inserir seu numero da sorte:");
            
            vetor[ind] = scanner.nextDouble();
            
            
        }
        
        for(ind = 1; ind < 10; ind++){
            System.out.println("Indice " + ind + " vetor " + vetor[ind]);
        }
        
    }
}

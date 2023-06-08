package projetoaleatorio;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
			
		int numeroLido;
		boolean acertou = false;
		
		 Random aleatorio = new Random();
		int valor = aleatorio.nextInt(11);
		
		while(!acertou) {
		    System.out.print("Informe um número de 0 a 10: ");
		    	    
		  numeroLido = Integer.parseInt(entrada.nextLine());
	      	      
	    if(numeroLido == valor) {
	        System.out.println("Parabéns! Você acertou");
	        acertou = true;
	    }
	    else if(numeroLido < valor){
	    	System.out.println("Errou! Tente um número maior.");
	    }
	    else {
	    	System.out.println("Errou! Tente um número menor.");
			
		}
	}
}
}

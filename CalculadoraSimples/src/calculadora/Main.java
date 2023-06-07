package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2;
		double soma, subtracao, multiplicacao, divisao;
		int op;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		n1 = entrada.nextDouble(); 
		System.out.println("Informe o segundo valor: ");
		n2 = entrada.nextDouble();
		
		System.out.println("SELECIONE UMA OPERAÇAO");
		System.out.println( );
		System.out.println("[1] - SOMAR");
		System.out.println("[2] - SUBTRAIR");
		System.out.println("[3] - MULTIPLICAR");
		System.out.println("[4] - DIVIDIR");
		System.out.println( );
		System.out.println("Digite sua opção: ");
		op = entrada.nextInt();
		
		switch(op) {
		case 1 :
			soma = n1+n2;
			 System.out.println("A soma é : " + soma);
			 break;
			 
		case 2 :
			subtracao = n1-n2;
			System.out.println("A subrtação é : " + subtracao);
			break;
			
		case 3 :
			multiplicacao = n1*n2;
			System.out.println("A multiplicaçao é : " + multiplicacao);
			break;
			
		case 4 :
			if(n1<n2) {
				System.out.println("Impossível realizar o cálculo"); }
			else {
				divisao = n1/n2;
				System.out.println("A divisão é : " + divisao);
			}
			break;
			
		default:
			System.out.println("OPERAÇAO INVÁLIDA");
			
	}
	}
}

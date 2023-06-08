package projetof1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroCarros = 10;
		int[] vetorvoltas = new int [numeroCarros];		
		
		Scanner scanner = new Scanner(System.in);
		
	    for(int indice = 0; indice < numeroCarros; indice ++) {
	        System.out.println("Digite o tempo da volta em segundos : ");
	        
	    int  volta = scanner.nextInt();
	    
	    vetorvoltas[indice] = volta;
	    
	    }
	    // volta mais rápida, a de menor valor
		int voltaMR = 0;
		int media = 0;
		for(int indiceV = 0; indiceV < numeroCarros; indiceV ++) {
			int volta = vetorvoltas[indiceV];
			if(voltaMR > volta ||indiceV == 0) {
			   voltaMR = volta;
			   media = media + volta;
			}
		}
		int segVolta = 9999999;
		for(int indiceV2 = 0; indiceV2 < numeroCarros; indiceV2 ++) {
			int volta2 = vetorvoltas[indiceV2];
			if(volta2 > voltaMR && segVolta > volta2 ) {
			   segVolta = volta2;
			}
		}
		int terVolta = 9999999;
		for(int indiceV3 = 0; indiceV3 < numeroCarros; indiceV3 ++) {
			int volta3 = vetorvoltas[indiceV3];
			if(volta3 > segVolta && terVolta > volta3 ) {
			   terVolta = volta3;		
			}
		}
		for(int indiceV = 0; indiceV < numeroCarros; indiceV ++) {
			int volta = vetorvoltas[indiceV];
			if(voltaMR > volta ||indiceV == 0) {
			   voltaMR = volta;
			   media = media + volta;
			}
		}
		int voltaML =0;
		for(int indL=0;indL < numeroCarros; indL++) {
			int volta = vetorvoltas[indL];
			if (voltaML < volta || indL==0) {
				voltaML = volta;
			}
		}
		System.out.println("A volta mais rápida foi : " + voltaMR );
		System.out.println("A segunda foi : " + segVolta );
		System.out.println("a terceira foi : " + terVolta);
		System.out.println("A média em segundos para as voltas foi : " + media);
		System.out.println("A diferença entre o primeiro e o último: "+(voltaML - voltaMR ));
	}
}
		
		
		
	
		
		
		
		
		
		
		
		

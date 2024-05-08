package VETOR;

import java.util.Scanner;

public class Att2Soma {

	public static void main(String[] args) {
		int soma = 0 ;
		int valor[] = new int [5];

		Scanner ler = new Scanner(System.in);

		for(int i=0; i<5; i++) {
			System.out.println("Escreva seu valor: " +i  );

			valor[i] = ler.nextInt();
			soma = soma + valor[i];
			
		}
		 
		

		if (soma > 15) {
			System.out.println("A soma dos valores apresentados são: " + soma );
		}
		else {
			System.out.println ("O calculo é menor que 15!");
		}

		ler.close();

	}

}

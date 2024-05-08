package VETOR;

import java.util.Scanner;

public class Att1Nome {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
//		String nome = " Infome o nome : ";
		
		String Nome [] = new String [5];
		
		for (int i=0; i<5; i++) {
			System.out.print("Informe o nome: " );
			Nome [i] = ler.next();
		}
		for (int i=0; i<5; i++) {
			System.out.println(Nome[i]);

	}
		ler.close();
	}
}

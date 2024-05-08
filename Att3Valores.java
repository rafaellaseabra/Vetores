package VETOR;

import java.util.Scanner;

public class Att3Valores {

	public static void main(String[] args) {
		
		int  a[] = new int [5] ;
		int b[] = new int [5]; 
	    int c[] = new int [10];
		 
		Scanner ler = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("Determine um Número:  " + i);
			a[i] = ler.nextInt();
			c[i]= a[i];
		}
		for (int i=0; i<5; i++) {
           System.out.println ("Determine outro número: " +i);
           b[i] = ler.nextInt();
           c[i+5]= b [i];
	}
		for (int i=0; i<10; i++) {
		System.out.println("O conjunto é:  " + c[i]);
		
		
	}
}
}
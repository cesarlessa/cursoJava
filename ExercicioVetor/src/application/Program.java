package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos voc� deseja alugar: ");
		
		int n = sc.nextInt();
		
		Dados[] vectDados = new Dados[0];
		
		for (int i = 0; i < vectDados.length; i++) {
			
			System.out.println("Digite o nome do h�spede: ");
			String nome = sc.nextLine();
			
			System.out.println("Digite o quarto do h�spede: ");
			String email = sc.nextLine();
			
			System.out.println("Quarto dispon�vel: ");
			int numQuarto = sc.nextInt();
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}

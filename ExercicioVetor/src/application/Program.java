package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos você deseja alugar: ");
		
		int n = sc.nextInt();
		
		Dados[] vectDados = new Dados[0];
		
		for (int i = 0; i < vectDados.length; i++) {
			
			System.out.println("Digite o nome do hóspede: ");
			String nome = sc.nextLine();
			
			System.out.println("Digite o quarto do hóspede: ");
			String email = sc.nextLine();
			
			System.out.println("Quarto disponível: ");
			int numQuarto = sc.nextInt();
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}

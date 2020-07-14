package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalcNota;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		CalcNota calc = new CalcNota();
		
			System.out.println("Digite o nome do Aluno: ");
				calc.nome = sc.nextLine();
		
			System.out.println("Digite a Primeira Nota: ");
				calc.nota1 = sc.nextDouble();
		
			System.out.println("Digite a Segunda Nota: ");
				calc.nota2 = sc.nextDouble();
		
			System.out.println("Digite a Terceira Nota: ");
				calc.nota3 = sc.nextDouble();
		
			System.out.printf("Nota Final: %.2f%n", calc.SomaNota());
		
		if (calc.SomaNota()<60) {
			
			System.out.println("O Aluno " + calc.nome + " Foi Reprovado");
			System.out.println("Faltou " + calc.Pontos() + " para ser aprovado.");
			
		}  else {
			
			System.out.println("Aprovado");
		}
			
		sc.close();		
		
	}

}

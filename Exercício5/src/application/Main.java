package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Digite o n�mero da conta: ");
		int numConta = sc.nextInt();
		
		System.out.println("Digite o nome do Titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.println("Este � seu primeiro Dep�sito (s / n)? ");
				char resposta = sc.next().charAt(0);
					
				if (resposta == 's') { 
							
					System.out.println("Digite o valor do Dep�sito Inicial: ");
								
								double depositoInicial = sc.nextDouble();
								conta = new Conta(numConta, nomeTitular, depositoInicial);
		} else {
			
				conta = new Conta(numConta, nomeTitular);
		}
	
	System.out.println();
	System.out.println("Digite o N�mero da Conta: ");
	System.out.println(conta);
		
	System.out.println();
	System.out.println("Digite o valor do dep�sito: ");
	double depositoValor = sc.nextDouble();
	conta.deposito(depositoValor);
	
	System.out.println();
	System.out.println("Atualiza��o da Conta ap�s o DEP�SITO: ");
	System.out.println(conta);
	
	System.out.println();
	System.out.println("Digite o valor do saque: ");
	double saqueValor = sc.nextDouble();
	conta.saque(saqueValor);
	
	System.out.println();
	System.out.println("Atualiza��o da Conta ap�s o SAQUE: ");
	System.out.println(conta);
	
		sc.close();
	}

}

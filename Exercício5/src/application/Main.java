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
		
		System.out.println("Digite o número da conta: ");
		int numConta = sc.nextInt();
		
		System.out.println("Digite o nome do Titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.println("Este é seu primeiro Depósito (s / n)? ");
				char resposta = sc.next().charAt(0);
					
				if (resposta == 's') { 
							
					System.out.println("Digite o valor do Depósito Inicial: ");
								
								double depositoInicial = sc.nextDouble();
								conta = new Conta(numConta, nomeTitular, depositoInicial);
		} else {
			
				conta = new Conta(numConta, nomeTitular);
		}
	
	System.out.println();
	System.out.println("Digite o Número da Conta: ");
	System.out.println(conta);
		
	System.out.println();
	System.out.println("Digite o valor do depósito: ");
	double depositoValor = sc.nextDouble();
	conta.deposito(depositoValor);
	
	System.out.println();
	System.out.println("Atualização da Conta após o DEPÓSITO: ");
	System.out.println(conta);
	
	System.out.println();
	System.out.println("Digite o valor do saque: ");
	double saqueValor = sc.nextDouble();
	conta.saque(saqueValor);
	
	System.out.println();
	System.out.println("Atualização da Conta após o SAQUE: ");
	System.out.println(conta);
	
		sc.close();
	}

}

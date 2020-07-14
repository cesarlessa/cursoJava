import java.util.Locale;
import java.util.Scanner;

import application.CurrencyConverter;


public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter conv = new CurrencyConverter();
				
		System.out.println("Digite o Valor do dólar: ");
		
		conv.valor = sc.nextDouble();
		
		System.out.println("Digite a Quantidade de Dolar a Ser comprado: ");
		
		conv.quantidade = sc.nextDouble();
		
		System.out.printf("Valor corrigido + IOF(6%): ", conv.Converter());
		
		
		
		
		
		

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
	
		public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator(); 
		//Outra op��o seria apagar esta inst�ncia e referenciar diretamente desde que as fun��es estejam est�ticas
		
		System.out.print("Enter radius: "); 
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		//Modo Est�tico double c = Calculator.circumference(radius);
		
		double v = calc.volume(radius);
		//Modo Est�tico double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", calc.PI);
		//Modo Est�tico System.out.printf("PI Value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
	
		public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator(); 
		//Outra opção seria apagar esta instância e referenciar diretamente desde que as funções estejam estáticas
		
		System.out.print("Enter radius: "); 
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		//Modo Estático double c = Calculator.circumference(radius);
		
		double v = calc.volume(radius);
		//Modo Estático double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", calc.PI);
		//Modo Estático System.out.printf("PI Value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}

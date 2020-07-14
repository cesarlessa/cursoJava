import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double y = 10.47852;
		double x = 10.13597;
		System.out.println(y);
		System.out.printf("%.2f%n", y);
		System.out.printf("%.4f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", y);
		System.out.println("Valor original: " + x + " Com casas decimais");
		System.out.printf("Resultado = %.2f Metros%n", x); //Valor com Duas casas Decimais

		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		
		
		System.out.printf("%s tem %d anos e sua renda é R$ %.2f%n", nome, idade, renda);
		
	}

}

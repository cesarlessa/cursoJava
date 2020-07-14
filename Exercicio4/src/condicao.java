import java.util.Locale;
import java.util.Scanner;

public class condicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
			System.out.println("Digite a quantidade: ");
				x = sc.nextInt();
		
				y = (x < 12) ? x += 1 : x * 1;
		
			System.out.println("Valor: " + y);
				
	}

}

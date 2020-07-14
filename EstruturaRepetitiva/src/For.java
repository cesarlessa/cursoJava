import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in)	;
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			
			int x = sc.nextInt();
			soma += x;
			
		}
		
		System.out.println(soma);
		
		
		sc.close();
		
					
	}

}

import java.util.Locale;
import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		/* Com valores fixos 
		 * int n1 = 89;
		 * int n2 = 60;
		 * System.out.println(n1 & n2);
		 * System.out.println(n1 | n2);
		 * System.out.println(n1 ^ n2);
		 */
						
			System.out.println("Digite o primeiro valor: ");
				int n1 = sc.nextInt();
		
			System.out.println("Digite o Segundo valor: ");
				int n2 = sc.nextInt();
		
			System.out.println(n1 & n2);// Condição E Bit a Bit;
			System.out.println(n1 | n2);// Condição Ou;
			System.out.println(n1 ^ n2);//Ou Especial;
		
		sc.close();
		
		
		
		
		
		
				
	}

}

import java.util.Scanner;

public class threeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira três Números: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); //Max funcao condicional
		
		showResult(higher); //Higher - Funcao para mostrar na tela um resultado
		
		sc.close();
					
	}

	public static int max(int x, int y, int z) {
		//Funcao Max para ler três valores e verificar qual o maior
		
		int aux;
		
		if (x > y && x > z) {
			
			aux = x;
		}
		else if (y > z) {
			
			aux = y;
		}
		else {
		
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		
		System.out.println("Higher " + value);
		
	}
}

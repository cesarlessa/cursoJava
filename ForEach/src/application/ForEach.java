package application;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vect = new String[] {"JULIO", "CESAR", "LESSA"};
		
		for (int i = 0; i < vect.length; i++) {
			//Laço padrão for para percorrer todo o vetor
			
			System.out.println(vect[i]);
			//Imprimindo na tela os dados contidos no vetor
		}
		
		System.out.println("***************");
		
		for (String obj : vect) {
			//Laço for each, onde 'obj' é um objeto qualquer que receberá os dados do vetor.
			
			System.out.println(obj);
			//Imprimindo na tela os dados contidos no vetor;
		}

	}

}

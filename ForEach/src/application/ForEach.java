package application;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vect = new String[] {"JULIO", "CESAR", "LESSA"};
		
		for (int i = 0; i < vect.length; i++) {
			//La�o padr�o for para percorrer todo o vetor
			
			System.out.println(vect[i]);
			//Imprimindo na tela os dados contidos no vetor
		}
		
		System.out.println("***************");
		
		for (String obj : vect) {
			//La�o for each, onde 'obj' � um objeto qualquer que receber� os dados do vetor.
			
			System.out.println(obj);
			//Imprimindo na tela os dados contidos no vetor;
		}

	}

}

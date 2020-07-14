package entities;

public class CalcNota {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double SomaNota(){
		
		return nota1 + nota2 + nota3;
		
	}
	
	public double Pontos() {
		
		if (SomaNota() < 60) {
			
			return 60.0 - SomaNota();
			
		} else {
			
			return 0.0;
			
		}
		
	}
	
}

package entities;

public class Conta {

	private int numConta;
	private String nomeTitular;
	private double balanco;
	
	public Conta(int numConta, String nomeTitular) {
		
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public Conta(int numConta, String nomeTitular, double depositoInicial) {
		
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public int getnumConta() {
		return numConta;
	}

	public String getnomeTitular() {
		return nomeTitular;
	}

	public void setnomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getBalanco() {
		return balanco;
	}

	public void deposito(double valor) {
		
		balanco += valor;
	}
	
	public void saque(double valor) {
		balanco -= valor + 5.0;
	}
	
	public String toString() {
		
		return "Account "
				+ numConta
				+ ", Holder: "
				+ nomeTitular
				+ ", Balanco: $ "
				+ String.format("%.2f", balanco);		
		
		
	}
}
package lab06.banco;

public abstract class Conta {
	
	private float saldo;
	
	public Conta(float s) {
		saldo = s;
	}
	
	public void depositar(int quantia) {
		saldo += quantia;
		
	}

	public abstract void sacar(int quantia) throws Exception;
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float s) {
		saldo = s;
	}
}

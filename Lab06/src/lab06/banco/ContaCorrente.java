package lab06.banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(float s) {
		super(s);
	}

	public void sacar(int quantia) {
		float novoSaldo = this.getSaldo() - quantia;
		this.setSaldo(novoSaldo);
	}
	
//	public void sacar(int quantia) {
//		saldo -= quantia;
//	}
}

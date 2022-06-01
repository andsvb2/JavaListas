package lab06.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(float s) {
		super(s);
	}

	public void sacar(int quantia) throws Exception {
		
		if(quantia > this.getSaldo()) {
			throw new Exception("Valor a sacar é maior que o saldo.");
		}
		
		float novoSaldo = this.getSaldo() - quantia;
		this.setSaldo(novoSaldo);
	}

}

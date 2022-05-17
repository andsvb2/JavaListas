package l09.contas;

public class ContaEspecial extends ContaCorrente {
	
	private double taxa = 0.5;

	public ContaEspecial(double saldoInicial, String numConta, String t) {
		super(saldoInicial, numConta, t);
	}
	
	public void sacar(double valorSaque) {
		double novosaldo = (this.getSaldo() - (valorSaque + taxa));
		this.setSaldo(novosaldo);
	}

}

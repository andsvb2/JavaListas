package l09.contas;

public class ContaCorrente {

	private String titular;
	private String numero;
	private double saldo;
	private double taxa = 1;
	
	
	public ContaCorrente(double saldoInicial, String numConta, String t) {
		saldo = saldoInicial;
		numero = numConta;
		titular = t;
	}
	
	public void sacar(double valorSaque) {
		saldo -= (valorSaque + taxa);
	}
	
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	protected void setSaldo(double novoSaldo) {
		saldo = novoSaldo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String novoNumero) {
		numero = novoNumero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	protected void setTitular(String t) {
		titular = t;
	}
	
}

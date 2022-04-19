
public class ContaBancaria {
	
	private float saldo;
	private String agencia;
	private String numero;
	private Pessoa titular;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(float saldoInicial, String codAgencia, String numConta, Pessoa p) {
		saldo = saldoInicial;
		agencia = codAgencia;
		numero = numConta;
		titular = p;
	}
	
	public String toString() {
		return "Titular: " + titular + ".\nSaldo: " + saldo;
	}
	
	public boolean equals(ContaBancaria outraConta) {
		return (outraConta.getAgencia().equals(this.agencia) && outraConta.getNumero().equals(this.numero));
	}
	
	public boolean sacar(float valorSaque) {
		if ((valorSaque >= 0) && (saldo - valorSaque >= 0)) {
			saldo -= valorSaque;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean depositar(float valorDeposito) {
		if (valorDeposito >= 0) {
			saldo += valorDeposito;
			return true;
		} else {
			return false;
		}
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String novaAgencia) {
		agencia = novaAgencia;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String novoNumero) {
		numero = novoNumero;
	}
	
	public Pessoa getTitular() {
		return titular;
	}
}

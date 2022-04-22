
public class Banco {
	
	private ContaBancaria[] clientes;
	private int qtdClientes = 0;
	
	public Banco(int tamanhoArray) {
		clientes = new ContaBancaria[tamanhoArray];
	}
	
	public boolean adicionarConta(ContaBancaria novaConta) {
		if (eRepetido(novaConta) && qtdClientes < (clientes.length - 1)) {
			clientes[qtdClientes++] = novaConta;
			return true;
		}
		return false;
	}
	
	public ContaBancaria recuperarConta(String codAgencia, String numConta) {
		
		return null;
	}
	
	public ContaBancaria[] getClientes() {
		return clientes;
	}
	
	public int getQtdClientes() {
		return qtdClientes;
	}
	
	private boolean eRepetido(ContaBancaria contaTestada) {
		boolean flag = false;
		for (ContaBancaria i: clientes) {
			if ((i.equals(contaTestada) && i.getTitular().equals(contaTestada.getTitular())))
				flag = true;
		}
		return flag;
	}
}

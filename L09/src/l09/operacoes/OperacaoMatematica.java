package l09.operacoes;

public abstract class OperacaoMatematica {
	
	private int operando1;
	private int operando2;
	
	public int getOperando1() {
		return operando1;
	}

	public void setOperando1(int op1) {
		operando1 = op1;
	}

	public int getOperando2() {
		return operando2;
	}

	public void setOperando2(int op2) {
		operando2 = op2;
	}

	public abstract float retornarResultado();
	
	public void imprimirResultado() {
		System.out.println(retornarResultado());
	}

}

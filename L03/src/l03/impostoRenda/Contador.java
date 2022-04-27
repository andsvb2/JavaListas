package l03.impostoRenda;

public class Contador {

	public float calcularIR(Trabalhador t) {

		float salarioDeduzido;
		
		salarioDeduzido = (float) (t.getSalarioBruto() - ((t.getDependentes() * 189.59) + (t.getSalarioBruto() * 0.08)));
		
		if (salarioDeduzido >= 4664.69) {
			return 869.36f;
		} else if (salarioDeduzido >= 3751.06) {
			return 636.13f;
		} else if (salarioDeduzido >= 2826.66) {
			return 354.80f;
		} else if (salarioDeduzido >= 1903.99) {
			return 142.80f;
		} else {
			return 0;
		}
	}
}
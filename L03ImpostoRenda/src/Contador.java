
public class Contador {

	public float calcularIR(Trabalhador t) {
		float salarioDeduzido, impostoRecolhido = 0;
		
		salarioDeduzido = (float) (t.getSalarioBruto() - ((t.getDependentes() * 189.59) + (t.getSalarioBruto() * 0.08)));
		
		if (salarioDeduzido >= 4664.69) {
			impostoRecolhido += 869.36;
		} else if (salarioDeduzido >= 3751.06) {
			impostoRecolhido += 636.13;
		} else if (salarioDeduzido >= 2826.66) {
			impostoRecolhido += 354.80;
		} else if (salarioDeduzido >= 1903.99) {
			impostoRecolhido += 142.80;
		} else {
			impostoRecolhido += 0;
		}
		return impostoRecolhido;
	}
}

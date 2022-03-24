
public class CalculadoraCalorias {
	
	public float calcularTMB(Pessoa pessoa) {
		if (pessoa.getSexo() == Sexo.FEMININO) {
			return (float) (655.1 + (9.5 * pessoa.getPeso()) + (1.8 * pessoa.getAltura()) - (4.7 * pessoa.getIdade()));
		} else {
			return (float) (66.5 + (13.8 * pessoa.getPeso()) + (5 * pessoa.getAltura()) - (6.8 * pessoa.getIdade()));
		}
	}
}
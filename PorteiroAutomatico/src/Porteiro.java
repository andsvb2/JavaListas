
public class Porteiro {

	public String boasVindas(Pessoa p) {
		if (p.getIdade() < 10) {
			return (String) ("Olá, jovem " + p.getNome() + ".");
		} else if (p.getSexo() == Sexo.M) {
			return (String) ("Bem vindo, Senhor " + p.getNome() + ".");
		} else if (p.getSexo() == Sexo.F) {
			return (String) ("Bem vinda, Senhorita " + p.getNome() + ".");			
		} else {
			return (String) ("Olá, " + p.getNome() + ", tenha um ótimo dia.");
		}
	}
}

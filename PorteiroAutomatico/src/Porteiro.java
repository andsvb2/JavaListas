
public class Porteiro {

	public String boasVindas(Pessoa pessoa) {
		String nome = pessoa.getNome();
		int idade = pessoa.getIdade();
		Sexo sexo = pessoa.getSexo();
		int situacao;
		
		if (idade < 10) {
			return (String) ("Olá, " + nome + ", tenha um ótimo dia.");
		} else if (sexo == Sexo.FEMININO){
			situacao = 1;
		} else if (sexo == Sexo.MASCULINO) {
			situacao = 2;
		} else {
			situacao = 3;
		}
		
		switch(situacao) {
		case 1:
			return (String) ("Bem vinda, Senhorita " + nome + ".");
//			break;
		case 2:
			return (String) ("Bem vindo, Senhor " + nome + ".");
//			break;
		case 3:
			return (String) ("Olá, " + nome + ", tenha um ótimo dia.");
//			break;
		default:
			return (String) ("Caso não previsto.");
//			break;
		}
	}
}

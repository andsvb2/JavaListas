
public class Pessoa {
	
	private String nome;
	private Sexo sexo;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo novoSexo) {
		sexo = novoSexo;
	}
		
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		idade = novaIdade;
	}
}


public class Pessoa {
	
	private String nome;
	private Sexo sexo;
	private float peso;
	private int altura;
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
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float novoPeso) {
		peso = novoPeso;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int novaAltura) {
		altura = novaAltura;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		idade = novaIdade;
	}
}

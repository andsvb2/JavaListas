
public class Pessoa {

	private long id;
	private String nome;
	private Sexo sexo;
	
	public Pessoa() {
		id = System.currentTimeMillis();
	}
	
	public Pessoa(String nome, Sexo s) {
		id = System.currentTimeMillis();
		this.nome = nome;
		sexo = s;
	}
	
	public String toString() {
		return this.getNome();
	}

	public boolean equals(Pessoa p) {
		return id == p.id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public long getId() {
		return id;
	}

	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public void setSexo(Sexo novoSexo) {
		sexo = novoSexo;
	}
}
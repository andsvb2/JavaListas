
public class Pet {
	
	private String tipo, nome, nomeDono;
	
	public Pet(String t, String n, String dono) {
		tipo = t;
		nome = n;
		nomeDono = dono;
	}
	
	public Pet() {
		
	}
	
	public String toString() {
		return "Pet: " + nome + ". Tipo: " + tipo + ". Dono(a): " + nomeDono + ".";
	}
	
	public boolean equals(Pet p) {
		return (tipo.equals(p.getTipo()) && nome.equals(p.getNome()) && nomeDono.equals(p.getNomeDono()));
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNomeDono() {
		return nomeDono;
	}
}

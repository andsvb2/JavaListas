package l07.pet;

public class Pet {
	
	private String tipo, nome, dono;
	
	public Pet(String t, String n, String d) {
		tipo = t;
		nome = n;
		dono = d;
	}
	
	public Pet() {
		
	}
	
	public String toString() {
		return "Pet: " + nome + ". Tipo: " + tipo + ". Dono(a): " + dono + ".";
	}
	
	public boolean equals(Pet p) {
		return (tipo.equals(p.getTipo()) && nome.equals(p.getNome()) && dono.equals(p.getDono()));
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDono() {
		return dono;
	}
}

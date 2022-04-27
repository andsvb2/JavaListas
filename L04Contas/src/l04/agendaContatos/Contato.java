package l04.agendaContatos;

public class Contato {
	
	private String nome;
	private String telefone;
	private Tipo tipoTelefone;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String novoTelefone) {
		telefone = novoTelefone;
	}
	
	public Tipo getTipoTelefone() {
		return tipoTelefone;
	}
	
	public void setTipoTelefone(Tipo novoTipoTelefone) {
		tipoTelefone = novoTipoTelefone;
	}
}

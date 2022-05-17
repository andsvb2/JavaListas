package l09.chatbot;

public class ChatBotTim extends ChatBot {

	public void apresentarBot() {
		System.out.println("Olá, eu sou Tina, a atendente da Tim.");
	}

	public void identificarUsuario() {
		System.out.println("Qual seu telefone?");
	}

	public void exibirOpcoes() {
		System.out.println("Sobre o que quer falar?"
				+ "\n1 - Crédito"
				+ "\n2 - Plano"
				+ "\n3 - Outros");
	}
}
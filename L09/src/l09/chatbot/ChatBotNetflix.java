package l09.chatbot;

import java.util.ArrayList;

public class ChatBotNetflix extends ChatBot {
	
	private ArrayList<String> programas;
	
	public void apresentarBot() {
		System.out.println("Olá, eu sou Neta, a atendente da Netflix.");
	}

	public void identificarUsuario() {
		System.out.print("E-mail: ");
		System.out.print("Senha: ");
	}

	public void exibirOpcoes() {
		System.out.println("Esses são os programas na sua lista: ");
		System.out.println(programas.toString());
	}
}
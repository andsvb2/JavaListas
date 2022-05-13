package l09.chatbot;

import java.time.LocalDateTime;

public abstract class ChatBot {
	
	public final void cumprimentar() {
		String[] msg = {"Boa madrugada", "Bom dia", "Boa tarde", "Boa noite"};
		int hora = LocalDateTime.now().getHour();
		System.out.println(msg[hora/6]);
	}
	
	public abstract void apresentarBot();
	
	public abstract void identificarUsuario();

}

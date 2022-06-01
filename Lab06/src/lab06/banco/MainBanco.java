package lab06.banco;

import java.util.Scanner;

public class MainBanco {

	public static void main(String[] args) {
		Conta c = null;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Gostaria de criar:"
				+ "\n1 - Conta corrente"
				+ "\n2 - Conta poupança");
		int opcao = Integer.parseInt(input.nextLine());
		
		System.out.print("Saldo inicial (casa decimal separada por ponto): ");
		float saldoInicial = Float.parseFloat(input.nextLine());
		
		switch (opcao) {
		case 1:
			c = new ContaCorrente(saldoInicial);
			break;
		case 2:
			c = new ContaPoupanca(saldoInicial);
			break;
		default:
			break;
		}
		
		System.out.print("Valor a sacar: ");
		int valorSaque = Integer.parseInt(input.nextLine());
		
		try {
			c.sacar(valorSaque);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			c.getSaldo();
		}
		
		
		input.close();
	}

}

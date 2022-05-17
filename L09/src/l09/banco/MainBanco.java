package l09.banco;

import java.util.Scanner;

import l09.contas.ContaCorrente;
import l09.contas.ContaEspecial;

public class MainBanco {

	public static void main(String[] args) {
		
		ContaCorrente conta;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Gostaria de criar uma conta corrente:\n1 - normal;\n2 - especial.");
		int opcao = Integer.parseInt(input.nextLine());
		
		String titular, numero;
		double saldo;
		
		System.out.print("Titular: ");
		titular = input.nextLine();
		
		System.out.print("Número da conta: ");
		numero = input.nextLine();
		
		System.out.print("Saldo inicial (com centavos separados por .): ");
		saldo = Double.parseDouble(input.nextLine());
		
		if (opcao == 1) {
			conta = new ContaCorrente(saldo, numero, titular);
		} else {
			conta = new ContaEspecial(saldo, numero, titular);
		}
		
		System.out.print("Digite um valor a ser sacado da conta (com centavos separados por .): ");
		double valorSaque = Double.parseDouble(input.nextLine());
		conta.sacar(valorSaque);
		System.out.println(conta.getSaldo());
		input.close();
	}
}
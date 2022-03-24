import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		CalculadoraCalorias calculadora = new CalculadoraCalorias();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nome: ");
		pessoa.setNome(input.nextLine());
		
		System.out.print("Sexo: ");
//		String entrada = input.nextLine().toUpperCase();
		pessoa.setSexo(Sexo.valueOf(input.nextLine().toUpperCase()));
		
		System.out.print("Peso (kg): ");
		pessoa.setPeso(Float.parseFloat(input.nextLine()));
		
		System.out.print("Altura (cm): ");
		pessoa.setAltura(Integer.parseInt(input.nextLine()));
		
		System.out.print("Idade: ");
		pessoa.setIdade(Integer.parseInt(input.nextLine()));
		
		input.close();
		
		float tmb = calculadora.calcularTMB(pessoa);
		
		System.out.printf("Taxa de Metabolismo Basal: %.2f", tmb);

	}

}

import java.util.Scanner;

public class ImpostoRecolhido {

	public static void main(String[] args) {
		
		Contador c = new Contador();
		Scanner input = new Scanner(System.in);
		int controle = 0;
		float impostoRecolhido = 0;
		
		System.out.print("Quantidade de funcionários: ");
		int funcionarios = input.nextInt();
		System.out.println("");

		do {
			Trabalhador t = new Trabalhador();
			
			System.out.print("Salário bruto: ");
			t.setSalarioBruto(input.nextFloat());
			
			System.out.print("Dependentes: ");
			t.setDependentes(input.nextInt());
			
			System.out.println("");
			controle++;
			impostoRecolhido += c.calcularIR(t);
			
		} while (controle < funcionarios);
		input.close();
		
		System.out.printf("O total de imposto pago pela empresa é de R$ %.2f.", impostoRecolhido);
	}
}
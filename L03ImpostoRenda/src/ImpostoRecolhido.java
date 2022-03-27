import java.util.Scanner;

public class ImpostoRecolhido {

	public static void main(String[] args) {
		
		Contador c = new Contador();
		Scanner input = new Scanner(System.in);
		int resposta = 1, controle = 0;
		float impostoRecolhido = 0;
		
		System.out.print("Quantidade de funcionários: ");
		int funcionarios = Integer.parseInt(input.nextLine());
		System.out.println("");

		do {
			Trabalhador t = new Trabalhador();
			
			System.out.print("Salário bruto: ");
			t.setSalarioBruto(Float.parseFloat(input.nextLine()));
			
			System.out.print("Dependentes: ");
			t.setDependentes(Integer.parseInt(input.nextLine()));
			
			controle++;
			impostoRecolhido += c.calcularIR(t);
			
		} while (controle < funcionarios);
		input.close();
		
		System.out.printf("%nForam informados %d funcionários.%nO total de imposto pago pela empresa é de R$ %.2f.", controle, impostoRecolhido);
	}

}

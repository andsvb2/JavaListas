import java.util.Scanner;

public class MainPets {

	public static void main(String[] args) {
		
		Pet[] pets = new Pet[5];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < pets.length; i++) {
			String tmpNome, tmpTipo, tmpDono;
			System.out.print("Cadastre o nome do " + (i + 1) + "º pet: ");
			tmpNome = input.nextLine();
			System.out.print("Cadastre o tipo do " + (i + 1) + "º pet: ");
			tmpTipo = input.nextLine();
			System.out.print("Cadastre o dono do " + (i + 1) + "º pet: ");
			tmpDono = input.nextLine();
			pets[i] = new Pet(tmpTipo, tmpNome, tmpDono);
		}
		
		System.out.print("Digite um tipo de pet: ");
		String testeTipo = input.nextLine();
		
		for(Pet bicho: pets) {
			if (testeTipo.equals(bicho.getTipo())) {
				System.out.println(bicho);
			}
		}
		
		input.close();
		}
}

import java.util.Scanner;

public class ProgramaCre {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Aluno[] arrayAlunos = new Aluno[5];
		int total = 0, media, alunosCre = 0;
		String nomes = new String();

		for (int i = 0; i < arrayAlunos.length; i++) {
			System.out.println("Digite os dados do " + (i + 1) + "º aluno:");
			arrayAlunos[i] = new Aluno();
			arrayAlunos[i].setNome(input.nextLine());
			int num = Integer.parseInt(input.nextLine());
			total += num;
			arrayAlunos[i].setCre(num);
		}

		input.close();

		media = total / arrayAlunos.length;

		for (Aluno i : arrayAlunos) {
			if (i.getCre() < media) {
				alunosCre++;
				nomes += i.getNome() + ", ";
				// TODO criar uma forma melhor de formatar a string com os nomes, para não
				// inserir ', ' após o último item.
			}
		}
		System.out.println(alunosCre + " alunos estão abaixo da média\n" + nomes);
	}
}

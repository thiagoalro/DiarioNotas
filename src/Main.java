import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("Entre com a quantidade de alunos: ");
		Scanner input = new Scanner(System.in);
		double[] notasCursoJava = new double[input.nextInt()];
		System.out.print("\n\nDigite as notas dos alunos:\n");

		for (int i = 0; i < notasCursoJava.length; i++){
			System.out.printf("Digite a nota do %dº aluno(a): ", i+1);
			notasCursoJava[i] = input.nextDouble();
		}

		GradeBook cursoJava = new GradeBook("Curso Java - Saper",
											notasCursoJava);
		cursoJava.relatorio();

	}
}
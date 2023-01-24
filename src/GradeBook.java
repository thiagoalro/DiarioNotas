public class GradeBook {
	private String nomeCurso;
	private double[] notasAlunos;

	public GradeBook(String nomeCurso, double[] notasAlunos){
		this.nomeCurso = nomeCurso;
		this.notasAlunos = notasAlunos;
	}

	public String getNomeCurso(){
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso){
		this.nomeCurso = nomeCurso;
	}

	public double getMediaTurma(){
		double somaNotas = 0;
		for (double nota : notasAlunos){
			somaNotas += nota;
		}
		return somaNotas/notasAlunos.length;
	}

	public double getMenorNota(){
		double menorNota = notasAlunos[0];
		for (double nota : notasAlunos){
			if (nota < menorNota){
				menorNota = nota;
			}
		}
		return menorNota;
	}

	public double getMaiorNota(){
		double maiorNota = notasAlunos[0];
		for (double nota : notasAlunos){
			if (nota > maiorNota){
				maiorNota = nota;
			}
		}
		return maiorNota;
	}

	public void getDistribuicaoNotas() {
		// cria e inicializa o vetor com zeros
		int[] frequenciaFaixasNotas = new int[10];

		for (double nota : notasAlunos){
			if (0 <= nota && nota < 1){
				frequenciaFaixasNotas[0]++;
			} else if (1 <= nota && nota < 2) {
				frequenciaFaixasNotas[1]++;
			} else if (2 <= nota && nota < 3) {
				frequenciaFaixasNotas[2]++;
			} else if (3 <= nota && nota < 4) {
				frequenciaFaixasNotas[3]++;
			} else if (4 <= nota && nota < 5) {
				frequenciaFaixasNotas[4]++;
			} else if (5 <= nota && nota < 6) {
				frequenciaFaixasNotas[5]++;
			} else if (6 <= nota && nota < 7) {
				frequenciaFaixasNotas[6]++;
			} else if (7 <= nota && nota < 8) {
				frequenciaFaixasNotas[7]++;
			} else if (8 <= nota && nota < 9) {
				frequenciaFaixasNotas[8]++;
			} else if (9 <= nota && nota <= 10) {
				frequenciaFaixasNotas[9]++;
			}
		}
		 mostraDitribuicaoNotas(frequenciaFaixasNotas);
	}

	private void mostraDitribuicaoNotas(int[] frequenciaNotas){
		for (int i = 0; i < frequenciaNotas.length; i++){
			System.out.printf("Quantidade de notas entre %d " +
					"e %d: %d", i, i+1, frequenciaNotas[i]);
		}
	}



}

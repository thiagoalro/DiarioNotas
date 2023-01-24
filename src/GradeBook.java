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
			if (nota < 10) {
				frequenciaFaixasNotas[(int) nota]++;
			}
			else {
				frequenciaFaixasNotas[9]++;
			}
		}
		mostraDitribuicaoNotas(frequenciaFaixasNotas);
	}

	private void mostraDitribuicaoNotas(int[] frequenciaNotas){
		System.out.println("*** Distribuição das notas ****");
		for (int i = 0; i < frequenciaNotas.length; i++){
			System.out.printf("Quantidade de notas entre %d " +
					"e %d: %d", i, i+1, frequenciaNotas[i]);
		}
	}



}

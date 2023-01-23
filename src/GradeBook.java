public class GradeBook {
	private String nomeCurso;
	private double[] notasAlunos;

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


}

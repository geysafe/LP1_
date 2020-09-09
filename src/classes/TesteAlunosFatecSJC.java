package classes;

public class TesteAlunosFatecSJC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunosFatecSJC gfs = new AlunosFatecSJC("Fernanda", "Banco de Dados", 123654789);
		gfs.setSemestre(4);
		System.out.println("O aluno cursa " + gfs.getCurso() + " no " + gfs.getSemestre() + " semestre");
		
		

	}

}

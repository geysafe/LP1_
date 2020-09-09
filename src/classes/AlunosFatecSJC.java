package classes;

public class AlunosFatecSJC {
	
	private String nome;
    private int semestre;
    private String curso;
    private int matricula; //aberta ou fechada
    private float mediaAtual;
	
    //construtor
    public AlunosFatecSJC(String nome, String curso, int matricula) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
	}


    
    public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getSemestre() {
		return semestre;
	}



	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public float getMediaAtual() {
		return mediaAtual;
	}



	public void setMediaAtual(float mediaAtual) {
		this.mediaAtual = mediaAtual;
	}



	// metodos de classe: estudar, estagiar, frequentar
    public void estudar() {
        System.out.println("estuda na FATEC");
    }
    
    public void frequentar() {
        System.out.println("possui ótima frequencia");
    }
    
    public void aprender() {
        System.out.println("aprende a aprender!");
    }

}

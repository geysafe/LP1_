package classes;

public class Pessoa {
	private String nome;
    private String sexo;
    private int idade;
    private float altura;
    private String profissao;
    
    
  //construtor
    public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
        
    
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	
    // metodos de classe: andar, correr, pedalar	
	public void andar() {
        System.out.println("Acha caminhada maravilhoso pra saúde");
    }
    
    public void correr() {
        System.out.println("Está aprendendo a correr");
    }
    
    public void pedalar() {
        System.out.println("Prefere mesmo de pedalar!");
    }


}

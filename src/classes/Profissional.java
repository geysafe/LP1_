package classes;

public class Profissional {
	private String profissao;
    private boolean regulamentacao;
    private float salarioMinimo;
    private String areaAtuacao;
    private String escolaridade;
	
  //construtor
    public Profissional(String profissao, float salarioMinimo, String areaAtuacao) {
		this.profissao = profissao;
		this.salarioMinimo = salarioMinimo;
		this.areaAtuacao = areaAtuacao;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public boolean isRegulamentacao() {
		return regulamentacao;
	}

	public void setRegulamentacao(boolean regulamentacao) {
		this.regulamentacao = regulamentacao;
	}

	public float getSalarioMinimo() {
		return salarioMinimo;
	}

	public void setSalarioMinimo(float salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

    
    // metodos de classe: trabalhar

	public void trabalhar() {
        System.out.println("Eu vou trabalhar");
    }
    
    public void receber() {
        System.out.println("O salário é ótimo!");
    }
    
    public void estudar() {
        System.out.println("Esta área exige muito estudo");
    }

}

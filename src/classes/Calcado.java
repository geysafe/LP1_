package classes;

public class Calcado {
	private String modelo;
    private String marca;
    private int numeracao;
    private String composicao;
    private String finalidade; //esporte, social, segurança (EPI), casual
	
    //construtor
    public Calcado(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

    
    
    public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getNumeracao() {
		return numeracao;
	}



	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}



	public String getComposicao() {
		return composicao;
	}



	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}



	public String getFinalidade() {
		return finalidade;
	}



	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}



	// metodos de classe: proteger, vestir, aquecer
    public void proteger() {
        System.out.println("fornecem proteção e segurança");
    }
    
    public void vestir() {
        System.out.println("são confortáveis");
    }
    
    public void aquecer() {
        System.out.println("mantem os pés aquecidos");
    }
}

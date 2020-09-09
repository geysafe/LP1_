package classes;

public class Lugar {
	private String cidade;
    private String pais;
    private String moeda;
    private int orcamento;
    private float distancia;

    //construtor
    public Lugar (String Pais, String destino, int orcamento){
        pais = Pais;
        cidade = destino;
        this.orcamento = orcamento;
    }
    
 // métodos de acesso
    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getMoeda() {
        return this.moeda;
    }

    public float getDistancia() {
        return this.distancia;
    }   
    
    
    public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(int orcamento) {
		this.orcamento = orcamento;
	}

	// metodos de classe: viajar, morar, retornar
    public void viajar() {
        System.out.println("Vamos viajar!");
    }
    
    public void retornar() {
        System.out.println("Hora de voltar pra casa");
    }
    
    public void morar() {
        System.out.println("Talvez seja um bom lugar para morar");
    }


}

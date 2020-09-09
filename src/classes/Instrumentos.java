package classes;

public class Instrumentos {

    private String modelo;
    private String material;
    private String grupo; //metais, madeiras, cordas, percussão
    private String alturaSom; // soprano, alto, tenor, baritonos, baixos
    private int anoFabricacao;
	
    //construtor
    public Instrumentos(String modelo, String grupo, String alturaSom) {
		this.modelo = modelo;
		this.grupo = grupo;
		this.alturaSom = alturaSom;
	}

    // métodos de acesso
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public String getAlturaSom() {
		return alturaSom;
	}


	public void setAlturaSom(String alturaSom) {
		this.alturaSom = alturaSom;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
    
	// metodos de classe: soar, silenciar, tocar
    public void soar() {
        System.out.println("Que som maravilhoso");
    }
    
    public void silenciar() {
        System.out.println("Acho lindo quando não está fazendo som (risos)");
    }
    
    public void tocar() {
        System.out.println("Poderia aprender a tocar");
    }
    
    
    

}


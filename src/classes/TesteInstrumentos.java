package classes;

public class TesteInstrumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instrumentos pucca = new Instrumentos("Saxofone", "Madeiras", "alto");
		pucca.soar(); 
		System.out.println(pucca.getModelo() + " faz");
		
		Instrumentos bang = new Instrumentos("Gaita de Fole", "Aerofoles", "indefinido");
		bang.setAnoFabricacao(1980);
		System.out.println("\n" + bang.getModelo() + " foi criada em " + bang.getAnoFabricacao());
		bang.silenciar();

	}

}

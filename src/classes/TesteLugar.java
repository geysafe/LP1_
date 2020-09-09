package classes;

public class TesteLugar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lugar test1 = new Lugar("Mexico", "Cancun", 5500);
		test1.setDistancia(7000);
		test1.setMoeda("Peso mexicano");
		System.out.println("O destino será: " + test1.getCidade());
		test1.morar();
		
		Lugar test2 = new Lugar("Brasil", "Porto Seguro", 2500);
		test2.setMoeda("Real");
		System.out.println("O destino será: " + test2.getCidade());
		test2.viajar();
		
		

	}

}

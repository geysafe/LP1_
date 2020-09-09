package classes;

public class TesteCalcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcado gdf = new Calcado("Bota bombeiro", "JFK-EPI");
		gdf.setFinalidade("sapato de segurança");
		System.out.println(gdf.getModelo() + " é um " + gdf.getFinalidade());
		gdf.proteger();
		

	}

}

package classes;

public class TesteProfissional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profissional pucca = new Profissional("M�dica", 3784, "Sa�de");
		System.out.print("A profiss�o � " + pucca.getProfissao() + "\n");
		pucca.setRegulamentacao(true);
		System.out.print("Exige regulamenta��o: " + pucca.isRegulamentacao()  + "\n");
		pucca.estudar();
		
		Profissional bang = new Profissional("Comerciante", 1800, "Com�rcio");
		System.out.print("A profiss�o � " + bang.getProfissao()  + "\n");
		bang.setRegulamentacao(false);
		System.out.print("Exige regulamenta��o: " + bang.isRegulamentacao() + "\n");
		bang.receber();

	}

}

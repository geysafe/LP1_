package classes;

public class TesteProfissional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profissional pucca = new Profissional("Médica", 3784, "Saúde");
		System.out.print("A profissão é " + pucca.getProfissao() + "\n");
		pucca.setRegulamentacao(true);
		System.out.print("Exige regulamentação: " + pucca.isRegulamentacao()  + "\n");
		pucca.estudar();
		
		Profissional bang = new Profissional("Comerciante", 1800, "Comércio");
		System.out.print("A profissão é " + bang.getProfissao()  + "\n");
		bang.setRegulamentacao(false);
		System.out.print("Exige regulamentação: " + bang.isRegulamentacao() + "\n");
		bang.receber();

	}

}

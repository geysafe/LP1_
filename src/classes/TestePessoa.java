package classes;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pessoa pucca = new Pessoa("Pucca", "Feminino", 43);
		System.out.printf(pucca.getNome() + " ");
		pucca.andar();

		
		Pessoa bang = new Pessoa("Banguela", "Masculino", 21);
		System.out.print(bang.getNome() + " tem " + bang.getIdade() +" anos. ");
		bang.correr();


	}

}

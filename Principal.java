package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Thor", "m", "Montanha");
		System.out.println("Nome: "+ lobo.getNome());
		System.out.println("Sexo: "+ lobo.getSexo());
		System.out.println("Raça: "+ lobo.getRaca());
		System.out.println("\n ");
		lobo.emitirSom();
		lobo.caminhar();

		
		Cachorro cachorro = new Cachorro("Fred", "m", "Pastor Alemão");
		System.out.println("Nome: "+ lobo.getNome());
		System.out.println("Sexo: "+ lobo.getSexo());
		System.out.println("Raça: "+ lobo.getRaca());
		System.out.println("\n ");
		cachorro.emitirSom();
		cachorro.caminhar();
		cachorro.dormir();
		
		Tigre tigre = new Tigre("Pantera", "F", "Dente de sabre");
		System.out.println("Nome: "+ tigre.getNome());
		System.out.println("Sexo: "+ tigre.getSexo());
		System.out.println("Raça: "+ tigre.getRaca());
		System.out.println("\n ");
		tigre.emitirSom();
		tigre.caminhar();
		tigre.dormir();
		
		Leao leao = new Leao("Leo", "F", "Branco");
		System.out.println("Nome: "+ leao.getNome());
		System.out.println("Sexo: "+ leao.getSexo());
		System.out.println("Raça: "+ leao.getRaca());
		System.out.println("\n ");
		leao.emitirSom();
		leao.caminhar();
		leao.dormir();
		
		Gato gato = new Gato("Mia", "F", "Siames");
		System.out.println("Nome: "+ gato.getNome());
		System.out.println("Sexo: "+ gato.getSexo());
		System.out.println("Raça: "+ gato.getRaca());
		System.out.println("\n ");
		gato.emitirSom();
		gato.caminhar();
		gato.dormir();

	}

}

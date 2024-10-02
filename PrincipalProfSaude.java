package Polimorfismo;

public class PrincipalProfSaude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("MEDICO: ");
		Medico med = new Medico ("Joaquim","Neurologista", 15000,"12345");
		System.out.println("Nome do medico: "+ med.getNome());
		System.out.println("Especialidade do medico: "+med.getEspecialidade());
		System.out.println("Consulta do medico: "+med.getValorConsulta());
		med.agendarConsulta();
		
		
		System.out.println(" ");
		System.out.println("DENTISTA: ");
		Dentista den = new Dentista ("Clara","Pediatria", 18700,"4321");
		System.out.println("Nome do dentista: "+ den.getNome());
		System.out.println("Especialidade do dentista: "+den.getEspecialidade());
		System.out.println("Consulta do dentista: "+den.getValorConsulta());
		den.agendarConsulta();
		
		System.out.println(" ");
		Fisioterapeuta fisio = new Fisioterapeuta ("Leo","Pediatria", 15980, "123468");
		System.out.println("Nome do Fisioterapeuta: "+ fisio.getNome());
		System.out.println("Especialidade do Fisioterapeuta: "+fisio.getEspecialidade());
		System.out.println("Consulta do Fisioterapeuta: "+fisio.getValorConsulta());
        fisio.agendarConsulta();
		

	}

}

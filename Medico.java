package Polimorfismo;

public class Medico extends ProfissionalSaude{


	private String crm;;

	public Medico(String Nome, String especialidade, int valorConsulta, String crm) {
		super(Nome,especialidade,valorConsulta);
		this.crm = crm;
	}
	


	public String getCrm() {
		return crm;
	}



	public void setCrm(String crm) {
		this.crm = crm;
	}



	@Override
	public double agendarConsulta () {
		return agendarConsulta() ;

	}
}






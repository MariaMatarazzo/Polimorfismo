package Polimorfismo;

public class Dentista extends ProfissionalSaude{


	private String cro;

	public Dentista (String Nome, String especialidade, int valorConsulta, String cro) {
		super(Nome,especialidade,valorConsulta);
		this.cro = cro;
	}

	

	public String getCro() {
		return cro;
	}



	public void setCro(String cro) {
		this.cro = cro;
	}



	@Override
	public double agendarConsulta () {
		return agendarConsulta() ;

	}
}




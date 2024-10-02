package Polimorfismo;

public class Fisioterapeuta extends ProfissionalSaude{


	private String crefito;

	public Fisioterapeuta(String Nome, String especialidade, int valorConsulta, String crefito) {
		super(Nome,especialidade,valorConsulta);
		this.crefito =  crefito;
	}

	public String getCrefito() {
		return crefito;
	}

	public void setCrefito(String crefito) {
		this.crefito = crefito;
	}

	@Override
	public double agendarConsulta () {
		return agendarConsulta() ;
		
	}

}

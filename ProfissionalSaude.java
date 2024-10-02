package Polimorfismo;

public class ProfissionalSaude {
	
		private String Nome;
		private String especialidade;
		private int valorConsulta;
		
		public ProfissionalSaude(String Nome, String especialidade, int valorConsulta) {
			this.Nome = Nome;
			this.especialidade = especialidade;
			this.valorConsulta = valorConsulta;
		
		}
		
		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			this.Nome = nome;
		}

		public String getEspecialidade() {
			return especialidade;
		}

		public void setEspecialidade(String especialidade) {
			this.especialidade = especialidade;
		}

		public int getValorConsulta() {
			return valorConsulta;
		}

		public void setValorConsulta(int valorConsulta) {
			this.valorConsulta = valorConsulta;
		}

		
		public double agendarConsulta () {
			return agendarConsulta() ;


		
		}
	}





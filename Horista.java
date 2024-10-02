package Polimorfismo;

public class Horista extends Funcionario {
	
	    private double valorHora;
	    private int horasTrabalhadas;

	
	    public Horista(int id, String nome, int telefone, int matricula, String endereco) {
	        super(id, nome, telefone, matricula, endereco);
	    }

	    
	    @Override
	    public double calcularSalario(double valorHora,double horasTrabalhadas) {
	        return valorHora * horasTrabalhadas;
	    
	    }
	}



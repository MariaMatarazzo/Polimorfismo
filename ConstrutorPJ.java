package Polimorfismo;

public class ConstrutorPJ extends Funcionario {
	
	
    public ConstrutorPJ(int id, String nome, int telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}


    @Override
    public double calcularSalario(double valorTotal,double imposto) {
        return valorTotal - imposto;
    }
}

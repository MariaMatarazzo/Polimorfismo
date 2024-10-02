package Polimorfismo;

public class Funcionario {

	private int id;
	private String nome;
	private int telefone;
	private int matricula;
	private String endereco;

	public Funcionario(int id, String nome, int telefone, int matricula, String endereco) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.endereco = endereco;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double calcularSalario(double salarioBruto, double desconto) {
		return salarioBruto - desconto;


	}
}


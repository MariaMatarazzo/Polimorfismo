package Polimorfismo;

public class PrincipalFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("SALARIO DO FUNCIONARIO: ");
		Funcionario fun = new Funcionario (1, "Joaquim",1509876-2345,123,"rua y");
		System.out.println(fun.getNome());
		System.out.println (fun.calcularSalario(1000.00,100));
		
		System.out.println(" ");
		System.out.println("HORISTA: ");
		Horista hor = new Horista (2, "Pedro",17098-9876,1234,"rua p");
		System.out.println(hor.getNome());
		System.out.println (hor.calcularSalario(100,200));
		
		System.out.println(" ");
		System.out.println("JORNADA: ");
		Jornada jor = new Jornada (3, "José",17098,1234,"rua j");
		System.out.println(jor.getNome());
		System.out.println (jor.calcularSalario(3000.00,200));
		
		System.out.println(" ");
		System.out.println("CONSULTORA PJ: ");
		ConstrutorPJ consultor = new ConstrutorPJ (4, "Maria",17098-6,9876,"rua m");
		System.out.println(consultor.getNome());
		System.out.println (consultor.calcularSalario(20000.00,220));
		
		

	}

}

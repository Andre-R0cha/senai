package lista10;

public class Funcionario {

	public Funcionario( 
			String nome,
			double salario) {
		 
		this.nome= nome;
		this.salario = salario;
	}
	
	
	public String nome;
	public double salario;
	
	public double aumentarSalario(double porcentagem) {
		return salario+(salario*porcentagem);
	}
	

}

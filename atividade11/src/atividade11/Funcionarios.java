package atividade11;
/*b) Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os atributos
matricula (tipo int) e salario (tipo double), com seus respectivos métodos para leitura e alteração
(getters e setters). O salário de um funcionário jamais poderá ser negativo. Todo funcionário
recebe seu salário em duas parcelas, sendo 60% na primeira parcela e 40% na segunda parcela.
Assim, escreva os métodos getSalarioPrimeiraParcela que retorna o valor da primeira parcela
do salário e getSalarioSegundaParcela que retorna o valor da segunda parcela do salário.*/


public class Funcionarios extends Pessoas {

	public int maticula;
	public double salario;
	
	
	 public int getMatricula(){
		    return maticula;
		  }
	 public void setMatricula(int maticulaNova){
		 maticula = maticulaNova;
		  }
	 public double getSalario(){
		    return salario;
		  }
	 public void setSalario(double salarioNovo){
		 salario = salarioNovo;
		  }
	
}

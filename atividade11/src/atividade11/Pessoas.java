package atividade11;

public class Pessoas {
	/*1. Escreva as seguintes classes:
		a) Uma classe pessoa Pessoa atributos nome (tipo String) e sobrenome (tipo String). Cada um
		desses atributos deve ter métodos para lê-los e alterá-los (getters e setters). A classe Pessoa ainda
		deve ter um método chamado getNomeCompleto() que não possui parâmetros de entrada e que
		retorna a concatenação do atributo nome com o atributo sobrenome. Além disso, a classe deve
		possuir um construtor sem parâmetros e um outro construtor que recebe como parâmetros o
		nome e o sobrenome da pessoa e altera respectivamente os atributos nome e sobrenome.
		b) Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os atributos
		matricula (tipo int) e salario (tipo double), com seus respectivos métodos para leitura e alteração
		(getters e setters). O salário de um funcionário jamais poderá ser negativo. Todo funcionário
		recebe seu salário em duas parcelas, sendo 60% na primeira parcela e 40% na segunda parcela.
		Assim, escreva os métodos getSalarioPrimeiraParcela que retorna o valor da primeira parcela
		do salário e getSalarioSegundaParcela que retorna o valor da segunda parcela do salário.
		c) Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu salário em uma
		única parcela. Assim, deve-se sobrescrever os métodos getSalarioPrimeiraParcela e
		getSalarioSegundaParcela. O método getSalarioPrimeiraParcela da classe Professor deve
		retornar o valor integral do salário do professor e o método getSalarioSegundaParcela do
		professor deve retornar o valor zero.*/
	public Pessoas( String nome, String sobreNome) {
		
	}
	public Pessoas() {
		this.nome = nome;
		this.sobreNome = sobreNome;
	}
	
	
	public String nome;
	public String sobreNome;

	 public String getNome(){
		    return nome;
		  }
		  public void setNome(String n){
		    nome = n;
		  }
		  public String getSobrenome(){
		    return sobreNome;
		  }
		  public void setSobrenome(String sN){
		    sobreNome = sN;
		  }
		  public String getNomeCompleto() {
			  return nome+" "+sobreNome;
		  }
}

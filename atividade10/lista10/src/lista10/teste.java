package lista10;

public class teste {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Ingresso question1 = new Ingresso();
		
		question1.nomeEvento = "forro";
		question1.valorIngresso = 100 ;
		System.out.println(question1.imprimiNomeEvento());
		
		
		Retangulo valores = new Retangulo();
		
		valores.altura = 40;
		valores.largura = 70;
		
		valores.calcularArea();
		valores.calcularPerimetro();
		
		double valor1= 10;
		double valor2= 50;
		
		Calculadora operacoes = new Calculadora(valor1 , valor2);
		operacoes.calcularPotencia();
		operacoes.dividir();
		operacoes.somar();
		operacoes.subitrair();
		operacoes.multiplicar();
		
		String nomeFuncionario = "arthur";
		double salarioFuncionario = 2500;
		Funcionario colaborador = new Funcionario( nomeFuncionario,salarioFuncionario );
		
		
		colaborador.aumentarSalario(0.2);
		System.out.println(colaborador.aumentarSalario(0.2));
		colaborador.aumentarSalario(0.5);
		
		System.out.println(colaborador.aumentarSalario(0.5));
		
		
		double consumo = 10;
		double combustivel = 0;
		Carro gol = new Carro(consumo,combustivel);
		
		gol.abastecer(50);
		gol.andar();
		System.out.println(gol.exibirCombustivel());
		
	}

}

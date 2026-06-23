package conta_bancaria.model;

public class ContaPoupanca extends Conta {
private float poupanca;


	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, float poupanca) {
		super(numero, agencia, tipo, titular, saldo);
	
	}
	
	
	public float getPoupanca() {
		return poupanca;
	}

	public void setPoupanca(float limite) {
		this.poupanca = poupanca;
	}
	
	
	

	//23-06
	//Aqui, estamos estanciando o limite para que o saque possa ficar negativo
	
	@Override
	public boolean sacar (float valor) {
		
		
		//(soma do saldo + limite de credito) tem que ser menor que o < valor do saque
		if ((this.getSaldo () + this.poupanca) < valor)
			return false;
		
		//aqui ele ira pegar a situacao de cima e subtrair o saldo pelo valor do saque
		this.setSaldo (this.getSaldo() - valor);
		return true;
		//23-06
		
	}
	
	//estanciar objetos na classe conta
		
	//adicionando polimorfismo, significa que pode adicionar um novo metodo
	//entao, ele consegue adicionar essa nova funcionalidade sem mudar diretamente.
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("**		Saldo da conta poupança: %.2f%n", this.poupanca);
	//23-06	
		
	}
	
	
}

	
	
	
package conta_bancaria.model;

public class ContaCorrente extends Conta {

	//criar herança d conta, vamos voltar ali na chave "extends Conta"
	// add modo constructor no public class
	//ira criar um public herdando todas as funçoes referente a herança
	
	
	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	//23-06
	//Aqui, estamos estanciando o limite para que o saque possa ficar negativo
	@Override
	public boolean sacar (float valor) {
		
		
		//(soma do saldo + limite de credito) tem que ser menor que o < valor do saque
		if ((this.getSaldo () + this.limite) < valor)
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
		System.out.printf("**		Limite da conta: %.2f%n", this.limite);
	//23-06	
		
		
		
		
}
}
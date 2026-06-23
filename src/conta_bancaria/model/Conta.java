package conta_bancaria.model;

public class Conta {

	
	/* ATRIBUTOS DA CLASSE
	 * modificadores de Acesso será " private " deve ser colocado antes do tipo da variavel
	 */
	private	int numero;
	private	int agencia;
	private	int tipo;
	private	String titular;
	private	float saldo;
	
	/**
	 * @param numero
	 * @param agencia
	 * @param tipo
	 * @param titular
	 * @param saldo
	 */
	
	/*Metodo construtor - Gerar as intancias (objetos) da Classe
	 *  Generete constructor fields
	 */
	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
		
		
	}
	
	/* Souce - Generate getts and setters - select all 
	 * 
	 */

	/* se nao colocar o Get, a pessoa nao consegue visualizar o numero da conta
	 * metodo Set Modificar os dados
	 */
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
		
	/*Metodos Auxiliares
	 */
	public boolean sacar (float valor) {
		
		if (this.saldo < valor)
			return false;
		
		this.saldo -=valor;
		return true;
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
	
		/* METODO RELACIONADO AO OBJETO
		 * 
		 */
	
	//23-06 polimorfismo - sobreescrita de um novo meotodo
	
		public void visualizar() {
			
			//para facilitar a visualização para o usuario vamos usar...
			
			String tipo = "";
			
			
			switch(this.tipo) {
			case 1:
				 tipo = "conta corrente";
			break;
			
			case 2:
				 tipo = "conta poupança";
			break;
			
			
			}
			
			System.out.println("*****************************************************");
			System.out.println("**		DADOS DA CONTA			   **");
			System.out.println("*****************************************************");
			System.out.printf("**		Número da Conta: %d %n", this.numero);
			System.out.printf("**		Número da Agência: %d %n", this.agencia);
			System.out.printf("**		Número da Tipo da Conta: %s	%n", tipo);
			System.out.printf("**		Nome do Titular: %s	%n", this.titular);
			System.out.printf("**		Saldo da Conta: %.2f %n", this.saldo);
		
	}			
}

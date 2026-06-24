package conta_bancaria.model;

	public class ContaPoupanca extends Conta {
	

    public ContaPoupanca(int numero,
    					int agencia,
    					int tipo,
    					String titular,
    					float saldo) {
        
    	super(numero, agencia, tipo, titular, saldo);
    }

    
    
    // rendimento simples (teste) valor fixado em 1%
    //para o usuario cliente não ajustar algo que é de controle interno do banco
    		public void renderJuros() {
    			float rendimento = this.getSaldo() * 0.01f;
    				this.setSaldo(this.getSaldo() + rendimento);
    				
    				System.out.println("Rendimento aplicado: " + rendimento);
    }

     
    
    @Override
    		public void visualizar() {
    			super.visualizar();
    				System.out.println("**		Conta Poupança (rendimento 1%)");
    				
    				
    }
}
package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;

public class Menu {
	 public static final String ANSI_RESET = "\u001B[0m";
	public static final String TEXT_CYAN_BOLD_BRIGHT = "\033[1;96m"; 
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		/* instanciar Objetos da classe conta
		 *  nosso objeto sera o c1 , ao colocar c1. (ponto) ira aparecer objetos relacionados
		 */
		//Conta c1 = new Conta (1, 123, 1, "Isabella", 200000.00f);
		
		//Conta c2 = new Conta (1, 123, 2, "Thiago", 200000.00f);
		
		//System.out.println(c1.getTitular());/
		//c1.visualizar();
		//c2.visualizar();
		
		/* Alteraçao do saldo
		 * depois da alteração, usa o visualizar */
		
		//c1.setSaldo(300000.00f);
		//c1.setTitular("Isabella Bruno");
		//c1.visualizar();
		
		
		//c2.depositar(50000);
		//c2.visualizar();
		
		
		//teste se saque
		//System.out.println("Sacar R$ 1.000 da conta c1\n" + (c1.sacar(1000.00f) ? 
		//		 "Saque efetuado com sucesso!" : "Saldo Insuficiente"));
		
		//System.out.println("Sacar R$ 1.000.000 da conta c1\n" + (c1.sacar(1000000.00f) ? 
		//		 "Saque efetuado com sucesso!" : "Saldo Insuficiente"));
		
		
		
		/* if ternário
		 * 
		 * unsado o " ? " irá funcionar como um if
		 * Usando o " : " ira funcionar como um else 
		 * 
		 * condição ? ação se for verdadeiro e : se for falso
		 */
		
 		//dia 23-06
		//vamos instancias a conta corrente
		
		//importa o model
		ContaCorrente cc1 = new ContaCorrente (3, 789, 1, "Raquel", 200000.00f, 2000.00f);
		cc1.visualizar();
		
		
		System.out.println("\nSacar R$ 3.000,00 da conta cc1: " + (cc1.sacar(3000.00f) ?
		"Saque efetuado com sucesso! \nSaldo atual: " + cc1.getSaldo(): "Saldo Insuficiente | Saldo atual: "+ cc1.getSaldo()));

		System.out.println("\nSacar R$ 1.000,00 da conta cc1: " + (cc1.sacar(1000.00f) ?
		"Saque efetuado com sucesso! \nSaldo atual: " + cc1.getSaldo(): "Saldo Insuficiente | Saldo atual:" +cc1.getSaldo()));

		//esse comando nao apareceu no console "2.000 depositado" mas aparece no visualizar
		//entao,  o valor anterior era de 196.000 e foi para 198.000
		cc1.depositar(2000.00f);
		cc1.visualizar();
		
		
		while (true) {
			
			System.out.println(ANSI_BLACK_BACKGROUND);
			System.out.println("***************************************************" );
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                " );
			System.out.println("                                                     ");
			System.out.println("***************************************************");
			System.out.println( ANSI_BLACK_BACKGROUND + TEXT_CYAN_BOLD_BRIGHT );
			System.out.println("          1 - Criar Conta                          ");
			System.out.println("          2 - Listar todas as Contas               ");
			System.out.println("          3 - Buscar Conta por Numero              ");
			System.out.println("          4 - Atualizar Dados da Conta             ");
			System.out.println("          5 - Apagar Conta                         ");
			System.out.println("          6 - Sacar                                ");
			System.out.println("          7 - Depositar                            ");
			System.out.println("          8 - Transferir valores entre Contas      ");
			System.out.println("          0 - Sair          	    		"+ ANSI_RESET );
			System.out.println(ANSI_BLACK_BACKGROUND );
			System.out.println("***************************************************");
			System.out.println("Entre com a opção desejada:                        ");
			System.out.println("                                                   ");

			
			
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");

					break;
				case 2:
					System.out.println("Listar todas as Contas\n\n");

					break;
				case 3:
					System.out.println("Consultar dados da Conta - por número\n\n");

					break;
				case 4:
					System.out.println("Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println("Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println("Saque\n\n");

					break;
				case 7:
					System.out.println("Depósito\n\n");

					break;
				case 8:
					System.out.println("Transferência entre Contas\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
	
	
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Edson ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/dinhovdp/");
		System.out.println("*********************************************************");
	}
}

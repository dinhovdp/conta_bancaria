package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;



public class Menu {
	 public static final String ANSI_RESET = "\u001B[0m";
	public static final String TEXT_CYAN_BOLD_BRIGHT = "\033[1;96m"; 
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
	private static final ContaController contaController =  new ContaController();
	private static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		
		int opcao;
		
		//Criar dados de teste
		criarContasTeste();
		
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

			try {
				opcao = leia.nextInt();
				leia.nextLine();
				
				
				}catch(InputMismatchException e) {
				opcao = -1;
				System.out.println("Digite um número inteiro entre 0 e 8");
				leia.nextLine();
				
				}
				
			
			

			if (opcao == 0) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");
				    cadastrarConta();
				    keyPress();
				    break;
					
					
				case 2:
					System.out.println("Listar todas as Contas\n\n");
					
					listarContas();
					keyPress();
					break;
				case 3:
					System.out.println("Consultar dados da Conta - por número\n\n");
				
					procurarPorNumero();
					keyPress();
					break;
				case 4:
					System.out.println("Atualizar dados da Conta\n\n");
				
					atualizar();
					keyPress();
					break;
				case 5:
					System.out.println("Apagar a Conta\n\n");
				
					deletar();
					keyPress();
					break;
				case 6:
					System.out.println("Saque\n\n");
				
					sacar();
					keyPress();
					break;
				case 7:
					System.out.println("Depósito\n\n");
				
					depositar();
					keyPress();
					break;
				case 8:
					System.out.println("Transferência entre Contas\n\n");
				
					transferi();
					keyPress();
					break;
				default:
				
					
					keyPress();
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		
		}
		
	}
	
		private static void transferi() {
		// TODO Auto-generated method stub
		
	}

		private static void depositar() {
		// TODO Auto-generated method stub
		
	}

		private static void sacar() {
		// TODO Auto-generated method stub
		
	}

		private static void deletar() {
		// TODO Auto-generated method stub
		
	}

		private static void atualizar() {
		// TODO Auto-generated method stub
		
	}

		private static void procurarPorNumero() {
		// TODO Auto-generated method stub
		
	}

		public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Edson ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/dinhovdp/");
		System.out.println("*********************************************************");
	
			
		}	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.nextLine();
	}
	
	 public static void criarContasTeste() {
	    	contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
			contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
	    }
	    
	    public static void listarContas() {
	    	contaController.listarTodas();
	    }
	    
	    //24-06
	    
	    public static void cadastrarConta()	{
	    	
	    	System.out.println("Digite o número da agência: ");
	    	int agencia = leia.nextInt ();
	    	leia.nextLine();
	    	
	    	System.out.println("Digite o nome do Titular da conta: ");
	    	String titular = leia.nextLine ();
	    	
	    	System.out.println("Digite o tipo da conta (1 - CC | 2 - CP): ");
	    	int tipo = leia.nextInt();
	    	
	    	System.out.println("Digite o saldo da conta: ");
	    	float saldo = leia.nextFloat();
	    	
	    	switch(tipo) {
			case 1 ->{
				System.out.println("Digite o limite da conta: ");
				float limite = leia.nextFloat();
				keyPress();
				
				contaController.cadastrar(
						new ContaCorrente(contaController.gerarNumero(), agencia, tipo, titular, saldo, limite));
			}
			case 2 -> {
				System.out.println("Digite o dia do aniversário da conta: ");
				int aniversario = leia.nextInt();
				keyPress();
				
				contaController.cadastrar(
						new ContaPoupanca(contaController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
			}
			default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida!" + Cores.TEXT_RESET);
		}
	    	
	    	
	    	
	        
	    }
	    
}

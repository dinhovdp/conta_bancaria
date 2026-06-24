package conta_bancaria;

import java.util.Scanner;

public class Menu {
	 public static final String ANSI_RESET = "\u001B[0m";
	public static final String TEXT_CYAN_BOLD_BRIGHT = "\033[1;96m"; 
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
	
	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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

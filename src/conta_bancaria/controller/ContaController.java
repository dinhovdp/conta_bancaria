package conta_bancaria.controller;
 
 
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 
import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;
 
public class ContaController implements ContaRepository {
 
	private List<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;
	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
	}
 
	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.printf("A conta número %d foi criada com sucesso! %n", conta.getNumero());
	}
 
	@Override
	public void procurarporNumero(int numero) {
		Optional<Conta> conta = buscarnaCollection(numero);
		if (conta.isPresent())
			conta.get().visualizar();
		else
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
	}
 
	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
		//System.out.println("Digite o número da conta: ");
    	//int numero = leia.nextInt();
    			//leia.nextLine();
    	

		Optional<Conta> buscaConta = buscarnaCollection(conta.getNumero());

		if (buscaConta.isPresent()) {
		listaContas.set(listaContas.indexOf(buscaConta.get()), conta);
		System.out.printf("\nA conta número %d foi atualizada com sucesso!", conta.getNumero());
		}else
		System.out.printf("\nA conta numero %d não foi encontrada!", conta.getNumero());
    	}
		
	
 
	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
		Optional<Conta> conta = buscarnaCollection(numero);
		if (conta.isPresent()) {
			if (listaContas.remove(conta.get()))
				System.out.printf("\nA conta foi excluída com sucesso!", numero);
		}
			
		else
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
	}
 
	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
	}
 
	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
	}
 
	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
	}
	// Método Auxiliar
	public int gerarNumero() {
		return ++ numero;
	}
	public Optional<Conta> buscarnaCollection(int numero){
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return Optional.of(conta);
		}
		return Optional.empty();
	}

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferi(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gerarNumero(int numero) {
		// TODO Auto-generated method stub
		
	}
}
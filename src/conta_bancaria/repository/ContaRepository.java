package conta_bancaria.repository;

import conta_bancaria.model.Conta;

public interface ContaRepository {
	
	
	//crud
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void procurarPorNumero(int numero);
	public void atualizar(Conta conta);
	public void deletar(int numero);
	
	
	//Método Bancários
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferi(int numeroOrigem, int numeroDestino, float valor);

	
}
package conta_bancaria.repository;

import conta_bancaria.model.Conta;

public interface ContaRepository {
	
	//isso foi criado para Todos os metodos que ira utilizar o menu, vi seguir os padrao que esta aqui
	//se fizesse um outro 
	
	
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
	
	void gerarNumero(int numero);
    int gerarNumero();
	void transferir(int numeroOrigem, int numeroDestino, float valor);
	void procurarporNumero(int numero);

	
}
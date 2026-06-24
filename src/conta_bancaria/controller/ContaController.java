package conta_bancaria.controller;

import java.util.*;


import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository {

	
	private List<Conta> listaConta = new ArrayList<Conta>();
	int numero = 0;
	
	
	@Override
	public void listarTodas() {
		for (var conta : listaConta) {
			conta.visualizar();
		}
	}
	
	@Override
	public void cadastrar(Conta conta) {
		listaConta.add(conta);
		System.out.printf("\nA conta número %d foi criada com sucesso!\n", conta.getNumero());
		
	}

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
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
	public void transferi(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	//METODO AUXILIAR
	
	public int gerarNumero() {
		return ++ numero;
	}

}
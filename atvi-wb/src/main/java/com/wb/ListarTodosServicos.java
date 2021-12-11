package com.wb;

import java.util.List;

import com.wb.modelo.Produto;
import com.wb.modelo.Servico;
import com.wb.negocio.Listagem;

public class ListarTodosServicos extends Listagem {
	
	private List<Servico> servicos;
	
	public ListarTodosServicos(List<Servico> servicos) {
		this.servicos = servicos;
		
	} 

	@Override
	public void listar() {
		System.out.println("Lista de todos os serviços:");
		for (Servico servico : servicos) {
			System.out.println("Nome: " + servico.nome);

		}
	}
	
}

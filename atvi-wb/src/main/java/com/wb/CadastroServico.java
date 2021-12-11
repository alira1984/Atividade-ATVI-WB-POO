package com.wb;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;
import com.wb.modelo.Servico;
import com.wb.negocio.Cadastro;

public class CadastroServico extends Cadastro {
	
	private List<Servico> servicos;
	private Entrada entrada;
	
	public CadastroServico(List<Servico> servicos) {
		this.servicos = servicos;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() {
		System.out.println("Início do cadastro de serviços");
		System.out.println("Por favor informe o nome de um serviço:");
		String nome = entrada.receberTexto();
		Servico servico = new Servico();
		servico.nome = nome;
		this.servicos.add(servico);


	}

}

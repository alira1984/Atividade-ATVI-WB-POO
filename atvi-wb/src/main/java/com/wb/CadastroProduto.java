package com.wb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;
import com.wb.negocio.Cadastro;

public class CadastroProduto extends Cadastro {
	
	private List<Produto> produtos;
	private Entrada entrada;
	
	public CadastroProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	@Override
	public void cadastrar() {
		System.out.println("Início do cadastro do produto");
		System.out.println("Por favor informe o nome do produto:");
		String nome = entrada.receberTexto();
		Produto produto = new Produto();
		produto.nome = nome;
		this.produtos.add(produto);

	}

}

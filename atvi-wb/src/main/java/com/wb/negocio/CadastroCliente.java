package com.wb.negocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.Telefone;

public class CadastroCliente extends Cadastro {
	private List<Cliente> clientes;
	private Entrada entrada;
	

	public CadastroCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() {
		System.out.println("Início do cadastro do cliente");
		System.out.println("Por favor informe o nome do cliente:");
		String nome = entrada.receberTexto();
		System.out.println("Por favor informe o nome social do cliente:");
		String nomeSocial = entrada.receberTexto();
		System.out.println("Por favor informe o número do cpf:");
		String valor = entrada.receberTexto();
		System.out.println("Por favor informe a data de emissão do cpf, no padrão dd/mm/yyyy:");
		String data = entrada.receberTexto();
		System.out.println("Informe o número de telefone");
		String telefones = entrada.receberTexto();
		System.out.println("Por favor informe seu Gênero:");
		String genero = entrada.receberTexto();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao = LocalDate.parse(data, formato);
		CPF cpf = new CPF(dataEmissao, valor);
		Cliente cliente = new Cliente(nome, nomeSocial, cpf, genero);
		Telefone telefone = new Telefone(telefones, telefones);
		cliente.getTelefones().add(telefone);
		this.clientes.add(cliente);
		
	}
}
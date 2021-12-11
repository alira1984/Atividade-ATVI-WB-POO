package com.wb;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.Listagem;
import com.wb.negocio.ListarTodosClientes;

public class App {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao cadastro de clientes do Grupo World Beauty");
		Empresa empresa = new Empresa();
		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Cadastrar produto");
			System.out.println("4 - Listar produtos");
			System.out.println("5 - Cadastrar Serviço");
			System.out.println("6 - Listar Serviços");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais!\n");
				break;
			case 1:
				Cadastro cadastro = new CadastroCliente(empresa.getClientes());
				cadastro.cadastrar();
				break;
			case 2:
				Listagem listagem = new ListarTodosClientes(empresa.getClientes());
				listagem.listar();
				break;
			case 3:
				cadastro = new CadastroProduto(empresa.getProdutos());
				cadastro.cadastrar();
				break;
			case 4:
				listagem = new ListarTodosProdutos(empresa.getProdutos());
				listagem.listar();
				break;
			case 5:
				cadastro = new CadastroServico(empresa.getServicos());
				cadastro.cadastrar();
				break;	
			case 6:
				listagem = new ListarTodosServicos(empresa.getServicos());
				listagem.listar();
				break;
			default:
				System.out.println("Operação não entendida");
			}
		}
	}
}
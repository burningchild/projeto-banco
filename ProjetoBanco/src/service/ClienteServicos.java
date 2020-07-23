package service;

import java.util.Scanner;

import model.Cliente;

public class ClienteServicos {

	Scanner sc = new Scanner(System.in).useDelimiter("\r\n");
	Scanner sc2 = new Scanner(System.in).useDelimiter("\r\n");

//adicionar data atual e horario gmt nos metodos.
	public void sacar(double valor, Cliente cliente) {
		cliente.setSaldo(cliente.getSaldo() - valor);
		cliente.historicoDeTransacoesDoCliente.add("Saque efetuado em:");

	}

	public void depositar(double valor, Cliente cliente) {
		cliente.setSaldo(cliente.getSaldo() + valor);

	}

	public void transferir(double valor, Cliente cliente, Cliente clienteDestino) {
		cliente.setSaldo(cliente.getSaldo() - valor);
		clienteDestino.setSaldo(clienteDestino.getSaldo() + valor);

	}

	public void desativarCliente(Cliente cliente) {
		cliente.setStatusAtivacao(false);
	}

	public void ativarCliente(Cliente cliente) {
		cliente.setStatusAtivacao(true);
	}

	public void consultarSaldo(Cliente cliente) {
		System.out.println(cliente.getSaldo());

	}

	public void mostrarHistoricoDeTransacoes(Cliente cliente) {

	}

}

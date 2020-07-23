package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
	/*
	 * - cliente: com nome, agencia, conta corrente, sexo, datanascimento, cpf se
	 * for pessoa fisica, cnpj se for pessoa juridica saldo, isAtivo
	 */
	private String nome;
	private String agencia;
	private String contaCorrente;
	private String dataNascimento;
	private String cpf;
	private String cnpj;
	private String sexo;
	private double saldo;
	private String nomeDoBanco;
	private boolean statusAtivacao;

	Scanner sc = new Scanner(System.in).useDelimiter("\r\n");
	Scanner sc2 = new Scanner(System.in).useDelimiter("\r\n");
	List<Cliente> listaDeDadosDoCliente = new ArrayList<>();
	public List<String> historicoDeTransacoesDoCliente = new ArrayList<>();

	public Cliente(String nome, String agencia, String contaCorrente, String dataNascimento, String cpf, String cnpj,
			String sexo, double saldo, String nomeDoBanco, boolean statusAtivacao) {
		this.nome = nome;
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.sexo = sexo;
		this.saldo = 0.0;
		this.nomeDoBanco = nomeDoBanco;
	}

	public Cliente() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getNomeDoBanco() {
		return nomeDoBanco;
	}

	public void setNomeDoBanco(String nomeDoBanco) {
		this.nomeDoBanco = nomeDoBanco;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatusAtivacao() {
		return statusAtivacao;
	}

	public void setStatusAtivacao(boolean statusAtivacao) {
		this.statusAtivacao = statusAtivacao;
	}

}

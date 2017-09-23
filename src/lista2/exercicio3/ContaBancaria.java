package lista2.exercicio3;

import java.util.ArrayList;

public class ContaBancaria {
	private String numero;
	private String agencia;
	private String banco;
	private String titular;
	private String CPF;
	private double saldo;
	private ArrayList<String> historicoTransacoes;
	
	public ContaBancaria(String numero, String agencia, String banco, String titular, String CPF, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.banco = banco;
		this.titular = titular;
		this.CPF = CPF;
		this.saldo = saldo;
		this.historicoTransacoes = new ArrayList<String>();
	}
	
	//resposta letra b
	public double getSaldo() {
		return this.saldo;
	}
	
	// resposta letra a
	public String imprimeDescricao() {
		String descricao = "";
		descricao = "Banco: " +this.banco + "\n" +
				"Agencia: " + this.agencia + "\n" +
				"Numero: " + this.numero + "\n" +
				"Titular: " + this.titular + "\n" +
				"CPF: " + this.CPF + "\n" +
				"Saldo: " + this.saldo;
		
		return descricao;
	}
	
	//resposta letra c
	public boolean sacar(double quantia) {
		if((quantia > 0) && (quantia <= this.saldo)) {
			this.saldo = this.saldo - quantia;
			
			String transacao = "NOVA TRANSACAO: \n Saque de " + quantia;
			this.historicoTransacoes.add(transacao);
			
			return true;
		}
		
		return false;
	}
	
	//resposta letra d
	public boolean depositar(double quantia) {
		if(quantia > 0) {
			this.saldo = this.saldo + quantia;
			
			String transacao = "NOVA TRANSACAO: \n Deposito de " + quantia;
			this.historicoTransacoes.add(transacao);
			
			return true;
		}
		return false;
	}
	
	//resposta letra e
	public ArrayList<String> getTransacoesRecentes(){
		int numeroTransacoes = this.historicoTransacoes.size();
		if(numeroTransacoes <= 3) 
			return this.historicoTransacoes;
		else {
			ArrayList<String> transacoesRecentes = new ArrayList<>();
			for(int i = this.historicoTransacoes.size()-1; i>=this.historicoTransacoes.size()-4; i--) {
				transacoesRecentes.add(this.historicoTransacoes.get(i));				
			}
			
			return transacoesRecentes;
		}
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public String getBanco() {
		return banco;
	}

	public String getTitular() {
		return titular;
	}

	public String getCPF() {
		return CPF;
	}

	public ArrayList<String> getHistoricoTransacoes() {
		return historicoTransacoes;
	}
}

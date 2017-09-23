package lista2.exercicio3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("1234567", "45454-5", "Santander", 
				"Luke Skywalker", "154628795-42", 28540);
		
		System.out.println("DESCRICAO GERAL: \n" + conta1.imprimeDescricao() + "\n");
		
		realizarSaque(10000, conta1);
		realizarDeposito(9548, conta1);
		realizarSaque(2356, conta1);
		realizarDeposito(12419, conta1);
		
		
		ArrayList<String> historicoTransacoesRecentes = conta1.getTransacoesRecentes();
		
		System.out.println("TRANSACOES RECENTES:");
		for(String transacao : historicoTransacoesRecentes)
			System.out.println(transacao);
	}
	
	public static void realizarSaque(double quantia, ContaBancaria conta) {
		if(conta.sacar(quantia)) {
			System.out.println("Saque de " + quantia + " realizado com sucesso. Novo saldo: " + conta.getSaldo() + "\n");
			
		}
		else {
			System.out.println("Saque não realizado. Verifique o valor desejado ou o saldo da conta.\n");
			
		}
	}
	
	public static void realizarDeposito(double quantia, ContaBancaria conta) {
		if(conta.depositar(quantia)) {
			System.out.println("Deposito de " + quantia + " realizado com sucesso. Novo saldo: " + conta.getSaldo() + "\n");
			
		}
		else {
			System.out.println("Deposito não realizado. Verifique a quantia inserida.\n");
		}
	}

}

package abstracao_banco;
/*Banco:

Crie uma classe abstrata chamada ContaBancaria com métodos abstratos como sacar(), depositar() e calcularSaldo().
Implemente classes concretas como ContaCorrente e ContaPoupanca que estendem ContaBancaria e implementam os
métodos abstratos de acordo com as regras de cada tipo de conta.
Crie um programa para simular operações bancárias utilizando polimorfismo.*/

public class ContaCorrente extends ContaBancaria {
	private double limite;
	
	public ContaCorrente(String numero, String nome, double saldo, double limite) {
		super(numero,nome,saldo);
		this.limite = limite;
	}
	

	public void sacar() {
		double valor = 0;
		if ( valor <= getSaldo() + this.limite) {
			System.out.println("\nSaque no valor de $" + valor + " realizado com sucesso.");
		}else {
			System.out.println("\nSaldo insuficiente.");
		}
	}
	
	public void depositar() {
		double valor = 0;
		valor =+ getSaldo();
		System.out.println("\nDeposito na conta " + getNumero() + " com o valor de $" + valor + " realizado com sucesso.");
		
	}
	public void calcularSaldo() {
		
	}
	public String toString() {
		return "\nConta Corrente: " + getNumero() + "\nNome: " + getNome() + "\nSaldo: " + getSaldo();
	}
}

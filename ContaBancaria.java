package abstracao_banco;/*Banco:

Crie uma classe abstrata chamada ContaBancaria com métodos abstratos como sacar(), depositar() e calcularSaldo().
Implemente classes concretas como ContaCorrente e ContaPoupanca que estendem ContaBancaria e implementam os
métodos abstratos de acordo com as regras de cada tipo de conta.
Crie um programa para simular operações bancárias utilizando polimorfismo.*/

public abstract class ContaBancaria {
	private String numero;
	private String nome;
	private double saldo;
	
	public ContaBancaria( String numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		
		
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public abstract void sacar();
	public abstract void depositar();
	public abstract void calcularSaldo();
	
	public String toString() {
		return "Número da conta: " + this.numero + "\n Nome: " + this.nome + "\nSaldo: " + this.saldo;
	}
}
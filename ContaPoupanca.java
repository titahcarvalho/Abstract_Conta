package abstracao_banco;

public class ContaPoupanca extends ContaBancaria {
	private double rendimento;
	
	public ContaPoupanca(String numero, String nome, double saldo, double rendimento) {
		super(numero,nome,saldo);
		this.rendimento = rendimento;
	}
	public void sacar() {
		double valor = 0;
		if ( valor <= getSaldo()) {
			System.out.println("Saque no valor de $" + valor + " realizado com sucesso.");
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void depositar() {
		double valor;
		valor =+ getSaldo();
		System.out.println("\nDeposito de $" + valor + " realizado com sucesso.");
		
	}
	public void calcularSaldo() {
		this.rendimento =+ (getSaldo() * 0.01);
		System.out.println("\nSaldo da conta poupança: " + getSaldo());
		System.out.println("\nRendimento da conta poupança: " + this.rendimento);
		
	}
	public String toString() {
		return "\nConta Poupança: " + getNumero() + "\nNome: " + getNome() + "\nSaldo: " + getSaldo();
	}

}

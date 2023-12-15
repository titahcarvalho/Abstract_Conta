package abstracao_banco;
import java.util.ArrayList;
public class Simulador {

	public static void main(String[] args) {
		ArrayList<ContaBancaria> Conta = new ArrayList<>();
		ContaBancaria exemplo1 = new ContaCorrente ("789-9", "Maria do Carmo de Assis",123, 300 );
		ContaBancaria exemplo2 = new ContaCorrente ("455-7", "João Francisco de Oliveira",1413, 400 );
		
		ContaBancaria exemplo3 = new ContaPoupanca ("322-8", "Helena Miranda",250, 7);
		ContaBancaria exemplo4 = new ContaPoupanca ("654-7", "Enzo Brunauer",150,8 );
		
		Conta.add(exemplo1);
		Conta.add(exemplo2);
	
		Conta.add(exemplo3);
		Conta.add(exemplo4);
		
		for( ContaBancaria c : Conta ) {
			System.out.println(c.toString());
			System.out.print("-----------------------------------------------------");
			c.calcularSaldo();
			c.depositar();
			c.sacar();
			System.out.print("-----------------------------------------------------");
		}
	}

}

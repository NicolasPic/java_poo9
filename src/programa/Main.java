package programa;

import java.util.Scanner;

import model.Entidades.Conta;
import model.Exceção.ExcecaoConta;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Saldo da conta:");
		double saldo = sc.nextDouble();
		System.out.println("Limite de saque da conta:");
		double limiteSaque = sc.nextDouble();
		
		Conta conta = new Conta(numero,nome,saldo,limiteSaque);
		
		System.out.println("Digite quantidade para o saque: ");
		double quantidade = sc.nextDouble();
		
		try {
		conta.retirada(quantidade);
		System.out.println("Novo saldo: ");
		System.out.println(conta.getSaldo());
		}
		catch(ExcecaoConta e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}

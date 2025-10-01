package EncapsulamentoBanco;

import java.util.Scanner;

public class ObjetoContaBancaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu saldo inicial: ");
		double saldoInicial = sc.nextDouble();

		ContaBancaria conta = new ContaBancaria(saldoInicial);
		System.out.println("Saldo inicial: " + conta.getSaldo());

		System.out.print("Digite o valor do primeiro depósito: ");
		double dep1 = sc.nextDouble();
		conta.depositar(dep1);

		System.out.print("Digite o valor do segundo depósito: ");
		double dep2 = sc.nextDouble();
		conta.depositar(dep2);

		System.out.println("Saldo após depósitos: " + conta.getSaldo());

		System.out.print("Digite o valor do saque: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);

		System.out.println("Saldo final: " + conta.getSaldo());

		sc.close();

	}

}

package EncapsulamentoVenda;

import java.util.Scanner;

public class ObjetoProduto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		String nome = scanner.nextLine();

		System.out.print("Digite o preço do produto: ");
		double preco = scanner.nextDouble();

		Produto produto = new Produto(nome, preco);

		System.out.println("Informações do produto:");
		produto.exibirInformacoes();

		scanner.close();
	}
}

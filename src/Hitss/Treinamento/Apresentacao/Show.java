package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		try {
		System.out.println("");
		System.out.println("         Hitss Treinamento");
		System.out.println("");
		int opcao;
		System.out.println("Digite um número:");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		opcao = teclado.nextInt();
		System.out.println("");
		switch (opcao) {
		case 1:
			System.out.println("Data: 15/03/2020 - Início de Pandemia.");
			break;
		case 2:
			System.out.println("Data: 18/11/2020 - Aniversário de Casamento");
			break;
		case 3:
			System.out.println("Data: 31/12/2020 - Ano Novo. e Feliz ano Novo!");
			break;
		default:
			System.out.println("Dígito Inválido.");
			break;
		}
			
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}

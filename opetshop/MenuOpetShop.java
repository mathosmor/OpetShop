package br.edu.uniopet.opetshop;

import br.edu.uniopet.Reader;

public class MenuOpetShop {

	static int opcao = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println("_______________\n");
			System.out.println("MENU");
			System.out.println("________________\n");

			System.out.println("Escolha uma opção\n");

			System.out.println("1 - Cadastrar");
			System.out.println("2 - Alterar");
			System.out.println("3 - Excluir");
			System.out.println("0 - Sair");

			opcao = Reader.readIntNotNull("ESCOLHA UMA OPÇÃO");

		} while (opcao != 0);
		switch (opcao) {
		case 1:
			System.out.println("Incluir cliente");
			break;
		case 2:
			System.out.println("Alterar cliente");
			break;
		case 3:
			System.out.println("Excluir cliente");
			break;
		case 0:
			System.out.println("Sair");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

//		 if (opcao == 1) {
//		 System.out.println("\nIncluir");
//		 }else if (opcao == 2) {
//		 System.out.println("\nAlterar");
//		 }else if (opcao == 3) {
//		 System.out.println("\nExcluir");
//		 }else if (opcao == 0){
//		 System.out.println("\nSair");
//		 }else {
//		 System.out.println("Opção inválida.");
//		 }

	}

}

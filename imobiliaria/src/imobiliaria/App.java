package imobiliaria;

import java.util.Scanner;
import classes.*;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Imobiliaria imobiliaria = new Imobiliaria();

		int opcao = 0;

		
		System.out.println("Bem vindo à imobiliária!");
		System.out.println();
		System.out.println("==========================");
		System.out.println();
		
		do {
			System.out.println("Digite 1 para adicionar um novo imóvel;");
			System.out.println();
			System.out.println("Digite 2 para listar os imóveis disponíveis;");
			System.out.println();
			System.out.println("Digite 3 para listar os imóveis de acordo com uma condição;");
			System.out.println();
			System.out.println("Digite 4 para modificar o preço de um um imóvel já existente;");
			System.out.println();
			System.out.println("Digite 5 para excluir um imóvel cadastrado;");
			System.out.println();
			System.out.println("Digite 0 para sair.");
			System.out.println();
			System.out.println("==========================");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				imobiliaria.adicionaImovel(sc);
				break;
			case 2:
				imobiliaria.listagemImoveis();
				break;
			case 3:
				imobiliaria.listagemPorCondicao(sc);
				break;
			case 4:
				imobiliaria.modificarImovel(sc);
				break;
			case 5:
				imobiliaria.removerImovel(sc);
			case 0:
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while(opcao != 0);
}
}
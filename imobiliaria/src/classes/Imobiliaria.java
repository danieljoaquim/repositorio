package classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Imobiliaria {

	private List<Imovel> listaDeImoveis;

	public Imobiliaria() {
		listaDeImoveis = new ArrayList<>();
	}

	// Adiciona imóveis em uma lista
	public void adicionaImovel(Scanner sc) {

		System.out.println("Informe o código do imóvel");
		int codigo = sc.nextInt();

		System.out.println("Informe o número de quartos");
		int numeroQuartos = sc.nextInt();

		System.out.println("Informe a área construída");
		float areaConstruida = sc.nextFloat();

		System.out.println("Informe a área total");
		float areaTotal = sc.nextFloat();

		System.out.println("Informe o valor do imovel");
		float preco = sc.nextFloat();

		System.out.println("Informa o tipo do imóvel, sendo 1 para apartamento e 0 para casa.");
		int tipo = sc.nextInt();

		sc.nextLine(); // Evita erro de leitura nas próximas linhas

		System.out.println("Qual a cidade que o imóvel se localiza?");
		String cidade = sc.nextLine();

		System.out.println("Qual o bairo que o imóvel se localiza?");
		String bairro = sc.nextLine();

		Endereco end = new Endereco(cidade, bairro);
		Imovel imovel = new Imovel(codigo, numeroQuartos, tipo, areaConstruida, areaTotal, preco, end);
		listaDeImoveis.add(imovel);
	}

	// Lista todos os imóveis
	public void listagemImoveis() {

		int indice = 0;

		for (Imovel elemento : listaDeImoveis) {

			indice++;

			System.out.println("Imóvel " + indice);
			System.out.println("Código do imóvel:" + elemento.getCodigo());
			System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
			System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
			System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
			System.out.println("Valor: " + elemento.getPreco());
			System.out.println("Tipo do imóvel: " + elemento.getTipo());
			System.out.println("Cidade: " + elemento.getCidade());
			System.out.println("Bairro: " + elemento.getBairro());
			System.out.println();

		}
	}

	// Lista os imóveis a partir de um filtro selecionado pelo usuário
	public void listagemPorCondicao(Scanner sc) {
		System.out.println("Qual o filtro você deseja adicionar?");
		System.out.println("Para filtrar por tipo de imóvel, digite 1");
		System.out.println("Para filtrar pelo valor,  digite 2.");
		System.out.println("Para filtrar por número de quartos, digite 3");
		System.out.println("Para filtrar por cidade, digite 4");
		System.out.println("Para filtrar por bairro, digite 5");

		int opcao;
		opcao = sc.nextInt();

		if (opcao == 1) {

			System.out.println("Digite 1 para apartamento ou 0 para casa:");
			opcao = sc.nextInt();

			for (Imovel elemento : listaDeImoveis) {

				if (elemento.getTipo() == opcao) {
					System.out.println("Código do imóvel:" + elemento.getCodigo());
					System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
					System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
					System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
					System.out.println("Valor: " + elemento.getPreco());
					System.out.println("Tipo do imóvel: " + elemento.getTipo());
					System.out.println("Cidade: " + elemento.getCidade());
					System.out.println("Bairro: " + elemento.getBairro());
					System.out.println();
				}

			}

		} else if (opcao == 2) {

			System.out.println("Qual a faixa de valor que você procura?");
			System.out.println("1 -> 0 - 100.000");
			System.out.println("2 -> 100.000 - 200.000");
			System.out.println("3 -> 200.000 - 500.000");
			System.out.println("4 -> A partir de 500.000");

			int escolha = 0;

			escolha = sc.nextInt();

			if (escolha == 1) {
				for (Imovel elemento : listaDeImoveis) {
					if (elemento.getPreco() <= 100000) {
						System.out.println("Código do imóvel:" + elemento.getCodigo());
						System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
						System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
						System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
						System.out.println("Valor: " + elemento.getPreco());
						System.out.println("Tipo do imóvel: " + elemento.getTipo());
						System.out.println("Cidade: " + elemento.getCidade());
						System.out.println("Bairro: " + elemento.getBairro());
						System.out.println();
					}
				}

			} else if (escolha == 2) {
				for (Imovel elemento : listaDeImoveis) {
					if (elemento.getPreco() > 100000 && elemento.getPreco() < 200000) {
						
						System.out.println("Código do imóvel:" + elemento.getCodigo());
						System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
						System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
						System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
						System.out.println("Valor: " + elemento.getPreco());
						System.out.println("Tipo do imóvel: " + elemento.getTipo());
						System.out.println("Cidade: " + elemento.getCidade());
						System.out.println("Bairro: " + elemento.getBairro());
						System.out.println();
					}
				}

			} else if (escolha == 3) {
				for (Imovel elemento : listaDeImoveis) {
					if (elemento.getPreco() > 200000 && elemento.getPreco() < 500000) {
						System.out.println("Código do imóvel:" + elemento.getCodigo());
						System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
						System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
						System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
						System.out.println("Valor: " + elemento.getPreco());
						System.out.println("Tipo do imóvel: " + elemento.getTipo());
						System.out.println("Cidade: " + elemento.getCidade());
						System.out.println("Bairro: " + elemento.getBairro());
						System.out.println();

					}

				}

			} else if (escolha == 4) {
				for (Imovel elemento : listaDeImoveis) {
					if (elemento.getPreco() > 500000) {
						System.out.println("Código do imóvel:" + elemento.getCodigo());
						System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
						System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
						System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
						System.out.println("Valor: " + elemento.getPreco());
						System.out.println("Tipo do imóvel: " + elemento.getTipo());
						System.out.println("Cidade: " + elemento.getCidade());
						System.out.println("Bairro: " + elemento.getBairro());
						System.out.println();
					}
				}
			}
		} else if (opcao == 3) {
			int quarto = 0;

			System.out.println("Qual o número mínimo de quartos que o seu imóvel deve ter?");
			quarto = sc.nextInt();

			for (Imovel elemento : listaDeImoveis) {
				if (quarto <= elemento.getNumeroQuartos())
					System.out.println("Código do imóvel:" + elemento.getCodigo());
				System.out.println("Código do imóvel:" + elemento.getCodigo());
				System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
				System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
				System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
				System.out.println("Valor: " + elemento.getPreco());
				System.out.println("Tipo do imóvel: " + elemento.getTipo());
				System.out.println("Cidade: " + elemento.getCidade());
				System.out.println("Bairro: " + elemento.getBairro());
				System.out.println();
			}
		} else if (opcao == 4) {
			// HashSet é uma ferramenta da linguagem Java que não permite adição de
			// informação
			// duplicada em uma coleção
			Set<String> cidades = new HashSet<>();

			for (Imovel elemento : listaDeImoveis) {
				cidades.add(elemento.getCidade());
			}

			List<String> listaCidades = new ArrayList<>(cidades);

			for (String integrante : listaCidades) {
				System.out.println(integrante);
			}

			String cidade;
			System.out.println("Qual a cidade escolhida?");
			sc.nextLine();
			cidade = sc.nextLine();

			for (Imovel elemento : listaDeImoveis) {
				if (elemento.getCidade().equalsIgnoreCase(cidade)) {
					System.out.println("Código do imóvel:" + elemento.getCodigo());
					System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
					System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
					System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
					System.out.println("Valor: " + elemento.getPreco());
					System.out.println("Tipo do imóvel: " + elemento.getTipo());
					System.out.println("Cidade: " + elemento.getCidade());
					System.out.println("Bairro: " + elemento.getBairro());
					System.out.println();
				}
			}

		}

		else if (opcao == 5) {
			Set<String> bairros = new HashSet<>();

			for (Imovel elemento : listaDeImoveis) {
				bairros.add(elemento.getBairro());
			}

			List<String> listaBairros = new ArrayList<>(bairros);

			for (String integrante2 : listaBairros) {
				System.out.println(integrante2);
			}

			String bairro;
			System.out.println("Qual o bairro escolhido?");
			sc.nextLine();
			bairro = sc.nextLine();

			for (Imovel elemento : listaDeImoveis) {
				if (elemento.getBairro().equalsIgnoreCase(bairro)) {
					System.out.println("Código do imóvel:" + elemento.getCodigo());
					System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
					System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
					System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
					System.out.println("Valor: " + elemento.getPreco());
					System.out.println("Tipo do imóvel: " + elemento.getTipo());
					System.out.println("Cidade: " + elemento.getCidade());
					System.out.println("Bairro: " + elemento.getBairro());
					System.out.println();
				}

			}
		}
	}

	public void removerImovel(Scanner sc) {
		System.out.println("Aqui estão os imóveis que podem ser removidos:");
		System.out.println();
		int indice2 = 0;
		for (Imovel elemento : listaDeImoveis) {

			indice2++;

			System.out.println("Imóvel " + indice2);
			System.out.println("Código do imóvel:" + elemento.getCodigo());
			System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
			System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
			System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
			System.out.println("Valor: " + elemento.getPreco());
			System.out.println("Cidade: " + elemento.getCidade());
			System.out.println("Bairro: " + elemento.getBairro());
			System.out.println();
		}

		int removeTemp;

		System.out.println("Qual imóvel você deseja remover? Digite o código do imóvel.");
		removeTemp = sc.nextInt();
		 
		Iterator<Imovel> iterador = listaDeImoveis.iterator();
		    while (iterador.hasNext()) {
		        Imovel imovel = iterador.next();
		        if (imovel.getCodigo() == removeTemp) {
		            iterador.remove(); 
		            break; 
		        }
		    }

		System.out.println("Lista de imóveis atualizada:");
		System.out.println();
		indice2 = 0;
		for (Imovel elemento : listaDeImoveis) {

			indice2++;

			System.out.println("Imóvel " + indice2);
			System.out.println("Código do imóvel:" + elemento.getCodigo());
			System.out.println("Número de quartos: " + elemento.getNumeroQuartos());
			System.out.println("Área construída do imóvel: " + elemento.getAreaConstruida());
			System.out.println("Área total do imóvel :" + elemento.getAreaTotal());
			System.out.println("Valor: " + elemento.getPreco());
			System.out.println("Cidade: " + elemento.getCidade());
			System.out.println("Bairro: " + elemento.getBairro());
			System.out.println();
		}

	}

	public void modificarImovel(Scanner sc) {
		System.out.println("Qual imóvel deseja modificar?");
		int codigoDesejado = sc.nextInt();

		for (Imovel imovel : listaDeImoveis) {
			if (codigoDesejado == imovel.getCodigo()) {

				System.out.println("Informe o valor do imovel");
				float precoAtualizado = sc.nextFloat();
				imovel.setPreco(precoAtualizado);
			}
		}
	}

}

package projeto_final_bloco_01.menu;

import java.util.Scanner;

import Model.ProdutoEscolar;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, quantidade, tipoPagamento;
		float valor, valorTotal;
		boolean continuar;
		String nome;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("             PONTO E VÍRGULA PAPELARIA               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                       ");
			System.out.println("            2 - Pesquisar produto                    ");
			System.out.println("            3 - Listar Produtos                             ");
			System.out.println("            4 - Atualizar Cadastro                   ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				System.out.println("\nPonto e Vírgula Papelaria - Volte Sempre!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Cadastro\n\n");
				
				//Teste 
				ProdutoEscolar produto1 = new ProdutoEscolar(
						1,
						"Caderno Inteligente",
						45.90f,
						10,
						"Matemática"
					);

					produto1.visualizar();
				

				break;
			case 2:
				System.out.println("Pesquisar Produto\n\n");

				break;
			case 3:
				System.out.println("Carrinho de Compras\n\n");

				break;
			case 4:
				System.out.println("Atualizar Cadastro\n\n");

				break;
			case 5:
				System.out.println("Apagar o Cadastro\n\n");
				
				break;

	}
		}
	}
}




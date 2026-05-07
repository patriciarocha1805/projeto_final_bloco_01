package projeto_final_bloco_01.menu;

import java.util.Scanner;
import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.ProdutoEscolar;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);

	private static ProdutoController produtoController = new ProdutoController();

	public static void main(String[] args) {
		
		int opcao;
		
		// Teste Controller 
		ProdutoEscolar produto1 = new ProdutoEscolar(1, "Caderno de Desenho", 30.00f, 2, "Artes");
		produtoController.cadastrar(produto1);

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("             PONTO E VÍRGULA PAPELARIA               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Pesquisar produto                    ");
			System.out.println("            3 - Listar Produtos                      ");
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
				
				produto1.visualizar(); 
			    produtoController.cadastrar(produto1);
				keyPress();
				break;
				
			case 2:
				System.out.println("Pesquisar Produto\n\n");
				procurarProdutoPorCodigo();
				keyPress();
				break;
				
			case 3:
				System.out.println("Listar Produtos\n\n");
				produtoController.listarTodos();
				keyPress();
				break;
				
			case 4:
				System.out.println("Atualizar Cadastro\n\n");
				atualizarProduto();
				keyPress();
				break;
				
			case 5:
				System.out.println("Apagar o Cadastro\n\n");
				apagarProduto();
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!");
				keyPress();
				break;
			}
		}
	}
	
	public static void keyPress() {
		System.out.println("Pressione Enter para Continuar ...");
		leia.nextLine();
	}
	
	private static void procurarProdutoPorCodigo() {
	    System.out.print("Digite o código do produto: ");
	    int numero = leia.nextInt();
	    
	    produtoController.procurarPorCodigo(numero); 
	}
	
	private static void atualizarProduto() {
	    System.out.println("Digite o código do produto: ");
	    int codigo = leia.nextInt();
	    leia.nextLine();

	    var buscaProduto = produtoController.buscarNaCollection(codigo);

	    if (buscaProduto != null) {
	        System.out.println("Digite o novo Nome: ");
	        String nome = leia.nextLine();
	        System.out.println("Digite o novo Preço: ");
	        float preco = leia.nextFloat();
	        System.out.println("Digite a nova Quantidade: ");
	        int qtd = leia.nextInt();
	        
	        produtoController.atualizar(new ProdutoEscolar(codigo, nome, preco, qtd, "Artes"));
	    } else {
	        System.out.println("Produto não encontrado!");
	    }
	}
	
	private static void apagarProduto() {
		System.out.println("Digite o código do produto: ");
		int codigo = leia.nextInt();
		leia.nextLine();
		
		System.out.println("\nTem certeza que deseja excluir? (S/N): ");
		String confirmacao = leia.nextLine();
		
		if (confirmacao.equalsIgnoreCase("S")) {
			produtoController.deletar(codigo);
		} else {
			System.out.println("\nOperação cancelada.");
		}
	}
}
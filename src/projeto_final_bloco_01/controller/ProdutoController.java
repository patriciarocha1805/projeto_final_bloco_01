package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.List;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.Repository;

public class ProdutoController implements Repository {

	private List<Produto> listaProdutos = new ArrayList<Produto>();

	@Override
	public void procurarPorCodigo(int codigo) {
		var produto = buscarNaCollection(codigo);
		
		if (produto != null) {
			produto.visualizar();
		} else {
			System.out.println("Produto não encontrado!");
		}
		
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O produto foi cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getCodigo());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("Produto atualizado com sucesso!");
		}else {
			System.out.println("Produto não encontrado!");
		}
		
	}

	@Override
	public void deletar(int codigo) {
		var produto = buscarNaCollection(codigo);
		
		if (produto != null) {
			if(listaProdutos.remove(produto) == true) {
				System.out.println("Produto deletado com sucesso!");
			}
			} else {
				System.out.println("Produto não encontrado!");
			}
		
		
	}
	
	public Produto buscarNaCollection(int codigo) {

		for (var produto : listaProdutos) {

			if (produto.getCodigo() == codigo) {
				return produto;
			}

		}

		return null;

	}

	

}
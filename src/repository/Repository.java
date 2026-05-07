package repository;

import Model.Produto;

public interface Repository {
	
	public void procurarPorCodigo(int codigo);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar (int codigo);

}

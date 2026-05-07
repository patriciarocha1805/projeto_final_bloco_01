package projeto_final_bloco_01.repository;

import projeto_final_bloco_01.model.Produto;

public interface Repository {
	
	public void procurarPorCodigo(int codigo);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar (int codigo);

}

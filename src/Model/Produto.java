package Model;

public abstract class Produto {
	
	private int codigo;
	private String nome;
	private float preco;
	private int quantidade;
	
	public Produto (int codigo, String nome, float preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void visualizar () {
	System.out.println("\n\n***********************************************************");
	System.out.println("Dados do Produto:");
	System.out.println("***********************************************************");
	System.out.println("Código do produto: " + this.codigo);
	System.out.println("Nome: " + this.nome);
	System.out.println("Preço: " + this.preco);
	System.out.println("Quantidade: " + this.quantidade);
	}

}

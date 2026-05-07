package Model;

public class ProdutoEscolar extends Produto {
	
	private String materia;

	public ProdutoEscolar(int codigo, String nome, float preco, int quantidade, String materia) {
		super(codigo, nome, preco, quantidade);
		this.materia = materia;
		
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Matéria: " + this.materia);
	}

}

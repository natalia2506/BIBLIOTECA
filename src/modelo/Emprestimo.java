package modelo;

public class Emprestimo {
	
	private int id;
	private String data_emprestimo;
	private String data_devolucao;
	
	Usuario usuario;
	Livros livro;
	
	public Emprestimo() {
	
	}


	public Emprestimo(int id, String data_emprestimo, String data_devolucao, Usuario usuario, Livros livro) {
		super();
		this.id = id;
		this.data_emprestimo = data_emprestimo;
		this.data_devolucao = data_devolucao;
		this.usuario = usuario;
		this.livro = livro;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getData_emprestimo() {
		return data_emprestimo;
	}


	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}


	public String getData_devolucao() {
		return data_devolucao;
	}


	public void setData_devolucao(String data_devolucao) {
		this.data_devolucao = data_devolucao;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Livros getLivros() {
		return livro;
	}


	public void setLivros(Livros livro) {
		this.livro = livro;
	}


	@Override
	public String toString() {
		return "Emprestimo [id=" + id + ", data_emprestimo=" + data_emprestimo + ", data_devolucao=" + data_devolucao
				+ ", usuario=" + usuario + "]";
	}
	
	
	
	
	

}

package modelo;

public class Livros {
	
	private int id;
	private String titulo;
	private String genero;
	private String editora;
	private int paginas;
	private double valor_multa;
	
	public Livros() {
		super();
	}

	public Livros(int id, String titulo, String genero, String editora, int paginas, double valor_multa) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.editora = editora;
		this.paginas = paginas;
		this.valor_multa = valor_multa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public double getValor_multa() {
		return valor_multa;
	}

	public void setValor_multa(double valor_multa) {
		this.valor_multa = valor_multa;
	}

	@Override
	public String toString() {
		return "Livros [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", editora=" + editora + ", paginas="
				+ paginas + ", valor_multa=" + valor_multa + "]";
	}
	
	

}

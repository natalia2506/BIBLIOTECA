package modelo;

public class Principal {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(1, "Anna", "125487855", "anna@gmail.com");
		Usuario u2 = new Usuario(2, "João", "258845888", "joao@gmail.com");
		
		Livros l1 = new Livros(1, "Guerra dos Mundos", "Ficção", "atlas", 350, 0);
		Livros l2 = new Livros(2, "Harry Poter", "magia", "alfa", 350, 0);
		
		Emprestimo e1 = new Emprestimo(1, "12/02/2022", "15/02/2022", u1, l1);
		Emprestimo e2 = new Emprestimo(2, "15/02/2022", "19/02/2022", u2, l2);
		
		System.out.println(e1);
		System.out.println(e2);
		
		
		System.out.println("\nUsuario " + e2.getUsuario().getNome() + " pegou emprestado o livro " + e2.getLivros().getTitulo() 
				+ " e devolveu no dia " + e2.getData_devolucao());
		
		System.out.println("\nUsuario " + e1.getUsuario().getNome() + " pegou emprestado o livro " + e1.getLivros().getTitulo() 
				+ " e devolveu no dia " + e1.getData_devolucao());
		
		
		

	}

}

package Biblioteca;

public class Main {

    public static void main(String[] args) {

        Livros livro1 = new Livros();
        Livros livro2 = new Livros();
        Livros livro3 = new Livros();
        Livros livro4 = new Livros();
        Livros livro5 = new Livros();

        //provavelmente aqui é pra dar overload, descobrir como / descobrir se oq eu fiz foi um overload

        livro1.registrarLivro(livro1.getIsbn());
        livro2.registrarLivro(livro2.getIsbn(),livro2.getNome());
        livro3.registrarLivro(livro3.getIsbn(), livro3.getNome(), livro3.getGenero());
        livro4.registrarLivro(livro4.getIsbn(), livro4.getNome(), livro4.getGenero(), livro4.getAutor());
        livro5.registrarLivro(livro5.getIsbn(), livro5.getNome(), livro5.getGenero(), livro5.getAutor());

        livro1.detalhesLivro(livro1.getIsbn());
        System.out.println("------");
        livro2.detalhesLivro(livro2.getIsbn(),livro2.getNome());
        System.out.println("------");
        livro3.detalhesLivro(livro3.getIsbn(), livro3.getNome(), livro3.getGenero());
        System.out.println("------");
        livro4.detalhesLivro(livro4.getIsbn(), livro4.getNome(), livro4.getGenero(), livro4.getAutor());
        System.out.println("------");
        livro5.detalhesLivro(livro5.getIsbn(), livro5.getNome(), livro5.getGenero(), livro5.getAutor());
    }
}

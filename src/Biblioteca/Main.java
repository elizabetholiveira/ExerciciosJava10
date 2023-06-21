package Biblioteca;

public class Main {

    public static void main(String[] args) {

        Livros livro1 = new Livros();

        //provavelmente aqui é pra dar overload, descobrir como
        livro1.registrarLivro(livro1.getIsbn(), livro1.getNome(), livro1.getGenero(), livro1.getAutor());
    }
}

package Biblioteca;

import java.util.Scanner;

public class Livros {

    //dar uma forma de converter genero em lista
    private String genero;
    private String nome;
    private String isbn;
    private String autor;

    Scanner resposta = new Scanner(System.in);
    public void registrarLivro(String isbn){
        System.out.println("Qual o ISBN do livro?");
        setIsbn(resposta.next());
        System.out.println("O livro foi registrado com o ISBN " + getIsbn());
    };
    public void registrarLivro(String isbn, String nome){
        System.out.println("Qual o ISBN do livro?");
        setIsbn(resposta.next());
        System.out.println("Qual o nome do livro?");
        setNome(resposta.next());
        System.out.println("O livro foi registrado com o ISBN " + getIsbn() + " e o nome " + getNome());
    };
    public void registrarLivro(String isbn, String nome, String genero){
        System.out.println("Qual o ISBN do livro?");
        setIsbn(resposta.next());
        System.out.println("Qual o nome do livro?");
        setNome(resposta.next());
        System.out.println("Qual o gênero do livro?");
        setGenero(resposta.next());
        System.out.println("O livro foi registrado com o ISBN " + getIsbn() + ", o nome " + getNome() + " e o gênero " + getGenero());
    };
    public void registrarLivro(String isbn, String nome, String genero, String autor){
        System.out.println("Qual o ISBN do livro?");
        setIsbn(resposta.next());
        System.out.println("Qual o nome do livro?");
        setNome(resposta.next());
        System.out.println("Qual o gênero do livro?");
        setGenero(resposta.next());
        System.out.println("Quem é o autor do livro?");
        setAutor(resposta.next());
        System.out.println("O livro foi registrado com todos os atributos");
    };

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

public class Biblioteca {
    String nome;
    String endereco;
    Livro livro;
    void adicionarLivro(Livro livro)
    {

        livro.titulo = " LivroA ";
        System.out.println("Adicionar livro" + livro.titulo);
    }

    void removerLivro(Livro livro)
    {

        System.out.println("Remover livro" + livro.titulo);
    }

  void listarLivro(Livro livro){

      System.out.printf("Listar livros" + livro.titulo);
    }
}
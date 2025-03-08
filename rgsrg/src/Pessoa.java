public class Pessoa {
    String nome;
    int idade;

    void emprestarLivro(Livro livro)
    {
        livro.emprestar();
        System.out.println("Emprestar livro" + livro.titulo);

    }
    void devolverLivro(Livro livro)
    {
        livro.devolver();
        System.out.println("Devolver livro"  + livro.titulo);
    }

    void listarLivroEmprestado(Livro livro)
    {

    }
}
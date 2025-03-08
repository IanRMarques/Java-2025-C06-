public class Autor {
    String nome;
    String nacionalidade;
    Livro livro;
    Livro escreverLivro(String titulo)
    {
        livro.titulo = titulo;
        return livro;
    }

    String obterBiografia()
    {
        return "BIOGRAFIA" + livro.titulo ;
    }

}
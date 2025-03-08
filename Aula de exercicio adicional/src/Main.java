public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.nome = "Ian";
        Livro livro1 = new Livro();
        autor1.livro = livro1;

        livro1.titulo = " Titulo do livro";
        livro1.autor = autor1;
        autor1.nome = "Ian";

        autor1.obterBiografia();
        System.out.println(autor1.obterBiografia());
        livro1.detalhes();
        autor1.escreverLivro(livro1.titulo);
        livro1.biblioteca.adicionarLivro(livro1);
        livro1.biblioteca.removerLivro(livro1);
        livro1.emprestar();
        livro1.devolver();
        livro1.biblioteca.listarLivro(livro1);

    }
}











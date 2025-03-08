public class Livro {

    String titulo;
    Autor autor;
    Biblioteca biblioteca;

    void emprestar()
    {

        System.out.println("Emprestar livro" + titulo);

    }

    void devolver()
    {
        System.out.println("Devolver livro" + titulo);
    }

    String detalhes()
    {
        System.out.println("Detalhes do livro");
        return titulo;
    }
    public Livro()
    {
        biblioteca = new Biblioteca();
    }
}

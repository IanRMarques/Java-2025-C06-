public class Cantina {
        String nome;
        Salgado salgados[] = new Salgado[3];

        void addSalgados(Salgado salgado)
        {
            for (int x = 0; x < salgados.length; x++) {
                if (salgados[x] == null) {
                    salgados[x] = salgado;
                    break;
                }
            }
        }
        void mostrarInfo()
        {
            for (int x = 0; x <salgados.length; x++) {
                if (salgados[x] != null)
                {
                    System.out.println(salgados[x].nome);
                }
            }
        }
    }


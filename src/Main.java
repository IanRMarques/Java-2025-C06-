public class Main {
    public static void main(String[] args) {
        Cantina cantinaDoInatel= new Cantina();

        Salgado s1 = new Salgado();
        s1.nome = "Hamburguer";
        Salgado s2 = new Salgado();
        s2.nome = "pão de queijo";
        Salgado s3 = new Salgado();
        s3.nome = "Coxinha";

        cantinaDoInatel.addSalgados(s1);
        cantinaDoInatel.addSalgados(s2);
       // cantinaDoInatel.addSalgados(s3);
        cantinaDoInatel.mostrarInfo();
    }
}
package Montagem.Dos.computadores;

public class Computador {
    private String marca;
    private Float preco;
    private MemoriaUSB musb;
    private SistemaOperacional so;
    private HardwareBasico hb;

    public Computador() {
        so = new SistemaOperacional();
        hb = new HardwareBasico();
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void setSo(SistemaOperacional so) {
        this.so = so;
    }

    public SistemaOperacional getSistemaOperacional() {
        return so;
    }

    public HardwareBasico getHardwareBasico() {
        return hb;
    }

    public void setHb(String nome, float capacidade) {
        this.hb.setNome(nome);
        this.hb.setCapacidade(capacidade);
    }

    public void setMusb(String nome, int capacidade) {
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preco);
        System.out.println("Processador: " + hb.getNome());
        System.out.println(hb.getCapacidade() + " Gb de memória RAM");
        System.out.printf("Sistema operacional: " + so.getNome());
        System.out.println(" " + so.getTipo() + " Bits");
        System.out.printf(musb.getNome());
        System.out.println(" " + musb.getCapacidade() + "Gb");
    }

    public void setSo(String nome, int tipo) {
        this.so.setNome(nome);
        this.so.setTipo(tipo);
    }
}
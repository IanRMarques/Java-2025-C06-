package Clientes;

import Montagem.Dos.computadores.Computador;

public class Cliente {

    private String nome;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    private Long cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float calculaTotalCompra(Computador computador) {

        return computador.getPreco();
    }
}

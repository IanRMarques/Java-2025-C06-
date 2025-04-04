package Clientes;

import Montagem.Dos.computadores.Computador;

public class Cliente {
    public Computador[] computadoresComprados = new Computador[10];
    public int numComputadores = 0;
    private String nome;
    private Long cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }


    public float calculaTotalCompra() {
        float total = 0f;
        for (int i = 0; i < numComputadores; i++) {
            if (computadoresComprados[i] != null && computadoresComprados[i].getPreco() != null) {
                total += computadoresComprados[i].getPreco();
            }
        }
        return total;
    }

}

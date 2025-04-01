package Clientes;

import Montagem.Dos.computadores.Computador;

public class Cliente {
    private String nome;
    private Long cpf;

    Float calculaTotalCompra(Computador computador){
        return this.getpreco();

    }

    private Float getpreco() {
        return 0f;
        //o próprio intellij recomendou fazer isso
    }
}
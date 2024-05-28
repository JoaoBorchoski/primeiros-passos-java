package com.primeiro.primeiro_app_springboot;

import java.util.UUID;

public class PacienteModel {
    private UUID id;
    private String nome;
    private int idade;
    private String endereco;

    private PacienteModel(String nome, int idade, String endereco) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

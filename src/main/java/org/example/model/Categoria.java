package org.example.model;

public class Categoria {
    private int codigo = 1;
    private String nome;

    public Categoria(String nome){
        this.nome = nome;
        this.codigo+=1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

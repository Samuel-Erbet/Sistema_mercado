package org.example.model;

import java.util.ArrayList;

public class Categoria {
    private static int count = 0;
    private int codigo = 0;
    private String nome;
    private ArrayList<Item> itens;

    public Categoria(String nome){
        this.nome = nome;
        this.codigo=++count;
        this.itens = new ArrayList<>();
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

    public void adicionarACategoria(Item item){
        itens.add(item);
    }

    public void removerDaCategoria(Item item){
        itens.remove(item);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "codigo "+codigo+" categoria "+nome;

    }
}

package org.example.model;

import java.util.ArrayList;

public class Mercado {
    private String nome;
    private ArrayList<Categoria> categorias;
    private ArrayList<Item> itens;



    public Mercado(String nome){
        this.categorias = new ArrayList<>();
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void adicionarItem( Item item){
        itens.add(item);

    }

    public void removerItem(int codigo){
        System.out.println(itens.get(codigo).getNome()+" foi removido");
        itens.remove(codigo);
    }

    public void adicionarCategoria(Categoria categoria){
        categorias.add(categoria);
    }

    public void removerCategoria(int codigo){
        System.out.println(categorias.get(codigo).getNome()+" foi removido");
        categorias.remove(codigo);
    }

    public void mostrarCategorias(){
        for (int i = 0; i<categorias.size(); i++){
            System.out.println(categorias.get(i).getNome());
        }
    }
}

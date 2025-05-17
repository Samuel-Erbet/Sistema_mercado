package org.example;

import org.example.model.Categoria;
import org.example.model.Item;
import org.example.model.Mercado;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Categoria alimentos = new Categoria("alimentos");
        Categoria bebida = new Categoria("bebida");

        Item doritos = new Item("doritos", 9.50);
        Item pao = new Item("pão de forma", 7.50);

        Item pepsi = new Item("pepsi", 10.40);
        Item cocaCola = new Item("coca cola",10.50);

        Mercado bh = new Mercado("BH");

        bh.adicionarCategoria(alimentos);
        bh.adicionarCategoria(bebida);

        //criando alimentos
        bh.adicionarItem(doritos);
        bh.adicionarItem(pao);

        //criando bebidas
        bh.adicionarItem(cocaCola);
        bh.adicionarItem(pepsi);


        //adicionando alimentos a categoria
        alimentos.adicionarACategoria(doritos);
        alimentos.adicionarACategoria(pao);

        //adicionando bebidas a categoria
        bebida.adicionarACategoria(pepsi);
        bebida.adicionarACategoria(cocaCola);

        bh.adicionarItem(doritos);

        bh.mostrarCategorias();
        bh.mostrarProdutos(1);
    }
}
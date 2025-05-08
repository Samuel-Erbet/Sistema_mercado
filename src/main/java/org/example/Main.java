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
        Item cocaCola = new Item("coca cola",10.50);

        Mercado bh = new Mercado("BH");

        bh.adicionarCategoria(alimentos);
        bh.adicionarCategoria(bebida);
        bh.adicionarItem(doritos);
        bh.adicionarItem(cocaCola);

        bh.removerCategoria(0);

    }
}
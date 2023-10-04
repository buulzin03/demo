package com.example.tipoOrdenacao;

import java.util.Comparator;

import com.example.Product;

public class OrderByNameD implements Comparator<Product>{
    
    public int compare(Product p1, Product p2){
        return p2.getNome().compareTo(p1.getNome());
    }
}

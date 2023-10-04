package com.example.tipoOrdenacao;

import java.util.Comparator;

import com.example.Product;

public class OrderByName implements Comparator<Product> {

    public int compare(Product c1, Product c2) {
        return c1.getNome().compareTo(c2.getNome());
    }

    
    
}
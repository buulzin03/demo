package com.example.tipoOrdenacao;

import java.util.Comparator;

import com.example.Product;

public class OrderByDescript implements Comparator<Product> {
    
    public int compare(Product c1, Product c2){
        return c1.getDescription().compareTo(c2.getDescription());
    }
}
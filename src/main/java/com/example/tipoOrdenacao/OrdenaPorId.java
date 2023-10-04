package com.example.tipoOrdenacao;

import java.util.Comparator;

import com.example.Product;

public class OrdenaPorId implements Comparator<Product>{

    public int compare(Product c1, Product c2){
        return Integer.compare(c1.getId(), c2.getId());
    }
    
}
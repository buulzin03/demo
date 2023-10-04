package com.example.tipoOrdenacao;

import java.util.Comparator;

import com.example.Product;

public class OrderByPrice implements Comparator<Product>{
    
    public int compare(Product c1, Product c2){
        return Double.compare(c1.getSale_price(), c2.getSale_price());
    }
}

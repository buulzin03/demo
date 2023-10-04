package com.example.tipoOrdenacao;

import java.util.Comparator;

import com.example.Product;

public class OrderByPriceD implements Comparator<Product>{
    public int compare(Product c1, Product c2){
        return Double.compare(c2.getSale_price(), c1.getSale_price());
    }
}

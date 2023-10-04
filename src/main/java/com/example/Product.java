package com.example;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product implements Serializable , Comparable<Product>{
    private String nome;
    private int id;
    private String category;
    private String sub_category;
    private String brand;
    private double sale_price;
    private double market_price;
    private String type;
    private double rating;
    private String description;

    public Product(int id){
        this.id = id;
    }
    public Product(){}
    public Product(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", price=" + sale_price + "]";
    }
    
    
    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id, o.getId());
    }
    
    

    

}

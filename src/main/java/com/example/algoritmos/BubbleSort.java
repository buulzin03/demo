package com.example.algoritmos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.Product;

public class BubbleSort {
    
    
    public static void sort(List<Product> clientes, Comparator<? super Product> c){
        boolean troca = true;

        
            while (troca) {
                troca = false;
                for (int i = 0; i < clientes.size() - 1; i++) {
                    if (c.compare(clientes.get(i), clientes.get(i + 1)) > 0) {
                        Collections.swap(clientes, i, i+1);
                        troca = true;
                    }
                }
            }
        
       
    }

    
}

package com.example.algoritmos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.Product;

public class SelectionSort {
    
    public static void sort(List<Product> clientes, Comparator<? super Product> c){  
        for (int i = 0; i < clientes.size() - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < clientes.size(); j++){  
                if (c.compare(clientes.get(j), clientes.get(index)) < 0){  
                    index = j;//searching for lowest index  
                }  
            }  
            Collections.swap(clientes, index, i);
        }  

    }
}
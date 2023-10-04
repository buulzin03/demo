package com.example.algoritmos;

import java.util.Comparator;
import java.util.List;

import com.example.Product;

public class InsertSortion {
    
    public static void sort(List<Product> clientes, Comparator<? super Product> c) {
        Product cliente;
        int j;
        for (int i = 1; i < clientes.size(); i++) { 
            
            cliente = clientes.get(i);
            j = i - 1;
            while (j >= 0 && c.compare(clientes.get(j), cliente) > 0) {
                clientes.set(j + 1, clientes.get(j));
                j -= 1;
            }
            clientes.set(j+1, cliente);
        
        }	
    }

}
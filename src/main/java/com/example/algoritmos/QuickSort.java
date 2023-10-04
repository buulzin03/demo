package com.example.algoritmos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.Product;

public class QuickSort {

    public static int partition(List<Product> clientes, int left, int right, Comparator<? super Product> c) {
        
        Product pivot = clientes.get(left);
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (c.compare(clientes.get(j), pivot) <= 0 ) {
                i+=1;
                Collections.swap(clientes, i, j);
            }
        }

        // troca pivot (values[left]) com i.
        Collections.swap(clientes, left, i);
        
        return i; 
    }

    public static void quickSort(List<Product> clientes, int left, int right, Comparator<? super Product> c) {
        if (left < right) {
            int index_pivot = partition(clientes, left, right, c);
            quickSort(clientes, left, index_pivot - 1, c);
            quickSort(clientes, index_pivot + 1, right, c);	
        }
    }
}
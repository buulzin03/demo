package com.example.algoritmos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.example.Product;

public class MergeSort {

    public static void sort(List<Product> clientes, Comparator<? super Product> c) {
        if (clientes == null || clientes.size() < 2) {
            return;
        }
        mergeSort(clientes, 0, (clientes.size() - 1), c);
    }

    private static void mergeSort(List<Product> clientes, int start, int end, Comparator<? super Product> c) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(clientes, start, mid, c);
            mergeSort(clientes, mid + 1, end, c);
            merge(clientes, start, mid, end, c);
        }
    }

    private static void merge(List<Product> clientes, int start, int mid, int end, Comparator<? super Product> c) {
        List<Product> temp = new ArrayList<>();
            
       
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (c.compare(clientes.get(i), clientes.get(j)) <= 0) {
                temp.add(clientes.get(i));                
                i++;
            } else {
                temp.add(clientes.get(j));
                j++;
            }
        }
        while (i <= mid) {
            temp.add(clientes.get(i));
            i++;
        }
        while (j <= end) {
            temp.add(clientes.get(j));
            j++;
        }
        for (i = 0; i < temp.size(); i++) {
            clientes.set(i + start, temp.get(i));
        }
    }
}


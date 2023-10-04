package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.algoritmos.QuickSort;
import com.example.tipoOrdenacao.OrderByPriceD;




public class App 
{
    public static void main( String[] args ){
        //Verificando o tempo inicial da aplicação
        long tempoInicial = System.currentTimeMillis();
        String path = "C:\\Users\\USER\\Documents\\Java\\TrabalhoEd2\\Teste\\demo\\poco2.csv";

        List<Product> clientes = new ArrayList<>();
        // Carregando o arquivo CSV
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();
            line = br.readLine();
            // Lendo linha por linha do arquivo    
            while(line!=null) {
                String[] vet = line.split(";");

                String datas = vet[0];
                Double price = Double.parseDouble(vet[1]);
                String description = vet[2];
               

                Product cliente = new Product();
                cliente.setNome(datas);
                cliente.setSale_price(price);
                cliente.setDescription(description);
                clientes.add(cliente);

                line = br.readLine();
            }
        
        } catch (Exception e) {
            System.out.println("Erro gerado: " + e.getMessage());
        }

    //    InsertSortion.sort(clientes, new OrderByPriceD()); 
        QuickSort.quickSort(clientes, 0, clientes.size() - 1, new OrderByPriceD());
    //    MergeSort.sort(clientes, new OrderByPriceD());
    //    SelectionSort.sort(clientes, new OrdenaPorDesc());
    //    BubbleSort.sort(clientes, new OrderByPriceD());
    //    Collections.sort(clientes, new OrderByPriceD());
        
        System.out.println(clientes.get(clientes.size()-1));
        
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author HP
 */

import java.util.Scanner;
public class maintugas2 {
    public static void main(String[] args) throws Exception {
        int count = 1, to, from;
        boolean jenis;
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis graph");
        System.out.println("1. Directed");
        System.out.println("2. undirected");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        if (pilih == 1){
            System.out.println("Menggunakan Directed");
            jenis = true;
        }else {
            System.out.println("Menggunakan Undirected");
            jenis = false;
        }
        System.out.println("");
        Graph graph = new Graph(6, jenis);
        System.out.print("Masukkan jumlah inputan lintasan: ");
    int jumlah = input.nextInt();
    System.out.println("-----------------------------------------");
    System.out.println("Masukkan edges : ");
    while (count <= jumlah){
        to = input.nextInt();
        from = input.nextInt();
        graph.addEdge(to, from);
        count++;
        
    }
        System.out.println("");
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
}
}
  


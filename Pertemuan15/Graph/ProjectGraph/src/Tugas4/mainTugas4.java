/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainTugas4 {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       Graph graph = new Graph(6);
        graph.addEdge(0, 1, "Malang", "Surabaya");
        graph.addEdge(0, 4, "Malang", "Sidoarjo");
        graph.addEdge(1, 2, "Surabaya", "Lumajang");
        graph.addEdge(1, 3, "Surabaya", "Bandung");
        graph.addEdge(1, 4, "Surabaya", "Sidoarjo");
        graph.addEdge(2, 3, "Lumajang", "Bandung");
        graph.addEdge(3, 4, "Bandung", "Sidoarjo");
        graph.addEdge(3, 0, "Bandung", "Malang");
        System.out.println("");
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
    }
}

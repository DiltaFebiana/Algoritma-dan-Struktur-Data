/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

/**
 *
 * @author HP
 */
public class Node {
    Node next;
    String data; 
    

    public Node(String data, Node berikutnya) {
        this.data = data;
        this.next = berikutnya;
    }
}

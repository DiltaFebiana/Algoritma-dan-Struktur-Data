/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2_1H_DiltaFebiana;

/**
 *
 * @author HP
 */
public class Node {
    Mahasiswa data ;
    Node prev, next;
    
    Node(Node prev, Mahasiswa data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

   
}

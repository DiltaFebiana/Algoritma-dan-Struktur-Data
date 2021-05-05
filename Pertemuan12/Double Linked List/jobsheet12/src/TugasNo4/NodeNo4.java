/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo4;

/**
 *
 * @author HP
 */
public class NodeNo4 {
     Mahasiswa data ;
    NodeNo4 prev, next;
    
    NodeNo4(NodeNo4 prev, Mahasiswa data, NodeNo4 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

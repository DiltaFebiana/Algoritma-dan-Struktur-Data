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
public class node {
 node next,prev;
 String data;
 
 public node(node prev, String data, node next){
    this.next=next;
    this.data=data;
    this.prev=prev;
 }

    
}
